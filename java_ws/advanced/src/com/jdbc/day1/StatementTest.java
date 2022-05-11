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
		System.out.println("이름, 전화번호 입력!");
		String name=sc.nextLine();
		String tel=sc.nextLine();
		
		Connection con=null;
		Statement ps=null;
		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
			//2. 데이터베이스 서버에 연결하기 위한 Connection객체 생성
			String url="jdbc:oracle:thin:@DESKTOP-56VTHAK:1521:xe";
			String user="javauser", pwd="javauser123";
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("db연결 성공!");
			
			//3. sql문을 처리하기 위한 Statement객체 생성
			ps=con.createStatement();
			
			String sql="insert into person(no, name, tel)"
					+ "values(person_seq.nextval, '"+ name +"','"+tel+"')";
			
			//4. 실행
			int cnt=ps.executeUpdate(sql);			
			
			System.out.println("처리된 행의 개수:"+ cnt);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//5. 자원해제(접속 종료)
			try {
				if(ps!=null) ps.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
