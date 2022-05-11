<%@ page contentType = "text/html; charset=euc-kr" %>
<!DOCTYPE HTML>
<HTML>
 <HEAD>
  <TITLE> test03.jsp </TITLE>
 </HEAD>
 <BODY>
  <%
	//get방식으로 이동
	//http://192.168.0.102:9090/testsite/day1/test03.jsp?no=7&name=hong
	//1.요청 파라미터 읽어오기
	String no=request.getParameter("no");
	String name=request.getParameter("name");
	//2.db작업

	//3.결과 처리
  %>

  <h1>get-요청 파라미터들</h1>
  <p>번호 : <%=no%></p>
  <p>이름 : <%=name%></p>

 </BODY>
</HTML>
