<%@page import="com.mystudy2.pd.model.PdDTO"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.mystudy2.pd.model.PdDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	//pdDetail에서 수정버튼을 클릭했더니 get 방식으로 이동
	//1 요청파라미터 읽어오기
	//http://localhost:9090/mystudy2/pd/pdEdit.jsp?no=9
    	String no=request.getParameter("no");
	
	//2 db작업
		PdDAO dao = new PdDAO();
		PdDTO dto = new PdDTO();
		try{
			dto=dao.selectByNo(Integer.parseInt(no));
		}catch(SQLException e){
			e.printStackTrace();
		}
	//3 결과처리
%>
<h1>상품 수정</h1>
	<form method="post" action="pdEdit_ok.jsp">
		<!--수정 처리시 필요한 no를 hidden field 필드에 넣어준다  -->
		<input type="hidden" name="no" value="<%=no%>">
		상품명 : <input type="text" name="pdName" value="<%=dto.getPdName()%>"><br>
		가격 : <input type="text" name="price" value="<%=dto.getPrice()%>"><br><br>
		<input type="submit" value="수정">
		<input type="reset" value="취소">
		
	</form>
	<br>
	<a href="pdList.jsp">상품 목록</a>
</body>
</html>