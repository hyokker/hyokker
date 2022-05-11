package com.jdbc.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("id,pwd, �̸�, ��ȭ��ȣ �Է�!");
		String id =sc.nextLine();
		String password= sc.nextLine();
		String name = sc.nextLine();
		String hp= sc.nextLine();
		
		Connection con = null;
		PreparedStatement ps = null;
		
		
		try {
			//1. ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
		
			//2. Ŀ�ؼ� ��ü ����
			String url="jdbc:oracle:thin:@DESKTOP-56VTHAK:1521:xe";
			String user="javauser", pwd="javauser123";
			con=DriverManager.getConnection(url, user, pwd);
			
			//3.sql�� ������ ���� prepareStatement ��ü ����
			String sql="insert into mem(no, id, pwd, name, hp)"
					+ " values (mem_seq.nextval, ?,?,?,?) ";
			ps=con.prepareStatement(sql);
			
			//in parameter setting
			ps.setString(1, id);
			ps.setString(2, password);
			ps.setString(3, name);
			ps.setString(4, hp);
			
			//4. ����
			
			int cnt=ps.executeUpdate();
			System.out.println("����� ���� �� :" + cnt);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps!=null)ps.close();
				if(con!=null)con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
