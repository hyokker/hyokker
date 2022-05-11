package com.jdbc.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class bookInsert1 {

	public static void main(String[] args) {
		//insert
		Scanner sc = new Scanner(System.in);
		System.out.println("책 제목, 가격, 제공자, 조인날짜");
		
		String title = sc.nextLine();
		int price = sc.nextInt();
		sc.nextLine();
		String publisher = sc.nextLine();
		
		Connection con = null;
		PreparedStatement ps = null;

		
		try {
			//1.드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 완료!");
			
			//2.접속
			String url="jdbc:oracle:thin:@192.168.219.104:1521:xe";
			String user="javauser", pwd="javauser123";
					
			con=DriverManager.getConnection(url, user, pwd);
			
			//3.prepareStatement 객체 생성
			String sql="insert into book(no,title,price,publisher)\r\n"
					+ "values(BOOK_SEQ.nextval,?,?,?)";
			
			ps=con.prepareStatement(sql);
			
			//parameter 세팅
			ps.setString(1,title);
			ps.setInt(2,price);
			ps.setString(3,publisher);
			
			
			//4.실행
			
			int cnt = ps.executeUpdate();
			System.out.println("처리된 행의 개수:" + cnt);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(ps!=null) ps.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
