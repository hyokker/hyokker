<%@ page contentType = "text/html; charset=euc-kr" %>
<html>
<head><title>�� ����</title></head>
<body>
<h1>request ��ü ����</h1> 
<form action="test02_ok.jsp" method="post">
�̸�: <input type="text" name="name" > <br>
�ּ�: <input type="text" name="address" > <br>
�����ϴ� ����:
   <input type="checkbox" name="pet" value="dog">������
   <input type="checkbox" name="pet" value="cat">�����
   <input type="checkbox" name="pet" value="pig">����<br>
   �����մϴ�<input type="checkbox" name="agree">
   <br><br>
   <input type="submit" value="����">
</form> <br>
<a href="test03.jsp?no=7&name=ȫ�浿">test03 �������� �̵��ϱ�</a>
<!--get���-->
</body>
</html>