package com.mystudy2.pd.serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mystudy2.pd.model.PdDAO;
import com.mystudy2.pd.model.PdDTO;


//@WebServlet("/ListServ")
public class ListServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//contentType 지정
		response.setContentType("text/html;charset=euc-kr");
		
		//출력스트림 얻어오기
		PrintWriter out = response.getWriter();
		
		//1.요청 파라미터 읽어오기(없으면 패스)
		//2.db 작업
		PdDAO dao = new PdDAO();
		List<PdDTO> list = null;
		try {
			 list = dao.selectAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//3.결과처리
		DecimalFormat df = new DecimalFormat("#,###");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		out.print("<html><head><title>상품목록</title></head>");
		out.print("<body>");
		out.print("<table border='1'>");
		out.print("<tr><th>번호</th><th>상품명</th><th>가격</th><th>등록일</th>");
		out.print("</tr>");
		
		for(int i=0;i<list.size();i++) {
			PdDTO dto = list.get(i);
			out.print("<tr>");
			out.print("<td>"+dto.getNo()+"</td>");
			out.print("<td><a href='/mystudy2/DetailServ?no="+dto.getNo()+"'>"+dto.getPdName()+"</a></td>");
			out.print("<td>"+df.format(dto.getPrice())+"</td>");
			out.print("<td>"+sdf.format(dto.getRegdate())+"</td>");
			out.print("</tr>");
		
		}
		out.print("</table>");
		out.print("<a href='/mystudy2/servTest/registerPd.html'>상품등록</a>");
		out.print("</body></html>");
		out.close();
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
