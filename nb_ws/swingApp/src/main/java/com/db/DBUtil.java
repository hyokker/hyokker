package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
	//static초기화 블럭
	static {
		//1. 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패!");
			e.printStackTrace();
		}
	}

	public static Connection getConnection(String url, String user, 
			String pwd) throws SQLException {
		//2. 데이터베이스 서버에 연결하기 위한 Connection객체 생성
		Connection con=DriverManager.getConnection(url, user, pwd);
		System.out.println("db연결, con="+con);
		
		return con;
	}
	
	public static Connection getConnection() throws SQLException {
		//2. 데이터베이스 서버에 연결하기 위한 Connection객체 생성
		String url="jdbc:oracle:thin:@DESKTOP-56VTHAK:1521:xe";
		String user="javauser", pwd="javauser123";
		Connection con=getConnection(url, user, pwd);
		
		return con;
	}
	
	public static Connection getConnection(String user, String pwd) 
			throws SQLException {
		String url="jdbc:oracle:thin:@DESKTOP-56VTHAK:1521:xe";
		Connection con = getConnection(url, user, pwd);
		
		return con;
	}
	
	public static void dbClose(ResultSet rs, PreparedStatement ps,
			Connection con) throws SQLException {
		if(rs!=null) rs.close();
		if(ps!=null) ps.close();
		if(con!=null) con.close();
	}
	
	public static void dbClose(PreparedStatement ps,
			Connection con) throws SQLException {
		if(ps!=null) ps.close();
		if(con!=null) con.close();
	}
	
	
}
