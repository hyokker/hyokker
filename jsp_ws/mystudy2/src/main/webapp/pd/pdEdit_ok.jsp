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
<%	//pdEdit.jsp���� post������� �����
	//post������� �°��� ���ڵ��ؾ���
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
			System.out.println("��ǰ ���� ����, ����ȭ������ ���ư��ϴ�");
			response.sendRedirect("pdEdit.jsp");
		}
	}catch(SQLException e){
		e.printStackTrace();
	}
%>
</body>
</html>