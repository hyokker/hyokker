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
	//bookWrite.jsp 에서 post 방식으로 submit
	//한글이 있을수 있어서 post방식은 encoding을 해야함
	request.setCharacterEncoding("euc-kr");

	//1.요청 파라미터 읽어오기
	String title=request.getParameter("title");
	String price=request.getParameter("price");
	String publisher=request.getParameter("publisher");
	//2.db 연결
	BookDTO dto = new BookDTO();
	dto.setTitle(title);
	dto.setPrice(Integer.parseInt(price));
	dto.setPublisher(publisher);
	BookDAO dao = new BookDAO();
	
	try{
	//3.결과처리
		int cnt = dao.insertBook(dto);
	
		if(cnt>0){
			response.sendRedirect("bookList.jsp");
		}else{
			System.out.println("등록 실패");
			response.sendRedirect("bookWrite.jsp");
		}
	}catch(SQLException e){
		e.printStackTrace();
	}

%>
</body>
</html>