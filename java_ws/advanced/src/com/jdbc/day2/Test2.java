 package com.jdbc.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

public class Test2 {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs= null;
		
		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
		
			//2. 커넥션 객체 생성
			String url="jdbc:oracle:thin:@DESKTOP-56VTHAK:1521:xe";
			String user="javauser", pwd="javauser123";
			con=DriverManager.getConnection(url, user, pwd);
			
			//3.sql문 실행을 위한 prepareStatement 객체 생성
			String sql="select * from mem";
			ps=con.prepareStatement(sql);
			

			
			//4. 실행
			
			rs=ps.executeQuery();
			while(rs.next()){
			int no=rs.getInt(1);
			String id = rs.getString(2);
			String password = rs.getString(3);
			String tel = rs.getString(4);
			Date regdate = rs.getDate(5);

			System.out.println(no+"\t"+id+"\t"+password+"\t"+tel+"\t"+regdate);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null)ps.close();
				if(ps!=null)ps.close();
				if(con!=null)con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

