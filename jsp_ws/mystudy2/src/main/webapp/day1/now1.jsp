<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page import="java.util.*"%>
<!-- page ������(��Ƽ��) - page�� ���� ���� ���� -->
<%
	//��ũ��Ʈ�� - jsp �ڵ带 �ִ� ��
	Date d = new Date();
	String str=d.toLocaleString();
	out.print(str);
	// out=> jsp�� ���� ��ü, out.print() =? �� �������� ����϶�� ��

	/*�ڹ��� ���� �� �ּ�*/
	//�ڹ��� ���� �ּ�
	//jsp�� �������� ���� ����ȴ�.
	//http://192.168.0.102:9090/testsite/now1.jsp
%>

<!DOCTYPE HTML>
<HTML>
 <HEAD>
  <TITLE> jsp ����1 </TITLE>
 </HEAD>
 <BODY>
	<h1>jsp ������</h1>
	<p>���� ��¥ : <%=d %></p>
	<!--ǥ���� => out.print(d)�� ���� --> 

	<!--html �ּ� -->
	<%--jsp �ּ� --%>
 </BODY>
</HTML>

<!-- http://localhost:9090/testsite/now1.jsp
	 http://192.168.0.100:9090/testsite/now1.jsp
		1) ip �ּҿ� �ش��ϴ� ��ǻ�͸� ã�´�
		2) port�� ����ϴ� ���α׷� ��Ĺ�� ã��
		3) �⺻���丮 webapps ���� testsite ���� ã��
		4) ���� jsp ����ã�� �������� ����
		5) ����� html �������� Ŭ���̾�Ʈ�� ����������. �������� �����ؼ� �����ش�.-->
