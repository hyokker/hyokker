package com.mystudy2.book.serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mystudy2.book.model.BookDAO;
import com.mystudy2.book.model.BookDTO;

@WebServlet("/InsertBookServlet")
public class InsertBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//form에서 전송하였기 때문에 post방식
		
		//응답문서에 대한 contentType 지정
		response.setContentType("text/html;charset=euc-kr");
		//출력 스트림 얻어오기
		PrintWriter out = response.getWriter();
		
		//post방식은 encoding해줘야함
		request.setCharacterEncoding("euc-kr");
		//1.요청 파라미터 읽어오기
		String title=request.getParameter("title");
		String price=request.getParameter("price");
		String publisher=request.getParameter("publisher");
		
		//2.db작업
		BookDTO dto = new BookDTO();
		dto.setTitle(title);
		dto.setPrice(Integer.parseInt(price));
		dto.setPublisher(publisher);
		BookDAO dao = new BookDAO();
		
		try {
			//3.결과처리 (try~catch 직접입력)
			int cnt=dao.insertBook(dto);
			
			if(cnt>0) {
				response.sendRedirect("/mystudy2/bookListServlet");
			}else {
				System.out.println("책 등록 실패");
				out.println("등로ㅓㄱ 실패");
				response.sendRedirect("/mystudy2/servTest/registerBook.html");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		out.close();
	}

}