<%@page import="java.sql.SQLException"%>
<%@page import="com.herbmall.board.model.BoardVO"%>
<%@page import="com.herbmall.board.model.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>write_ok.jsp</title>
</head>
<body>
<%
	//write.jsp 에서 post방식으로 submit됨

	//요청 파라미터 읽어오기
	
	request.setCharacterEncoding("utf-8");
	String title=request.getParameter("title");
	String name=request.getParameter("name");
	String pwd=request.getParameter("pwd");
	String email=request.getParameter("email");
	String content=request.getParameter("content");
	
	//ip 읽어오기
	String ip = request.getRemoteAddr();
	System.out.println("ip="+ip);

	ip = request.getRemoteHost();
	System.out.println("ip="+ip);
	
	//2
	BoardDAO dao = new BoardDAO();
	BoardVO vo = new BoardVO();
	vo.setTitle(title);
	vo.setName(name);
	vo.setPwd(pwd);
	vo.setEmail(email);
	vo.setContent(content);
	try{
		int cnt=dao.insertBoard(vo);
		
		//3
		
		if(cnt>0){ %>
			<script type="text/javascript">
			alert("글쓰기 성공");
			location.href="list.jsp";/*response.sendRedirect로 보내면 서버에서 실행되서 안됨  */
			</script>		
		<%}else{%>
			<script type="text/javascript">
			alert("글쓰기 실패");
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