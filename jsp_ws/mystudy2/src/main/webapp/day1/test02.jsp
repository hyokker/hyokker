<%@ page contentType = "text/html; charset=euc-kr" %>
<html>
<head><title>폼 생성</title></head>
<body>
<h1>request 객체 연습</h1> 
<form action="test02_ok.jsp" method="post">
이름: <input type="text" name="name" > <br>
주소: <input type="text" name="address" > <br>
좋아하는 동물:
   <input type="checkbox" name="pet" value="dog">강아지
   <input type="checkbox" name="pet" value="cat">고양이
   <input type="checkbox" name="pet" value="pig">돼지<br>
   동의합니다<input type="checkbox" name="agree">
   <br><br>
   <input type="submit" value="전송">
</form> <br>
<a href="test03.jsp?no=7&name=홍길동">test03 페이지로 이동하기</a>
<!--get방식-->
</body>
</html>