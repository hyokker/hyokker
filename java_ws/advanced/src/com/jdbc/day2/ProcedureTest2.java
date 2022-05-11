package com.jdbc.day2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ProcedureTest2 {

	public static void main(String[] args) {
		/*
		create or replace procedure infoProf_proc
		(v_profno   in professor.profno%type,
		v_name  out professor.name%type,
		v_pay out professor.pay%type)
		is
		begin
		    select name, pay into v_name, v_pay
		    from professor
		    where profno=v_profno;
		end;
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("교수번호 입력!");
		int profno=sc.nextInt();
		
		Connection con=null;
		CallableStatement cs=null;		
		try {
			//1
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
			//2
			String url="jdbc:oracle:thin:@DESKTOP-56VTHAK:1521:xe";
			String user="hr", pwd="hr123";
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("db연결 성공");
			
			//3.
			String sql="call infoProf_proc(?,?,?)";
			cs=con.prepareCall(sql);
			
			cs.setInt(1, profno);
			
			cs.registerOutParameter(2, oracle.jdbc.OracleTypes.VARCHAR);
			cs.registerOutParameter(3, oracle.jdbc.OracleTypes.NUMBER);
			
			boolean bool=cs.execute();
			System.out.println("bool="+bool);
			
			String name=cs.getString(2);
			int pay=cs.getInt(3);
			System.out.println("이름:"+name+", 급여:"+pay);
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
