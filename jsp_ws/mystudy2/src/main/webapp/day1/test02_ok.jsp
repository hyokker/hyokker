<%@ page contentType = "text/html; charset=euc-kr" %>

<!DOCTYPE HTML>
<HTML>
 <HEAD>
  <TITLE>test02_ok.jsp</TITLE>
 </HEAD>
 <BODY>
  <%
	//post방식
	//요청 파라미터에 대한 한글 인코딩 처리
	request.setCharacterEncoding("euc-kr");
	//1.요청 파라미터 읽어오기
	String name=request.getParameter("name");
	String address=request.getParameter("address");
	String agree=request.getParameter("agree");
	String[] petArr=request.getParameterValues("pet");

	if(petArr!=null){
		out.print("<h2>좋아하는 동물</h2>");
		for(int i=0;i<petArr.length;i++){
			out.print("<p>"+petArr[i]+"</p>");
		}
	}
	//2.db작업
	
	//3.결과처리
  %>
  <h1>요청 파라미터들</h1>
	<p>이름 - <%=name%></p>
	<p>주소 - <%=address%></p>
	<p>동의여부 - <%=agree%></p>
 </BODY>
</HTML>
