<%@page import="java.sql.SQLException"%>
<%@page import="com.mystudy2.book.model.BookDTO"%>
<%@page import="com.mystudy2.book.model.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%
    
    	//bookList.jsp���� ��ǰ���� ���� get������� �̵�
    	//http://localhost:9090/mystudy2/book/bookDetail.jsp?no=6
    	//1.��û �Ķ���� �о����
    	String no=request.getParameter("no");
    	//2.db�۾�
    	BookDAO dao = new BookDAO();
    	BookDTO dto=null;
    	try{		
    	dto=dao.selectByNo(Integer.parseInt(no));
    	//3.���ó��
    	}catch(SQLException e){
    		e.printStackTrace();
    	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>��ǰ �󼼺���</h1>
		<p>��ȣ :<%=dto.getNo() %></p>
		<p>å ���� :<%=dto.getTitle() %> </p>
		<p>å ���� :<%=dto.getPrice() %> </p>
		<p>���ǻ� :<%=dto.getPublisher() %> </p>
		<p>����� :<%=dto.getJoindate() %> </p>
		<hr>
		<a href="bookList.jsp">���</a>|<a href="bookEdit.jsp">����</a>|<a href="bookDel.jsp">����</a>
</body>
</html>