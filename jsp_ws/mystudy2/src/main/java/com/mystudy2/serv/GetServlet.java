package com.mystudy2.serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetServlet
 */
@WebServlet("/GetServ")
public class GetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//���� ������ ���� ContentType ����
		response.setContentType("text/html;charset=euc-kr");
		//��� ��Ʈ�� ������
		PrintWriter out=response.getWriter();
		//1
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		//2
		//3
		out.print("<html><head><title>get-servlet����</title></head>");
		out.print("<body>");
		out.print("<h1>��û �Ķ���� ��</h1>");
		out.print("<p>id : " + id + "</p>");
		out.print("<p>pwd : " + pwd + "</p>");
		out.print("</body>");
		
		out.close();
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
