package com.jdbc.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

public class SelectTest1 {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
			//2. 데이터베이스 서버에 연결하기 위한 Connection객체 생성
			String url="jdbc:oracle:thin:@DESKTOP-56VTHAK:1521:xe";
			String user="javauser", pwd="javauser123";
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("db연결 성공");
			
			//3. sql문을 처리하기 위한 PreparedStatement객체 생성
			String sql="select * from person order by no desc";
			ps=con.prepareStatement(sql);
			
			//4. 실행
			//[1] select => executeQuery()
			//[2] insert, update, delete => executeUpdate()
			rs=ps.executeQuery();
			while(rs.next()) {
				int no=rs.getInt(1);
				//int no=rs.getInt("no");
				
				String name=rs.getString("name");
				String tel=rs.getString("tel");
				Date regdate = rs.getDate("regdate");
				Timestamp regdate2 = rs.getTimestamp(4);
				
				System.out.print(no +"\t");
				System.out.print(name +"\t");
				System.out.print(tel +"\t");
				System.out.print(regdate +"\t");
				System.out.print(regdate2 +"\n");				
			}			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//5.
			try {  
				if(rs!=null) rs.close();
				if(ps!=null) ps.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
