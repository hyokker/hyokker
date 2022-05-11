<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.mystudy2.book.model.BookDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.mystudy2.book.model.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
	<%
		//[1]bookWrite.jsp에서 책 목록 버튼을 눌러 get 방식으로 이동
		//[2]bookWrite.jsp에서 등록 성공하면 get방식으로 이동
		
		//1.요청 파라미터 읽어오기
		//파라미터가 없으면 패스
		//2.db연결
		BookDAO dao=new BookDAO();
		List<BookDTO> list=null;
		try{
		//3.결과처리
		list=dao.selectAll();
		
		}catch(SQLException e){
			e.printStackTrace();
		}
		//천원단위 구분자, 등록일자
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
	<h1>책 목록</h1>
		<table border="1" style="width:500px">
			<tr>
				<th>번호</th>
				<th>책 제목</th>
				<th>가격</th>
				<th>출판사</th>
				<th>등록일</th>
			</tr>
		<!-- 반복 시작 -->
		<!-- 스크립트릿에서 자바 코드를 나타내려면 표현식 사용 -->
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
		<!-- 반복 끝 -->
		</table>
		<br>
		<a href="bookWrite.jsp">책 등록</a>	
	<!--글 목록이 어떻게 왔는지 경로 알고있기.  -->
</body>
</html>