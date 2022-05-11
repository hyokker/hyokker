package com.jdbc.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class ExecuteSelect {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			//1.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
			//2
			String url="jdbc:oracle:thin:@DESKTOP-56VTHAK:1521:xe";
			String user="javauser", pwd="javauser123";
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("db연결 성공");
			
			//3
			String sql="select * from pd order by no desc";
			ps=con.prepareStatement(sql);
			
			//4
			boolean bool=ps.execute();
			if(bool) {  //select문
				rs=ps.getResultSet();
				while(rs.next()) {
					int no=rs.getInt(1);
					String pdName=rs.getString(2);
					int price=rs.getInt(3);
					Timestamp regdate=rs.getTimestamp(4);
					
					System.out.println(no+"\t"+pdName+"\t"+price+"\t"
						+regdate);
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
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
