<%@page import="com.mystudy2.pd.model.PdDTO"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.mystudy2.pd.model.PdDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>pdWrite_ok.jsp</title>
</head>
<body>
<%
   //pdWrite.jsp ���� post������� ����Ե�
   
   request.setCharacterEncoding("euc-kr");

   //1. ��û �Ķ���� �о����
   String pdName=request.getParameter("pdName");      
   String price=request.getParameter("price");
   
   //2. db�۾�
   PdDAO dao=new PdDAO();
   PdDTO dto=new PdDTO();
   dto.setPdName(pdName);
   dto.setPrice(Integer.parseInt(price));
   
   try{
      int cnt=dao.insertPd(dto);
 	  //3. ��� ó��
 	  if(cnt>0){
 		  response.sendRedirect("pdList.jsp");
 	  }else{
 		  System.out.println("��ǰ��� ����!");
 		  response.sendRedirect("pdWrite.jsp");  
 	  }
   }catch(SQLException e){
      e.printStackTrace();
   }

%>
</body>
</html>