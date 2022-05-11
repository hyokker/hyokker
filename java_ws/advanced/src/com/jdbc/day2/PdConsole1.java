package com.jdbc.day2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Scanner;

import com.db.DBUtil;

public class PdConsole1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.��� 2.���� 3.���� 4.��ü��ȸ 5.��ȣ����ȸ "
					+ "6.�̸����� ��ȸ 7.����");
			int type=sc.nextInt();
			
			switch(type) {
				case 1:
					try {
						register();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					break;
				case 4:
					try {
						showAll();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					break;
				case 7:
					System.out.println("�ý��� ������!");
					System.exit(0);
				default:
					System.out.println("�߸� ����!\n");
			}
		}//while
		
	}

	public static int insertPd(String pdName, int price) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			//1, 2
			con=DBUtil.getConnection();
			
			//3
			String sql="insert into pd(no, pdname, price)"
					+ " values (pd_seq.nextval, ?,?)";
			ps=con.prepareStatement(sql);
			
			ps.setString(1, pdName);
			ps.setInt(2, price);
			
			//4
			int cnt=ps.executeUpdate();
			System.out.println("ó���� ���� ����:"+ cnt);
			
			return cnt;
		}finally {
			DBUtil.dbClose(ps, con);
		}
		
	}
	
	private static void showAll() throws SQLException {
		//1.		
		//2.
		selectAll();
		
		//3.
		
	}

	public static void selectAll() throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			//1,2 con
			con=DBUtil.getConnection();
			
			//3. ps
			String sql="select * from pd order by no desc";
			ps=con.prepareStatement(sql);
			
			//4. exec
			rs=ps.executeQuery();
			while(rs.next()) {
				int no=rs.getInt(1);
				String pdName=rs.getString(2);
				int price=rs.getInt(3);
				Timestamp regdate=rs.getTimestamp(4);
				
				System.out.println(no+"\t"+pdName+"\t"+price+"\t"+regdate);				
			}
		}finally {
			DBUtil.dbClose(rs, ps, con);
		}
	}

	private static void register() throws SQLException {
		//1. ����� �Է� �ޱ�
		System.out.println("��ǰ��, ���� �Է�!");
		String pdName=sc.nextLine();
		String sPrice=sc.nextLine();
		int price=0;
		if(sPrice!=null && !sPrice.isEmpty()) {
			price=Integer.parseInt(sPrice);
		}
		
		//2. db�۾�
		int cnt=insertPd(pdName, price);
		
		//3. ��� ó��
		String result=(cnt>0)?"��� ����":"��� ����";
		System.out.println(result);
	}

}
