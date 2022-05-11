<%@page import="java.sql.SQLException"%>
<%@page import="com.mystudy2.pd.model.PdDTO"%>
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
<%	//pdEdit.jsp에서 post방식으로 서브밋
	//post방식으로 온것은 인코딩해야함
	request.setCharacterEncoding("euc-kr");

	//1
	String no=request.getParameter("no");
	String pdName=request.getParameter("pdName");
	String price=request.getParameter("price");
	
	//2
	PdDAO dao = new PdDAO();
	PdDTO dto = new PdDTO();
	dto.setNo(Integer.parseInt(no));
	dto.setPdName(pdName);
	dto.setPrice(Integer.parseInt(price));
	
	try{
	//3
		int cnt=dao.updatePd(dto);
		if(cnt>0){
			response.sendRedirect("pdList.jsp");
		}else{
			System.out.println("상품 수정 실패, 수정화면으로 돌아갑니다");
			response.sendRedirect("pdEdit.jsp");
		}
	}catch(SQLException e){
		e.printStackTrace();
	}
%>
</body>
</html>