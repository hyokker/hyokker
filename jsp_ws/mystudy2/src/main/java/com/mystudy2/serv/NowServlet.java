package com.mystudy2.serv;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

//http://192.168.0.11:9090/testsite/NowServ
//http://localhost:9090/mystudy2/NowServ
@WebServlet("/NowServ") //���� ��θ�
public class NowServlet extends HttpServlet{  
   protected void doGet(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException,IOException{

      //���乮���� ���� CotentType ����
      response.setContentType("text/html;charset=euc-kr");

      Date d=new Date();
      //�������� ����� ��� ��Ʈ�� ������
      PrintWriter out=response.getWriter();
      
      out.print("<html><head><title>��������</title><head>");
      out.print("<body>");
      out.print("<h1>���� �ð�</h1>");
      out.print("<p>"+d.toLocaleString()+"</p>");
      out.print("</body></html>");
      
      out.close();
   }
}
