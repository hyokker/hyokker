package com.jdbc.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class bookUpdate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ʈ �� å ��ȣ, �����Ϸ��� ����, ����, ���ǻ縦 �Է��ϼ���");
		int no = sc.nextInt();
		sc.nextLine();
		String title = sc.nextLine();
		int price = sc.nextInt();
		sc.nextLine();
		String publisher = sc.nextLine();
		
		Connection con = null;
		PreparedStatement ps = null;
		try {
			//1.����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
			
			//2.connection��ü ����
			String url="jdbc:oracle:thin:@192.168.219.104:1521:xe";
			String user="javauser",pwd="javauser123";
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("db���� ����");
			
			//3.prepareStatement ��ü ���� --update
			String sql="update book set title=? ,price=?,publisher=? where no = ?"					;
			ps=con.prepareStatement(sql);
			
			ps.setString(1, title);
			ps.setInt(2, price);
			ps.setString(3, publisher);
			ps.setInt(4, no);
			//4.����
			
			int cnt=ps.executeUpdate();
			System.out.println("ó���� ���� ���� : " + cnt);
		
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if(ps!=null)ps.close();
				if(con!=null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
