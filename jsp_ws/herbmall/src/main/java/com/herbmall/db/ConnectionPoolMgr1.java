package com.herbmall.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;

//싱글톤 패턴 적용
public class ConnectionPoolMgr1 {
	private String url,user,pwd;
	private HashMap<Connection, Boolean> hmap;
	private int increment; //증가치
	private static ConnectionPoolMgr1 instance; //static변수 - 클래스차원에서 하나만 생성되며 모든 객체가 공유한다
	
	//생성자
	private ConnectionPoolMgr1(){
		increment=5;//5만큼씩 증가
		hmap=new HashMap<Connection,Boolean>(10);	
		Connection con=null;	
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공!");
			url="jdbc:oracle:thin:@DESKTOP-56VTHAK:1521:xe";	
			user="herb"; 	
			pwd="herb123";
			
			//커넥션 객체를 미리 생성해 놓기 - 10개
			for(int i=0;i<10;i++){	
				con=DriverManager.getConnection(url,user,pwd);		
				//해시맵의 key에 커넥션 저장
				
				hmap.put(con, Boolean.FALSE);		
				//해시맵의 value에 true, false 저장, false - 쉬는 커넥션이라는 표시	
			}//for
			
			System.out.println("ConnectionPool 생성!");
		}catch (ClassNotFoundException e) {			
			e.printStackTrace();
			System.out.println("Class Not Found!"); 
		}catch (SQLException e) {			
			e.printStackTrace();
			System.out.println("sql 예외발생!"); 
		}
	}//생성자
	
	//static 메서드
	public static ConnectionPoolMgr1 getInstance() {
		if(instance==null) {
			instance=new ConnectionPoolMgr1();
		}
		
		return instance;
	}
	public synchronized Connection getConnection() //jsp - 요청시 Thread로 처리
			throws SQLException{
		Iterator<Connection> iterKeys=hmap.keySet().iterator();	
		Connection con=null;	
		while(iterKeys.hasNext() ){ //hmap에 key가 있는 동안 반복	
			con=iterKeys.next();//key값	
			Boolean b=hmap.get(con);//value값	
			//만약 쉬고있는 컨넥션이라면 일하는 컨넥션으로 표시해주고 반환한다.	
			if(b==Boolean.FALSE){	
				hmap.put(con, Boolean.TRUE);//일한다고 표시		
				return con; //일하러 나감	
			}//if	
		}//while
		
		//쉬고 있는 컨넥션이 없으면 일할 Connection을 5개 증가시킨다	
		for(int i=0;i<increment;i++){	
			Connection con2=DriverManager.getConnection(url,user,pwd);	
			hmap.put(con2, Boolean.FALSE);	
		}//for
		
		return getConnection();//재귀호출
	}
	
	//커넥션을 사용하고 난 후 다시 되돌려주는 메소드	
	public void returnConnection(Connection returnCon){
		Iterator<Connection> iterKeys=hmap.keySet().iterator();	
		Connection con=null;	
		while(iterKeys.hasNext() ){	
			con=iterKeys.next();		
			if(con==returnCon){	//con의 주소값이 일치하면
				hmap.put(con, Boolean.FALSE);  //쉬는 커넥션으로 표시	
				break;
			}//if
		}//while
		
		try{	
			removeConnection(); //쉬고있는 커넥션 10개를 유지해주는 메소드	
		}catch(SQLException e){	
			e.printStackTrace();	
			System.out.println("sqlerror:" + e.getMessage());
		}
	}
	
	//Connection 10개만 유지해주는 메서드
	public void removeConnection() throws SQLException{
		Connection con=null;
		Iterator<Connection> iterKeys=hmap.keySet().iterator();
		int count=0;//false인 커넥션 개수
		while(iterKeys.hasNext() ){ 	
			con=iterKeys.next();	
			Boolean b=hmap.get(con);
			boolean b_pre=b.booleanValue();
			if(!b_pre){//쉬고있는 커넥션 개수 세기 - false인 경우
				count++;
				if(count>10){ //쉬고 있는 커넥션이 10개가 넘어가면
					//해시맵에서 삭제
					hmap.remove(con);
					con.close();
				}
			}//if
		}//while
	}
	
	//모든 커넥션 close하는 메서드
	public void closeAll() throws SQLException{
		Iterator<Connection> iterKeys=hmap.keySet().iterator();	
		Connection con=null;	
		while(iterKeys.hasNext() ){ 	
			con=iterKeys.next();	
			con.close();
		}//while
	}
	
	
	//자원해제하는 메서드
	public void dbClose(PreparedStatement ps,  Connection con) throws SQLException{
		if(ps!=null) ps.close();
		if(con!=null)returnConnection(con);
	}
	
	public void dbClose(ResultSet rs,  PreparedStatement ps,  
			Connection con) throws SQLException{
		if(rs!=null)rs.close();
		if(ps!=null) ps.close();
		if(con!=null)returnConnection(con);				
	}
	
}//class
