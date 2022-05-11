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
		System.out.println("생성자 호출!");
	}

	@Override
	public void destroy() {
		System.out.println("destroy() 호출!");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() 호출!");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//서블릿은 클라이언트의 요청이 있을 때마다 쓰레드가 생성되어서
		//병행적으로 service()메서드를 실행
		System.out.println("doGet() 호출!");
		
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		String name = Thread.currentThread().getName();
		System.out.println("쓰레드 이름"+ name);
		
		out.print("<html><head><title>servlet life cycle</title></head>");
		out.print("<body>");
		out.print("<h1>[현재 쓰레드]</h1>");
		out.print("<p>"+name+"</p>");
		out.print("</body></html>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
