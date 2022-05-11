package com.mystudy2.serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/LifeCycle")
public class LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LifeCycle() {
		super();
		System.out.println("������ ȣ��!");
	}

	@Override
	public void destroy() {
		System.out.println("destroy() ȣ��!");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() ȣ��!");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//������ Ŭ���̾�Ʈ�� ��û�� ���� ������ �����尡 �����Ǿ
		//���������� service()�޼��带 ����
		System.out.println("doGet() ȣ��!");
		
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		String name = Thread.currentThread().getName();
		System.out.println("������ �̸�"+ name);
		
		out.print("<html><head><title>servlet life cycle</title></head>");
		out.print("<body>");
		out.print("<h1>[���� ������]</h1>");
		out.print("<p>"+name+"</p>");
		out.print("</body></html>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
