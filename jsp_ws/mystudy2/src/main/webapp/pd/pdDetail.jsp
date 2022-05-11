<%@page import="com.mystudy2.pd.model.PdDTO"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.mystudy2.pd.model.PdDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	//pdList.jsp에서 [상품명]클릭하면 get방식으로 이동
	//==>http://localhost:9090/mystudy2/pd/pdDetail.jsp?no=7
	//1 요청 파라미터 읽어오기
		String no=request.getParameter("no");
	
	//2 db작업
		PdDAO dao = new PdDAO();
		PdDTO dto =null;
		try{
			dto=dao.selectByNo(Integer.parseInt(no));
		}catch(SQLException e){
			e.printStackTrace();
		}
	//3 결과처리


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="../js/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('#del').click(function(){
			if(confirm('삭제하시겠습니까?')){
				location.href="pdDelete.jsp?no=<%=no%>";
			}
		});
	});
</script>
</head>
<body>


	<h1>상품 상세보기</h1>
	<p>번호 : <%=dto.getNo() %></p>
	<p>상품명 : <%=dto.getPdName() %></p>
	<p>가격 : <%=dto.getPrice() %></p>
	<p>등록일 : <%=dto.getRegdate() %></p>
	<br>
	<a href="pdList.jsp">목록</a> |
	<a href="pdEdit.jsp?no=<%=no%>">수정</a> |
	<a href="#" id="del">삭제</a>
	<!--?파라미터명=값1&파라미터명=값2  -->
	
</body>
</html>