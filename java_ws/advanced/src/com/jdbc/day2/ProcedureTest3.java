package com.jdbc.day2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class ProcedureTest3 {

	public static void main(String[] args) {
		/*
		create or replace procedure personList
		(personCursor out SYS_REFCURSOR)
		is
		begin
		    OPEN personCursor For
		    select no,name,tel,regdate from person
		    order by no desc;

		    exception when others then
		       raise_application_error(-20002, 'person 테이블 조회 실패!');

		end;*/
		
		Connection con=null;
		CallableStatement cs=null;
		ResultSet rs=null;		
		try {
			//1
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
			//2
			String url="jdbc:oracle:thin:@DESKTOP-56VTHAK:1521:xe";
			String user="javauser", pwd="javauser123";
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("db연결 성공");
			
			//3.
			String sql="call personList(?)";
			cs=con.prepareCall(sql);
			cs.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
			
			//4
			boolean bool=cs.execute();
			System.out.println("bool="+bool);
			
			rs=(ResultSet) cs.getObject(1);
			while(rs.next()) {
				int no=rs.getInt(1);
				String name=rs.getString(2);
				String tel=rs.getString(3);
				Timestamp regdate=rs.getTimestamp(4);
				
				System.out.println(no+"\t"+name+"\t"+tel+"\t"+regdate);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(cs!=null)cs.close();
				if(con!=null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
