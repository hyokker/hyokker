<%@page import="com.herbmall.reboard.model.ReBoardVO"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.herbmall.reboard.model.ReBoardDAO"%>
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
	//edit.jsp에서 post방식으로 서브밋
	//1
	request.setCharacterEncoding("utf-8");
	String no=request.getParameter("no");
	String title=request.getParameter("title");
	String name=request.getParameter("name");
	String pwd=request.getParameter("pwd");
	String email=request.getParameter("email");
	String content=request.getParameter("content");
		
	//2
	ReBoardDAO dao=new ReBoardDAO();
	ReBoardVO vo=new ReBoardVO();
	vo.setContent(content);
	vo.setEmail(email);
	vo.setName(name);
	vo.setPwd(pwd);
	vo.setTitle(title);
	vo.setNo(Integer.parseInt(no));
	
	try{
		int cnt=dao.updateReBoard(vo);	
		//3
		if(cnt>0){%>
			<script type="text/javascript">
				alert('글 수정 성공!');
				location.href="detail.jsp?no=<%=no%>";
			</script>
		<%}else{%>
			<script type="text/javascript">
				alert('글 수정 실패!');
				history.go(-1);
			</script>			
		<%}
	}catch(SQLException e){
		e.printStackTrace();
	}
	
	
%>
</body>
</html>