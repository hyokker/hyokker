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
	//form���� �����Ͽ��� ������ post���
		
		//���乮���� ���� contentType ����
		response.setContentType("text/html;charset=euc-kr");
		//��� ��Ʈ�� ������
		PrintWriter out = response.getWriter();
		
		//post����� encoding�������
		request.setCharacterEncoding("euc-kr");
		//1.��û �Ķ���� �о����
		String title=request.getParameter("title");
		String price=request.getParameter("price");
		String publisher=request.getParameter("publisher");
		
		//2.db�۾�
		BookDTO dto = new BookDTO();
		dto.setTitle(title);
		dto.setPrice(Integer.parseInt(price));
		dto.setPublisher(publisher);
		BookDAO dao = new BookDAO();
		
		try {
			//3.���ó�� (try~catch �����Է�)
			int cnt=dao.insertBook(dto);
			
			if(cnt>0) {
				response.sendRedirect("/mystudy2/bookListServlet");
			}else {
				System.out.println("å ��� ����");
				out.println("��Τä� ����");
				response.sendRedirect("/mystudy2/servTest/registerBook.html");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		out.close();
	}

}