<%@ page contentType = "text/html; charset=euc-kr" %>

<!DOCTYPE HTML>
<HTML>
 <HEAD>
  <TITLE> exam.jsp </TITLE>
 </HEAD>
 <BODY>
 <form action="exam.jsp" method="post">
	��ȣ : <input type="text"><br>
	���� : <input type="radio">�ѽ� <input type="radio">�߽� <input type="radio">�Ͻ�<br>
	���� : <select name="local">
		<option>����</option>
		<option>���</option>
		<option>����</option>
		<option>�λ�</option>
		<option>����</option>
		</select><br>
	<input type="checkbox">���� 	<input type="checkbox"> ���� 	<input type="checkbox"> �ý��� <br>
	��ġ : <input type="textarea" width="100px" height="30px"><br>
	<input type="submit" value="Ȯ��" style="text-align=center">
	
 </form>
 </BODY>
</HTML>
