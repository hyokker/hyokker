package com.jdbc.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("id,pwd, 이름, 전화번호 입력!");
		String id =sc.nextLine();
		String password= sc.nextLine();
		String name = sc.nextLine();
		String hp= sc.nextLine();
		
		Connection con = null;
		PreparedStatement ps = null;
		
		
		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
		
			//2. 커넥션 객체 생성
			String url="jdbc:oracle:thin:@DESKTOP-56VTHAK:1521:xe";
			String user="javauser", pwd="javauser123";
			con=DriverManager.getConnection(url, user, pwd);
			
			//3.sql문 실행을 위한 prepareStatement 객체 생성
			String sql="insert into mem(no, id, pwd, name, hp)"
					+ " values (mem_seq.nextval, ?,?,?,?) ";
			ps=con.prepareStatement(sql);
			
			//in parameter setting
			ps.setString(1, id);
			ps.setString(2, password);
			ps.setString(3, name);
			ps.setString(4, hp);
			
			//4. 실행
			
			int cnt=ps.executeUpdate();
			System.out.println("실행된 행의 수 :" + cnt);
			
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
