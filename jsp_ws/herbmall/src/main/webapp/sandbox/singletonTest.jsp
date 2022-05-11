<%@page import="com.herbmall.test.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sandbox/singletonTest.jsp</title>
</head>
<body>
	<h1>싱글톤 패턴 </h1>
	
<%
	//Person p = new Person(); //error:The constructor Person() is not visible
	Person p = Person.getInstance();
	out.print(p);
	
	p.showInfo();
%>	
</body>
</html>






