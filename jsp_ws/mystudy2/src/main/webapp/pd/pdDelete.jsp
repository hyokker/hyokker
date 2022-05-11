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
	//pdDetail.jsp 에서 삭제버튼을 클릭하면 get방식으로 이동
	//=>http://localhost:9090/mystudy2/pd/pdDelete.jsp?no=8
	
	//1 요청 파라미터 읽어오기
		String no=request.getParameter("no");
	//2 db연결
		PdDAO dao = new PdDAO();
		try{	
			int cnt=dao.deletePd(Integer.parseInt(no));
	//3 결과처리
			if(cnt>0){
				response.sendRedirect("pdList.jsp");
			}else{
				System.out.println("삭제 실패");
				response.sendRedirect("pdDetail.jsp?no="+no);
			}
		}catch(SQLException e){
		e.printStackTrace();
		}

%>
</body>
</html>