<%@ page contentType = "text/html; charset=euc-kr" %>
<!DOCTYPE HTML>
<HTML>
 <HEAD>
  <TITLE> test03.jsp </TITLE>
 </HEAD>
 <BODY>
  <%
	//get������� �̵�
	//http://192.168.0.102:9090/testsite/day1/test03.jsp?no=7&name=hong
	//1.��û �Ķ���� �о����
	String no=request.getParameter("no");
	String name=request.getParameter("name");
	//2.db�۾�

	//3.��� ó��
  %>

  <h1>get-��û �Ķ���͵�</h1>
  <p>��ȣ : <%=no%></p>
  <p>�̸� : <%=name%></p>

 </BODY>
</HTML>
