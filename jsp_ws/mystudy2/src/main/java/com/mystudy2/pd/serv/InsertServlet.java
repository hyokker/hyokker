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
import com.mystudy2.pd.model.PdDTO;

@WebServlet("/InsertServ")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//���乮���� ���� contentType����
			response.setContentType("text/html;charset=euc-kr");
		//��� ��Ʈ�� ������
			PrintWriter out = response.getWriter();
		
		//1. ��û�Ķ���� �о����
		request.setCharacterEncoding("euc-kr");
		
		String pdName=request.getParameter("pdName");
		String price=request.getParameter("price");
		
		//2.db�۾�
		PdDAO dao = new PdDAO();
		PdDTO dto = new PdDTO();
		dto.setPdName(pdName);
		dto.setPrice(Integer.parseInt(price));
		
		try {
			int cnt =dao.insertPd(dto);
			//3
			
			if(cnt>0) {
				response.sendRedirect("/mystudy2/ListServ");
			}else {
				System.out.println("��ǰ ��� ����!");
				out.println("��ǰ ��� ����!");
				
				response.sendRedirect("/mystudy2/servTest/registerPd.html");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		out.close();
	}

}
