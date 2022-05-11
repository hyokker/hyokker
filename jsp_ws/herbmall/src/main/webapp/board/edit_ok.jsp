<%@page import="java.sql.SQLException"%>
<%@page import="com.herbmall.board.model.BoardVO"%>
<%@page import="com.herbmall.board.model.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>edit_ok.jsp</title>
</head>
<body>
	<%
		//edit.jsp 에서 수정 버튼으로 post방식으로 이동
		//post는 인코딩 방식 체크
		request.setCharacterEncoding("utf-8");
		//1 요청 파라미터 읽어오기
		String no = request.getParameter("no");
		String name = request.getParameter("name");
		String title = request.getParameter("title");
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		String content = request.getParameter("content");
		//2 db 작업
		BoardDAO dao = new BoardDAO();
		BoardVO vo = new BoardVO();
		
		vo.setNo(Integer.parseInt(no));
		vo.setName(name);
		vo.setTitle(title);
		vo.setEmail(email);
		vo.setPwd(pwd);
		vo.setContent(content);
		
		try{
			int cnt=dao.updateBoard(vo);
			//3
				if(cnt>0){ %>
					<script type="text/javascript">
					alert("글 수정 성공");
					location.href="detail.jsp?no=<%=no%>";
					</script>		
				<%}else{%>
					<script type="text/javascript">
					alert("글 수정 실패!");
					history.go(-1);
			</script>
		<%}
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		
		//3
	%>
</body>
</html>