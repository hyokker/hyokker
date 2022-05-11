<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.mystudy2.book.model.BookDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.mystudy2.book.model.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
	<%
		//[1]bookWrite.jsp���� å ��� ��ư�� ���� get ������� �̵�
		//[2]bookWrite.jsp���� ��� �����ϸ� get������� �̵�
		
		//1.��û �Ķ���� �о����
		//�Ķ���Ͱ� ������ �н�
		//2.db����
		BookDAO dao=new BookDAO();
		List<BookDTO> list=null;
		try{
		//3.���ó��
		list=dao.selectAll();
		
		}catch(SQLException e){
			e.printStackTrace();
		}
		//õ������ ������, �������
    	DecimalFormat df = new DecimalFormat("#,###");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>å ���</h1>
		<table border="1" style="width:500px">
			<tr>
				<th>��ȣ</th>
				<th>å ����</th>
				<th>����</th>
				<th>���ǻ�</th>
				<th>�����</th>
			</tr>
		<!-- �ݺ� ���� -->
		<!-- ��ũ��Ʈ������ �ڹ� �ڵ带 ��Ÿ������ ǥ���� ��� -->
		<%
			for(int i=0;i<list.size();i++){
				BookDTO dto=list.get(i);%>
			<tr>
				<td><%=dto.getNo() %></td>
				<td><a href="bookDetail.jsp?no=<%=dto.getNo()%>">
				<%=dto.getTitle() %></a></td>
				<td style="text-align:right">
				<%=df.format(dto.getPrice()) %></td>
				<td><%=dto.getPublisher() %></td>
				<td><%=sdf.format(dto.getJoindate()) %></td>
			</tr>	
		
		
			<% } //for %>
		<!-- �ݺ� �� -->
		</table>
		<br>
		<a href="bookWrite.jsp">å ���</a>	
	<!--�� ����� ��� �Դ��� ��� �˰��ֱ�.  -->
</body>
</html>