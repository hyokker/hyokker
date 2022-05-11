package com.jdbc.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExecuteTest1 {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		PreparedStatement ps2=null;
		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
			//2. DB서버와 연결하기 위한 Connection객체 생성
			String url="jdbc:oracle:thin:@DESKTOP-56VTHAK:1521:xe";
			String user="javauser", pwd="javauser123";
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("db연결 성공");
			
			//3. sql문을 처리하기 위한 PreparedStatement객체 생성
			String sql="create table pd2"
					+ "("
					+ " no number primary key,"
					+ " pdName varchar2(50) not null,"
					+ " price number null,"
					+ " regdate  date default sysdate"
					+ ")";
			ps=con.prepareStatement(sql);
			
			//4. 실행
			boolean bool=ps.execute();
			/*
			 - 모든 sql문장을 실행시킴
			 - select문이면 true, select문이 아니면 false를 리턴함
			*/
			System.out.println("bool="+bool);  //false
			
			//sequence 생성 sql문
			sql="create sequence pd2_seq"
					+ " start with 1"
					+ " increment by 1"
					+ " nocache";
			
			ps=con.prepareStatement(sql);
			
			bool=ps.execute();
			System.out.println("seq 생성 => bool : " + bool); //false
			
			System.out.println("pd2 테이블 생성 성공!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps!=null) ps.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
