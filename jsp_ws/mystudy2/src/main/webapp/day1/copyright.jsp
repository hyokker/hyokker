<%@page contentType="text/html;charset=euc-kr" %>
<%@page import="java.util.*"%>

<hr>
<%
	Date Date = new Date();
%>
<h2>페이지 하단</h2>
<h3>오늘 날짜 - <%=Date.toLocaleString()%></h3>
<p>copyrigth &copy; testsite.com all right reserved.</p>
<!--http://192.168.0.102:9090/testsite/day1/copyright.jsp -->