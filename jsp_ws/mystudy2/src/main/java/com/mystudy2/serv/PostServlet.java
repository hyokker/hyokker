package com.mystudy2.serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PostServ")
public class PostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request
			, HttpServletResponse response) throws ServletException, IOException {
		//응답문서에 대한 contentType지정
		response.setContentType("text/html;charset=euc-kr");
		
		//출력 스트림 얻어오기
		PrintWriter out=response.getWriter();
		
		//1
		request.setCharacterEncoding("euc-kr");
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		
		//2
		//3
		out.print("<html><head><title>get-servlet연습</title></head>");
		out.print("<body>");
		out.print("<h1>요청 파라미터 값</h1>");
		out.print("<p>id : " + id + "</p>");
		out.print("<p>pwd : " + pwd + "</p>");
		out.print("</body>");
		
		out.close();
	}

}
