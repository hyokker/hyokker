package com.mystudy2.pd.serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mystudy2.pd.model.PdDAO;
//@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//
		response.setContentType("html/text;charset=euc-kr");
		
		PrintWriter out = response.getWriter();
		
		//1 요청파라미터 읽어오기
		String no = request.getParameter("no");
		
		//2.db연결
		
		PdDAO dao = new PdDAO();
		
		try {
			int cnt=dao.deletePd(Integer.parseInt(no));
		
			if(cnt>0) {
				out.print("삭제성공");
				response.sendRedirect("/mystudy2/ListServ");
			}else {
				out.print("삭제실패");
				response.sendRedirect("/mystudy2/DetailServ");
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
