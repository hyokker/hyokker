package com.jdbc.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class bookSelect {

	public static void main(String[] args) {
		
		Connection con= null;
		PreparedStatement ps = null;
		ResultSet rs= null;
		try {
			//1.����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
			
			
			//2.����̹� ������ ���� connection ��ü ����
			String url="jdbc:oracle:thin:@192.168.219.104:1521:xe";
			String user="javauser", pwd="javauser123";
			con=DriverManager.getConnection(url, user, pwd);
			
			//3.sql������ ���� prepareStatement ��ü ����
			String sql="select * from book";
			ps=con.prepareStatement(sql);
			
			//4.����
			
			rs=ps.executeQuery();
			while(rs.next()) {
				int no = rs.getInt(1);
				String title = rs.getString(2);
				int price = rs.getInt(3);
				String publisher = rs.getString(4);
				Timestamp joindate = rs.getTimestamp(5);
				
				System.out.println(no + "\t" + title + "\t" + "\t" + price + "\t" + publisher + "\t" + joindate);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null)rs.close();
				if(ps!=null)ps.close();
				if(con!=null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
