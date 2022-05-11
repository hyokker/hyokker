<%@page import="java.sql.SQLException"%>
<%@page import="com.mystudy2.book.model.BookDAO"%>
<%@page import="com.mystudy2.book.model.BookDTO"%>
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
	//bookWrite.jsp ���� post ������� submit
	//�ѱ��� ������ �־ post����� encoding�� �ؾ���
	request.setCharacterEncoding("euc-kr");

	//1.��û �Ķ���� �о����
	String title=request.getParameter("title");
	String price=request.getParameter("price");
	String publisher=request.getParameter("publisher");
	//2.db ����
	BookDTO dto = new BookDTO();
	dto.setTitle(title);
	dto.setPrice(Integer.parseInt(price));
	dto.setPublisher(publisher);
	BookDAO dao = new BookDAO();
	
	try{
	//3.���ó��
		int cnt = dao.insertBook(dto);
	
		if(cnt>0){
			response.sendRedirect("bookList.jsp");
		}else{
			System.out.println("��� ����");
			response.sendRedirect("bookWrite.jsp");
		}
	}catch(SQLException e){
		e.printStackTrace();
	}

%>
</body>
</html>