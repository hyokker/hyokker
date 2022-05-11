<%@page contentType="text/html;charset=euc-kr" %>

<!DOCTYPE HTML>
<HTML>
 <HEAD>
  <TITLE>main</TITLE>
 </HEAD>
 <BODY>
	<h1>Main 페이지 입니다.</h1>
	<h2>include 지시자 이용</h2>
	<%@include file="copyright.jsp"%>
	<!-- include 지시자 : 특정 문서를 포함시킬 때 사용
	페이지의 소스를 포함시킴
	-->
	<h2>include 액션 태그 이용</h2>
	<jsp:include page="copyright.jsp"/>
	<!-- include 액션 태그
	소스가 아닌 페이지의 실행결과를 포함시킴
	-->
 </BODY>
</HTML>
