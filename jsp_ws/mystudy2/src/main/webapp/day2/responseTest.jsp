<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>responseTest.jsp</title>
</head>
<body>
	<h1>현재 페이지 - responseTest.jsp </h1>
	
	<%
		response.sendRedirect("../day1/test02.jsp");
	%>
</body>
</html>