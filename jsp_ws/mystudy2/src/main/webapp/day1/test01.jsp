<%@page contentType="text/html;charset=euc-kr" %>

<!DOCTYPE HTML>
<HTML>
 <HEAD>
  <TITLE> test01.jsp </TITLE>
 </HEAD>
 <BODY>
  <h1>선언부, 스크립트릿, 표현식</h1>
  <%!
	//선언부 - 멤버변수나 메시더를 선언하는 부분
	String id="hong"; //멤버변수

	//메서드
	public int add(int a, int b){
		return a+b;
	}
  %>

  <%
	//스크립 트릿 - jsp코드 사용, 여기에서 선언된 변수는 모두 지역변수임
	String str="hello jsp";//지역변수

	out.print("<hr>");
	out.print("<h2>스크립트릿 부분</h2>");
	out.print("<p>멤버변수 id : "+ id+"</p>");
	out.print("<p>지역변수 str : "+ str+"</p>");
	out.print("<p>add()메서드 호출</p>");

	int n1=10, n2=30;
	int sum=add(n1,n2);
	out.print("<p>도수의 합 : "+ sum+"</p>");
  %>
  <hr>
  <h3>표현식</h3>
  <p>str = <%=str%></p>
 </BODY>
</HTML>
