<%@page import="com.mystudy2.pd.model.PdDTO"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.mystudy2.pd.model.PdDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	//pdList.jsp���� [��ǰ��]Ŭ���ϸ� get������� �̵�
	//==>http://localhost:9090/mystudy2/pd/pdDetail.jsp?no=7
	//1 ��û �Ķ���� �о����
		String no=request.getParameter("no");
	
	//2 db�۾�
		PdDAO dao = new PdDAO();
		PdDTO dto =null;
		try{
			dto=dao.selectByNo(Integer.parseInt(no));
		}catch(SQLException e){
			e.printStackTrace();
		}
	//3 ���ó��


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="../js/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('#del').click(function(){
			if(confirm('�����Ͻðڽ��ϱ�?')){
				location.href="pdDelete.jsp?no=<%=no%>";
			}
		});
	});
</script>
</head>
<body>


	<h1>��ǰ �󼼺���</h1>
	<p>��ȣ : <%=dto.getNo() %></p>
	<p>��ǰ�� : <%=dto.getPdName() %></p>
	<p>���� : <%=dto.getPrice() %></p>
	<p>����� : <%=dto.getRegdate() %></p>
	<br>
	<a href="pdList.jsp">���</a> |
	<a href="pdEdit.jsp?no=<%=no%>">����</a> |
	<a href="#" id="del">����</a>
	<!--?�Ķ���͸�=��1&�Ķ���͸�=��2  -->
	
</body>
</html>