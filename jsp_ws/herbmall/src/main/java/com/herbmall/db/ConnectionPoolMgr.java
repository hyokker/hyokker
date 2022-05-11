package com.herbmall.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionPoolMgr {
   public ConnectionPoolMgr() {
      //1. 드라이버 로딩
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         System.out.println("드라이버 로딩 성공!");
      } catch (ClassNotFoundException e) {
         System.out.println("드라이버 로딩 실패!");
         e.printStackTrace();
      }      
   }
   
   public Connection getConnection(String url, String uid, String upwd) 
         throws SQLException {
      Connection con=DriverManager.getConnection(url, uid, upwd);
      System.out.println("db연결 : con="+con);
      
      return con;
   }
   
   public Connection getConnection(String uid, String upwd) 
         throws SQLException {
      String url="jdbc:oracle:thin:@DESKTOP-56VTHAK:1521:xe";
      Connection con=getConnection(url, uid, upwd);
      
      return con;
   }
   
   public Connection getConnection() 
         throws SQLException {
      String url="jdbc:oracle:thin:@DESKTOP-56VTHAK:1521:xe";
      String uid="herb", upwd="herb123";
      return getConnection(url, uid, upwd);      
   }
   
   public void dbClose(ResultSet rs, PreparedStatement ps, Connection con)
         throws SQLException {
      if(rs!=null) rs.close();
      if(ps!=null) ps.close();
      if(con!=null) con.close();      
   }
   
   public void dbClose(PreparedStatement ps, Connection con)
         throws SQLException {
      if(ps!=null) ps.close();
      if(con!=null) con.close();      
   }
   
   
}

