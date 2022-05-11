package com.jdbc.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExecuteInsert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("상품명, 가격 입력!");
		String pdName=sc.nextLine();
		int price=sc.nextInt();
		
		Connection con=null;
		PreparedStatement ps=null;
		try {
			//1.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩");
			
			//2.
			String url="jdbc:oracle:thin:@DESKTOP-56VTHAK:1521:xe";
			String user="javauser", pwd="javauser123";
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("db연결 성공");
			
			//3.
			String sql="insert into pd(no, pdname, price)"
					+ " values (pd_seq.nextval, ?, ?)";
			ps=con.prepareStatement(sql);
			
			//in parameter setting
			ps.setString(1, pdName);
			ps.setInt(2, price);
			
			//4.
			boolean bool=ps.execute();
			System.out.println("bool="+bool);
			
			if(!bool) {  //select문이 아니면
				int cnt=ps.getUpdateCount(); //DML문에 의해 처리된 행의 개수 반환
				System.out.println("처리된 행의 개수:"+ cnt);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps!=null) ps.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
