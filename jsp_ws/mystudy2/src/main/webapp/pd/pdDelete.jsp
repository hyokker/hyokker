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
	//pdDetail.jsp ���� ������ư�� Ŭ���ϸ� get������� �̵�
	//=>http://localhost:9090/mystudy2/pd/pdDelete.jsp?no=8
	
	//1 ��û �Ķ���� �о����
		String no=request.getParameter("no");
	//2 db����
		PdDAO dao = new PdDAO();
		try{	
			int cnt=dao.deletePd(Integer.parseInt(no));
	//3 ���ó��
			if(cnt>0){
				response.sendRedirect("pdList.jsp");
			}else{
				System.out.println("���� ����");
				response.sendRedirect("pdDetail.jsp?no="+no);
			}
		}catch(SQLException e){
		e.printStackTrace();
		}

%>
</body>
</html>