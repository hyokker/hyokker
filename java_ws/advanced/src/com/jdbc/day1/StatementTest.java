package com.jdbc.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StatementTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�, ��ȭ��ȣ �Է�!");
		String name=sc.nextLine();
		String tel=sc.nextLine();
		
		Connection con=null;
		Statement ps=null;
		try {
			//1. ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
			
			//2. �����ͺ��̽� ������ �����ϱ� ���� Connection��ü ����
			String url="jdbc:oracle:thin:@DESKTOP-56VTHAK:1521:xe";
			String user="javauser", pwd="javauser123";
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("db���� ����!");
			
			//3. sql���� ó���ϱ� ���� Statement��ü ����
			ps=con.createStatement();
			
			String sql="insert into person(no, name, tel)"
					+ "values(person_seq.nextval, '"+ name +"','"+tel+"')";
			
			//4. ����
			int cnt=ps.executeUpdate(sql);			
			
			System.out.println("ó���� ���� ����:"+ cnt);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//5. �ڿ�����(���� ����)
			try {
				if(ps!=null) ps.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
