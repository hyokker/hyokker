<%@page contentType="text/html;charset=euc-kr" %>

<!DOCTYPE HTML>
<HTML>
 <HEAD>
  <TITLE> test01.jsp </TITLE>
 </HEAD>
 <BODY>
  <h1>�����, ��ũ��Ʈ��, ǥ����</h1>
  <%!
	//����� - ��������� �޽ô��� �����ϴ� �κ�
	String id="hong"; //�������

	//�޼���
	public int add(int a, int b){
		return a+b;
	}
  %>

  <%
	//��ũ�� Ʈ�� - jsp�ڵ� ���, ���⿡�� ����� ������ ��� ����������
	String str="hello jsp";//��������

	out.print("<hr>");
	out.print("<h2>��ũ��Ʈ�� �κ�</h2>");
	out.print("<p>������� id : "+ id+"</p>");
	out.print("<p>�������� str : "+ str+"</p>");
	out.print("<p>add()�޼��� ȣ��</p>");

	int n1=10, n2=30;
	int sum=add(n1,n2);
	out.print("<p>������ �� : "+ sum+"</p>");
  %>
  <hr>
  <h3>ǥ����</h3>
  <p>str = <%=str%></p>
 </BODY>
</HTML>
