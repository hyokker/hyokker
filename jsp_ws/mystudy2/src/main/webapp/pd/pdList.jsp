<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.mystudy2.pd.model.PdDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.mystudy2.pd.model.PdDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
	//[1] pdWrite.jsp ���� ��ǰ��� ��ư�� ���� get������� �̵�    
	//[2] pdWrite.jsp ���� ��� �����ϸ� get������� �̵�   
	
	//1.��û �Ķ���� �о����
	//�Ķ���Ͱ� ������ �н�	
	//2.db�۾�
		PdDAO dao = new PdDAO();
		List<PdDTO> list=null;
		try{
		list=dao.selectAll();
		}catch(SQLException e){
			e.printStackTrace();
		}
		//3.���ó��
    	DecimalFormat df = new DecimalFormat("#,###");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String s=df.format(12300);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>pdList.jsp</title>
</head>
<body>
	<h1>��ǰ ���</h1>
	<table border="1" style="width:500px">
		<tr>
			<th>��ȣ</th>
			<th>��ǰ��</th>
			<th>��ǰ����</th>
			<th>�����</th>
		</tr>
		<!--�ݺ� ���� -->
		 <!-- ��ũ��Ʈ������ �ڹ� �ڵ带 ��Ÿ������ ǥ���� ��� -->
		<%
			for(int i=0;i<list.size();i++){
				PdDTO dto=list.get(i);%>
				<tr>
					<td><%=dto.getNo() %></td>				
					<td><a href="pdDetail.jsp?no=<%=dto.getNo() %>">
					<%=dto.getPdName() %>
					</a></td>				
					<td style="text-align: right">
						<%=df.format(dto.getPrice()) %></td>				
					<td><%=sdf.format(dto.getRegdate()) %></td>				
				</tr>
				
				
		<% 	}//for %>
			
		
		

		<!--�ݺ� �ݺ� �� -->
	
	</table>
	<br>
	
	<a href="pdWrite.jsp">��ǰ ���</a>	
	<!--�� ����� ��� �Դ��� ��� �˰��ֱ�.  -->
</body>
</html>