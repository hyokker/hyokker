package com.mystudy2.serv;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

//http://192.168.0.11:9090/testsite/NowServ
//http://localhost:9090/mystudy2/NowServ
@WebServlet("/NowServ") //서블릿 경로명
public class NowServlet extends HttpServlet{  
   protected void doGet(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException,IOException{

      //응답문서에 대한 CotentType 지정
      response.setContentType("text/html;charset=euc-kr");

      Date d=new Date();
      //브라우저에 출력할 출력 스트림 얻어오기
      PrintWriter out=response.getWriter();
      
      out.print("<html><head><title>서블릿연습</title><head>");
      out.print("<body>");
      out.print("<h1>현재 시간</h1>");
      out.print("<p>"+d.toLocaleString()+"</p>");
      out.print("</body></html>");
      
      out.close();
   }
}
