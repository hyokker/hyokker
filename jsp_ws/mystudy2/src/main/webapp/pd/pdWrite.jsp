<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>pdWrite.jsp</title>
</head>
<body>
	<h1>��ǰ ���</h1>
	<form method="post" action="pdWrite_ok.jsp">
		��ǰ�� : <input type="text" name="pdName"><br>
		���� : <input type="text" name="price"><br><br>
		<input type="submit" value="���">
		<input type="reset" value="���">
		
	</form>
	<br>
	<a href="pdList.jsp">��ǰ ���</a>
</body>
</html>