<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page import="java.util.*"%>
<!-- page 지시자(디렉티브) - page에 대한 정보 설정 -->
<%
	//스크립트릿 - jsp 코드를 넣는 곳
	Date d = new Date();
	String str=d.toLocaleString();
	out.print(str);
	// out=> jsp의 내장 객체, out.print() =? 웹 브라우저에 출력하라는 것

	/*자바의 여러 줄 주석*/
	//자바의 한줄 주석
	//jsp는 서버에서 먼저 실행된다.
	//http://192.168.0.102:9090/testsite/now1.jsp
%>

<!DOCTYPE HTML>
<HTML>
 <HEAD>
  <TITLE> jsp 연습1 </TITLE>
 </HEAD>
 <BODY>
	<h1>jsp 페이지</h1>
	<p>현재 날짜 : <%=d %></p>
	<!--표현식 => out.print(d)와 동일 --> 

	<!--html 주석 -->
	<%--jsp 주석 --%>
 </BODY>
</HTML>

<!-- http://localhost:9090/testsite/now1.jsp
	 http://192.168.0.100:9090/testsite/now1.jsp
		1) ip 주소에 해당하는 컴퓨터를 찾는다
		2) port를 사용하는 프로그램 톰캣을 찾음
		3) 기본디렉토리 webapps 에서 testsite 폴더 찾음
		4) 이후 jsp 파일찾고 서버에서 실행
		5) 결과는 html 형식으로 클라이언트에 내려보낸다. 브라우저가 실행해서 보여준다.-->
