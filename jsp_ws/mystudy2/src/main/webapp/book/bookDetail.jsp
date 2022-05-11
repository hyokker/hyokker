<%@page import="java.sql.SQLException"%>
<%@page import="com.mystudy2.book.model.BookDTO"%>
<%@page import="com.mystudy2.book.model.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%
    
    	//bookList.jsp에서 상품명을 눌러 get방식으로 이동
    	//http://localhost:9090/mystudy2/book/bookDetail.jsp?no=6
    	//1.요청 파라미터 읽어오기
    	String no=request.getParameter("no");
    	//2.db작업
    	BookDAO dao = new BookDAO();
    	BookDTO dto=null;
    	try{		
    	dto=dao.selectByNo(Integer.parseInt(no));
    	//3.결과처리
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
	<h1>상품 상세보기</h1>
		<p>번호 :<%=dto.getNo() %></p>
		<p>책 제목 :<%=dto.getTitle() %> </p>
		<p>책 가격 :<%=dto.getPrice() %> </p>
		<p>출판사 :<%=dto.getPublisher() %> </p>
		<p>등록일 :<%=dto.getJoindate() %> </p>
		<hr>
		<a href="bookList.jsp">목록</a>|<a href="bookEdit.jsp">수정</a>|<a href="bookDel.jsp">삭제</a>
</body>
</html>