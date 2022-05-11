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
	//���乮���� ���� contentType ����
		response.setContentType("text/html;charset=euc-kr");
	
	//��� ��Ʈ�� ������
		PrintWriter out = response.getWriter();
		
	//1.��û �Ķ���� �о����
		String no=request.getParameter("no");
		
	//2.db ����
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
		
		out.print("<html><head><title>��ǰ���</title>");
		
		out.print("<script type='text/javascript'>");
		
		out.print("function del(){");
		out.print(" if(confirm('�����Ͻðڽ��ϱ�?')){");
		out.print("		location.href='/mystudy2/DeleteServ?no="+no+"';");
		out.print(" }");
		out.print("}");
		out.print("</script>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>�󼼺���</h1>");
		out.print("<p>��ȣ :"+dto.getNo()+"</p>");
		out.print("<p>��ǰ�� :"+dto.getPdName()+"</p>");
		out.print("<p>���� :"+df.format(dto.getPrice())+"</p>");
		out.print("<p>����� :"+sdf.format(dto.getRegdate())+"</p>");
		out.print("<hr>");
		out.print("<a href='/mystudy2/ListServ'>���</a> |");
		out.print("<a href='/mystudy2/EditServ'>����</a> |");
		out.print("<a href='#' onclick='del()'>����</a>");
		
		out.print("</body></html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
