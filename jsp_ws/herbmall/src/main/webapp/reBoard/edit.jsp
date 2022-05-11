<%@page import="java.sql.SQLException"%>
<%@page import="com.herbmall.reboard.model.ReBoardVO"%>
<%@page import="com.herbmall.reboard.model.ReBoardDAO"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<!DOCTYPE html>
<html lang="ko">
<head>
<title>답변형게시판 글 수정 - 허브몰</title>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="../css/mainstyle.css" />
<link rel="stylesheet" type="text/css" href="../css/clear.css" />
<link rel="stylesheet" type="text/css" href="../css/formLayout.css" />
<link rel="stylesheet" type="text/css" href="../css/mystyle.css" />

<script type="text/javascript">

</script>

</head>
<body>

<%
	//detail.jsp에서 get방식으로 이동
	//=> http://192.168.0.100:9090/herbmall/reBoard/edit.jsp?no=2
	//1
	String no=request.getParameter("no");
	if(no==null || no.isEmpty()){%>
		<script type="text/javascript">
			alert('잘못된 url입니다.');
			location.href="list.jsp";
		</script>
		
	<%	return;
	}
	
	//2
	ReBoardDAO dao=new ReBoardDAO();
	ReBoardVO vo=null;
	try{
		vo=dao.selectByNo(Integer.parseInt(no));	
	}catch(SQLException e){
		e.printStackTrace();
	}
	
	//3
	String content=vo.getContent();
	String email=vo.getEmail();
	if(content==null) content="";
	if(email==null) email="";
	
%>  

<div class="divForm">
<form name="frmEdit" method="post" action="edit_ok.jsp">
	<!-- 수정 처리시 필요한 no를 hidden 필드에 넣어준다 --> 
	<input type="hidden" name="no" value="<%=no %>" />
	
    <fieldset>
	<legend>글수정</legend>
        <div class="firstDiv">
            <label for="title">제목</label>
            <input type="text" id="title" name="title" 
            	value="<%=vo.getTitle() %>" />
        </div>
        <div>
            <label for="name">작성자</label>
            <input type="text" id="name" name="name" 
            	value="<%=vo.getName() %>"/>
        </div>
        <div>
            <label for="pwd">비밀번호</label>
            <input type="password" id="pwd" name="pwd" />
        </div>
        <div>
            <label for="email">이메일</label>
            <input type="text" id="email" name="email" 
            	value="<%=email %>"/>
        </div>
        <div>  
        	<label for="content">내용</label>        
 			<textarea id="content" name="content" rows="12" cols="40"><%=content %></textarea>
        </div>
        <div class="center">
            <input type = "submit" value="수정"/>
            <input type = "Button" value="글목록" onclick="location.href	='list.jsp'" />         
        </div>
	</fieldset>
</form>    
</div>

</body>
</html>