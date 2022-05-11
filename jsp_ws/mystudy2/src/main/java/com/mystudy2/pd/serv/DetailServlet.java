package com.mystudy2.pd.serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mystudy2.pd.model.PdDAO;
import com.mystudy2.pd.model.PdDTO;

//@WebServlet("/DetailServlet")
public class DetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//응답문서에 대한 contentType 지정
		response.setContentType("text/html;charset=euc-kr");
	
	//출력 스트림 얻어오기
		PrintWriter out = response.getWriter();
		
	//1.요청 파라미터 읽어오기
		String no=request.getParameter("no");
		
	//2.db 연결
		PdDAO dao = new PdDAO();
		PdDTO dto = null;
		try {
			dto = dao.selectByNo(Integer.parseInt(no));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//3.
		DecimalFormat df = new DecimalFormat("#,###");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		out.print("<html><head><title>상품목록</title>");
		
		out.print("<script type='text/javascript'>");
		
		out.print("function del(){");
		out.print(" if(confirm('삭제하시겠습니까?')){");
		out.print("		location.href='/mystudy2/DeleteServ?no="+no+"';");
		out.print(" }");
		out.print("}");
		out.print("</script>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>상세보기</h1>");
		out.print("<p>번호 :"+dto.getNo()+"</p>");
		out.print("<p>상품명 :"+dto.getPdName()+"</p>");
		out.print("<p>가격 :"+df.format(dto.getPrice())+"</p>");
		out.print("<p>등록일 :"+sdf.format(dto.getRegdate())+"</p>");
		out.print("<hr>");
		out.print("<a href='/mystudy2/ListServ'>목록</a> |");
		out.print("<a href='/mystudy2/EditServ'>수정</a> |");
		out.print("<a href='#' onclick='del()'>삭제</a>");
		
		out.print("</body></html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
