<%@ page contentType = "text/html; charset=euc-kr" %>

<!DOCTYPE HTML>
<HTML>
 <HEAD>
  <TITLE>test02_ok.jsp</TITLE>
 </HEAD>
 <BODY>
  <%
	//post���
	//��û �Ķ���Ϳ� ���� �ѱ� ���ڵ� ó��
	request.setCharacterEncoding("euc-kr");
	//1.��û �Ķ���� �о����
	String name=request.getParameter("name");
	String address=request.getParameter("address");
	String agree=request.getParameter("agree");
	String[] petArr=request.getParameterValues("pet");

	if(petArr!=null){
		out.print("<h2>�����ϴ� ����</h2>");
		for(int i=0;i<petArr.length;i++){
			out.print("<p>"+petArr[i]+"</p>");
		}
	}
	//2.db�۾�
	
	//3.���ó��
  %>
  <h1>��û �Ķ���͵�</h1>
	<p>�̸� - <%=name%></p>
	<p>�ּ� - <%=address%></p>
	<p>���ǿ��� - <%=agree%></p>
 </BODY>
</HTML>
