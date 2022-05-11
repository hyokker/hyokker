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
			//1. ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
		
			//2. Ŀ�ؼ� ��ü ����
			String url="jdbc:oracle:thin:@DESKTOP-56VTHAK:1521:xe";
			String user="javauser", pwd="javauser123";
			con=DriverManager.getConnection(url, user, pwd);
			
			//3.sql�� ������ ���� prepareStatement ��ü ����
			String sql="select * from mem";
			ps=con.prepareStatement(sql);
			

			
			//4. ����
			
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

