package com.mystudy2.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionPoolMgr {
	public ConnectionPoolMgr() {
		//1.����̹� �ε�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����!");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����!");
			e.printStackTrace();
		}
		
	}
	
	public Connection getConnection(String url, String uid, String upwd) throws SQLException {
		Connection con=DriverManager.getConnection(url, uid, upwd);
		System.out.println("db���� : con = " + con);
		
		return con;
	}
	public Connection getConnection(String uid, String upwd) throws SQLException {
		
		String url="jdbc:oracle:thin:@DESKTOP-56VTHAK:1521:xe";
		Connection con=DriverManager.getConnection(url,uid, upwd);
		System.out.println("db���� : con = " + con);
		
		return con;
	}
	public Connection getConnection() throws SQLException {
		String url="jdbc:oracle:thin:@DESKTOP-56VTHAK:1521:xe";
		String uid="javauser", upwd="javauser123";
		
		return getConnection(url, uid, upwd);
	}
	
	public void dbClose(ResultSet rs, PreparedStatement ps, Connection con)
			throws SQLException {
		if(ps!=null) ps.close();
		if(con!=null) con.close();
		if(rs!=null) rs.close();
	}
	public void dbClose( PreparedStatement ps, Connection con)
			throws SQLException {
		if(ps!=null) ps.close();
		if(con!=null) con.close();
	}

}