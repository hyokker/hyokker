package com.jdbc.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExecuteTest1 {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		PreparedStatement ps2=null;
		try {
			//1. ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
			
			//2. DB������ �����ϱ� ���� Connection��ü ����
			String url="jdbc:oracle:thin:@DESKTOP-56VTHAK:1521:xe";
			String user="javauser", pwd="javauser123";
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("db���� ����");
			
			//3. sql���� ó���ϱ� ���� PreparedStatement��ü ����
			String sql="create table pd2"
					+ "("
					+ " no number primary key,"
					+ " pdName varchar2(50) not null,"
					+ " price number null,"
					+ " regdate  date default sysdate"
					+ ")";
			ps=con.prepareStatement(sql);
			
			//4. ����
			boolean bool=ps.execute();
			/*
			 - ��� sql������ �����Ŵ
			 - select���̸� true, select���� �ƴϸ� false�� ������
			*/
			System.out.println("bool="+bool);  //false
			
			//sequence ���� sql��
			sql="create sequence pd2_seq"
					+ " start with 1"
					+ " increment by 1"
					+ " nocache";
			
			ps=con.prepareStatement(sql);
			
			bool=ps.execute();
			System.out.println("seq ���� => bool : " + bool); //false
			
			System.out.println("pd2 ���̺� ���� ����!");
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
