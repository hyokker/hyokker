<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.mystudy2.pd.model.PdDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.mystudy2.pd.model.PdDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
	//[1] pdWrite.jsp 에서 상품목록 버튼을 눌러 get방식으로 이동    
	//[2] pdWrite.jsp 에서 등록 성공하면 get방식으로 이동   
	
	//1.요청 파라미터 읽어오기
	//파라미터가 없으면 패스	
	//2.db작업
		PdDAO dao = new PdDAO();
		List<PdDTO> list=null;
		try{
		list=dao.selectAll();
		}catch(SQLException e){
			e.printStackTrace();
		}
		//3.결과처리
    	DecimalFormat df = new DecimalFormat("#,###");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String s=df.format(12300);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>pdList.jsp</title>
</head>
<body>
	<h1>상품 목록</h1>
	<table border="1" style="width:500px">
		<tr>
			<th>번호</th>
			<th>상품명</th>
			<th>상품가격</th>
			<th>등록일</th>
		</tr>
		<!--반복 시작 -->
		 <!-- 스크립트릿에서 자바 코드를 나타내려면 표현식 사용 -->
		<%
			for(int i=0;i<list.size();i++){
				PdDTO dto=list.get(i);%>
				<tr>
					<td><%=dto.getNo() %></td>				
					<td><a href="pdDetail.jsp?no=<%=dto.getNo() %>">
					<%=dto.getPdName() %>
					</a></td>				
					<td style="text-align: right">
						<%=df.format(dto.getPrice()) %></td>				
					<td><%=sdf.format(dto.getRegdate()) %></td>				
				</tr>
				
				
		<% 	}//for %>
			
		
		

		<!--반복 반복 끝 -->
	
	</table>
	<br>
	
	<a href="pdWrite.jsp">상품 등록</a>	
	<!--글 목록이 어떻게 왔는지 경로 알고있기.  -->
</body>
</html>