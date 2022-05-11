<%@page import="java.sql.SQLException"%>
<%@page import="com.herbmall.reboard.model.ReBoardVO"%>
<%@page import="com.herbmall.reboard.model.ReBoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>reply_ok.jsp</title>
</head>
<body>
<%
	//write.jsp 에서 답변 버튼 눌러서 post방식으로 전송
	request.setCharacterEncoding("utf-8");
	//1
	String title=request.getParameter("title");	
	String name=request.getParameter("name");	
	String pwd=request.getParameter("pwd");	
	String email=request.getParameter("email");	
	String content=request.getParameter("content");	

	String groupNo=request.getParameter("groupNo");	
	String step=request.getParameter("step");	
	String sortNo=request.getParameter("sortNo");	
	
	//2
	ReBoardDAO dao = new ReBoardDAO();
	ReBoardVO vo = new ReBoardVO();
	vo.setTitle(title);
	vo.setName(name);
	vo.setPwd(pwd);
	vo.setEmail(email);
	vo.setContent(content);
	
	vo.setGroupNo(Integer.parseInt(groupNo));
	vo.setStep(Integer.parseInt(step));
	vo.setSortNo(Integer.parseInt(sortNo));
	try{
		int cnt=dao.reply(vo);
		//ok.jsp에서는 결과처리로 바로 이동할 수 있도록 한다.
		if(cnt>0){%>
			<script type="text/javascript">
				alert("답변 등록 성공");
				location.href="list.jsp";
			</script>
		<%}else{ %>
			<script type="text/javascript">
				alert("답변 등록 실패");
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