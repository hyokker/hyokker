<%@page import="com.mystudy2.pd.model.PdDTO"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.mystudy2.pd.model.PdDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	//pdDetail���� ������ư�� Ŭ���ߴ��� get ������� �̵�
	//1 ��û�Ķ���� �о����
	//http://localhost:9090/mystudy2/pd/pdEdit.jsp?no=9
    	String no=request.getParameter("no");
	
	//2 db�۾�
		PdDAO dao = new PdDAO();
		PdDTO dto = new PdDTO();
		try{
			dto=dao.selectByNo(Integer.parseInt(no));
		}catch(SQLException e){
			e.printStackTrace();
		}
	//3 ���ó��
%>
<h1>��ǰ ����</h1>
	<form method="post" action="pdEdit_ok.jsp">
		<!--���� ó���� �ʿ��� no�� hidden field �ʵ忡 �־��ش�  -->
		<input type="hidden" name="no" value="<%=no%>">
		��ǰ�� : <input type="text" name="pdName" value="<%=dto.getPdName()%>"><br>
		���� : <input type="text" name="price" value="<%=dto.getPrice()%>"><br><br>
		<input type="submit" value="����">
		<input type="reset" value="���">
		
	</form>
	<br>
	<a href="pdList.jsp">��ǰ ���</a>
</body>
</html>