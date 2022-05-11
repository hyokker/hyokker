<%@ page contentType = "text/html; charset=euc-kr" %>

<!DOCTYPE HTML>
<HTML>
 <HEAD>
  <TITLE> exam.jsp </TITLE>
 </HEAD>
 <BODY>
 <form action="exam.jsp" method="post">
	상호 : <input type="text"><br>
	업종 : <input type="radio">한식 <input type="radio">중식 <input type="radio">일식<br>
	지역 : <select name="local">
		<option>서울</option>
		<option>경기</option>
		<option>대전</option>
		<option>부산</option>
		<option>광주</option>
		</select><br>
	<input type="checkbox">주차 	<input type="checkbox"> 쿠폰 	<input type="checkbox"> 시식평 <br>
	위치 : <input type="textarea" width="100px" height="30px"><br>
	<input type="submit" value="확인" style="text-align=center">
	
 </form>
 </BODY>
</HTML>
