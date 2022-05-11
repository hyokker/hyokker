<%@page import="java.sql.SQLException"%>
<%@page import="com.herbmall.board.model.BoardVO"%>
<%@page import="com.herbmall.board.model.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//delete.jsp에서 post 방식으로 이동

	
	//post방식은 요청문서에 인코딩 해야함
	request.setCharacterEncoding("utf-8");
	
	//1 요청 파라미터 읽어오기
	String no = request.getParameter("no");
 	String pwd = request.getParameter("pwd");
	//2 db작업
	BoardDAO dao = new BoardDAO();
	
	try{
		int cnt=dao.deleteBoard(Integer.parseInt(no),pwd);			
			if(cnt>0){%>
				<script type="text/javascript">
					alert('삭제 성공');
					location.href="list.jsp";
				</script>
			<%}else{%>
				<script type="text/javascript">
					alert('삭제 실패');
					history.back();
				</script>
			
			<%}
	}catch(SQLException e){
		e.printStackTrace();
	}
	//3


%>
</body>
</html>