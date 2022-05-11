package com.jdbc.day2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class ProcedureTest1 {

	public static void main(String[] args) {
		//exec personInsert('강길수', '010-1111-2222')
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 전화번호 입력!");
		String name=sc.nextLine();
		String tel=sc.nextLine();
		
		Connection con=null;
		CallableStatement cs=null;
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
			String sql="call personInsert(?, ?)";
			cs=con.prepareCall(sql);
			
			//in parameter setting
			cs.setString(1, name);
			cs.setString(2, tel);
			
			//4
			boolean bool=cs.execute();
			System.out.println("프로시저 실행 결과:"+ bool); //false
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(cs!=null) cs.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
