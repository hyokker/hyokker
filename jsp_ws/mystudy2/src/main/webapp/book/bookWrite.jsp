<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>책 등록</h1>
	<form method="post" action="bookWrite_ok.jsp">
		책 제목 : <input type="text" name="title"><br>
		책 가격 : <input type="text" name="price"><br>
		출판사 : <input type="text" name="publisher"><br><br>
		<input type="submit" value="등록">
		<input type="reset" value="취소">
		
	</form>
	<br>
	<a href="bookList.jsp">책 목록</a>
</body>
</html>