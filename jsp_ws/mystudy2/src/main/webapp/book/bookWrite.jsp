<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>å ���</h1>
	<form method="post" action="bookWrite_ok.jsp">
		å ���� : <input type="text" name="title"><br>
		å ���� : <input type="text" name="price"><br>
		���ǻ� : <input type="text" name="publisher"><br><br>
		<input type="submit" value="���">
		<input type="reset" value="���">
		
	</form>
	<br>
	<a href="bookList.jsp">å ���</a>
</body>
</html>