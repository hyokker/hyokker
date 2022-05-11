<%@page import="java.sql.SQLException"%>
<%@page import="com.herbmall.reboard.model.ReBoardVO"%>
<%@page import="com.herbmall.reboard.model.ReBoardDAO"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%
	//[1]글 쓰기 : 글 목록(list.jsp)에서 [글쓰기] 눌렀을때 get방식으로 이동(파라미터 no)

	//[2]답변 화면 : 상세보기(detail.jsp)에서 답변 눌렀을때 get방식으로 이동(파라미터 ok)
	//1
	String no=request.getParameter("no");

		ReBoardVO vo = null;
		boolean isReply=false;
		String url="", btLabel="";
	if(no!= null && !no.isEmpty()){
		isReply=true; //답변화면
			
		url="reply_ok.jsp";
		btLabel="답변";
		//2		
		ReBoardDAO dao = new ReBoardDAO();
		try{
			vo=dao.selectByNo(Integer.parseInt(no));
		}catch(SQLException e){
			e.printStackTrace();
		}
	}else{
		url="write_ok.jsp";
		btLabel="등록";
	}

	
	//3
%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="../css/mainstyle.css" />
<link rel="stylesheet" type="text/css" href="../css/clear.css" />
<link rel="stylesheet" type="text/css" href="../css/formLayout.css" />
<link rel="stylesheet" type="text/css" href="../css/mystyle.css" />

<title>답변형게시판
<%if(isReply){ %>
	답변하기
<%}else{ %>
	글쓰기
<%}%> 
 - 허브몰</title>
<script type="text/javascript" src="../js/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('#btList').click(function(){
			location.href = 'list.jsp';
		});
		
		$('form[name=frmWrite]').submit(function(){
			$('.infobox').each(function(idx, item){
				if($.trim($(this).val()).length<1){
					alert($(this).prev().text() + '을(를) 입력하세요');
					$(item).focus();
					event.preventDefault();
					return false;  //each 탈출
				}
			});			
		});
		
	});
</script>

</head>
<body>
<div class="divForm">
<form name="frmWrite" method="post" action="<%=url %>" >
    <%if(isReply){ %>
    	<input type="text" name="groupNo" value="<%=vo.getGroupNo() %>"> 
    	<input type="text" name="step" value="<%=vo.getStep() %>"> 
    	<input type="text" name="sortNo" value="<%=vo.getSortNo() %>"> 
	<%}%> 
 <fieldset>
	<legend><%if(isReply){ %>
				답변하기
			<%}else{ %>
				글쓰기
			<%}%> 
	</legend>
        <div class="firstDiv">
            <label for="title">제목</label>
            <input type="text" id="title" name="title" class="infobox" 
            	<%if(isReply){ %>
					value="Re : <%=vo.getTitle()%>"
				<%}%> 
            />
        </div>
        <div>
            <label for="name">작성자</label>
            <input type="text" id="name" name="name" class="infobox"/>
        </div>
        <div>
            <label for="pwd">비밀번호</label>
            <input type="password" id="pwd" name="pwd" class="infobox"/>
        </div>
        <div>
            <label for="email">이메일</label>
            <input type="text" id="email" name="email" />
        </div>
        <div>  
        	<label for="content">내용</label>        
 			<textarea id="content" name="content" rows="12" cols="40"></textarea>
        </div>
        <div class="center">
            <input type = "submit" value="<%=btLabel %>"/>
            <input type = "Button" value="글목록" id="btList"/>         
        </div>
    </fieldset>
</form>
</div>   

              
</body>
</html>