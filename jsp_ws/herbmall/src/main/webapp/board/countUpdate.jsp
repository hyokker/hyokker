<%@page import="java.sql.SQLException"%>
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
	//list.jsp 에서 제목 클릭하면 get방식으로 이동
	//http://localhost:9090/herbmall/board/countUpdate.jsp?no=10
	//1 요청 파라미터 읽어오기
	String no = request.getParameter("no");
		if(no==null||no.isEmpty()){%>
		<script type="text/javascript">
			alert("잘못된 url 입니다.");
			history.back();
			</script>
		<% return;
}
	
	//2
	BoardDAO dao = new BoardDAO();
	try{
		int cnt = dao.updateCount(Integer.parseInt(no));
		
		//3
		if(cnt>0){
			response.sendRedirect("detail.jsp?no="+no);
		}else{%>
			<script type="text/javascript">
				alert("조회수 증가 실패!");
				history.back();
			</script>
	<%	}
	}catch(SQLException e){
		e.printStackTrace();
	}
	
	
	//3
%>
</body>
</html>