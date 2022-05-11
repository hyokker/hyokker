package com.pd.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.db.DBUtil;

public class PersonDAO {
	
	public int insertPerson(PersonDTO dto) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		//1 2 con
		
		try {
			con=DBUtil.getConnection();
			
			String sql="insert into person"
					+ " values(person_seq.nextval,?,?,sysdate)";
			ps=con.prepareStatement(sql);
			
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getTel());
		
			int cnt=ps.executeUpdate();
			System.out.println("�ι� ��� ��� cnt : " + cnt +", �Ű���� dto :" + dto );
			
			return cnt;
		} finally {
			DBUtil.dbClose(ps, con);
		}
	}
	
	public  List<PersonDTO> selectAll() throws SQLException   {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs= null;
		
		List<PersonDTO> list= new ArrayList<PersonDTO>();
		try {
			con=DBUtil.getConnection();
			
			String sql="select * from person order by no desc";
			ps=con.prepareStatement(sql);
			
			rs=ps.executeQuery();
			while(rs.next()) {
				int no =rs.getInt(1);
				String name =rs.getString(2);
				String tel =rs.getString(3);
				Timestamp regdate =rs.getTimestamp(4);
				
				
				PersonDTO dto = new PersonDTO(no, name, tel, regdate);
				
				list.add(dto);
			}
			System.out.println("��� ��ü ��ȸ ��� :"+list.size());
			
			return list;
		} finally {
			DBUtil.dbClose(rs, ps, con);
		}		
	}
	
	
	public PersonDTO selectByNo(int no) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		PersonDTO dto = new PersonDTO();//��� ���ڵ� �ϳ��� DTO �� ��� �����Ϸ��� �뵵
		try {
			con=DBUtil.getConnection();
			String sql="select * from person where no=?";
			ps=con.prepareStatement(sql);
			
			ps.setInt(1, no);
			
			rs=ps.executeQuery();
			while(rs.next()) {
				String name = rs.getString("name");
				String tel = rs.getString("tel");
				Timestamp regdate = rs.getTimestamp("regdate");
				
				//�ϳ��� ���ڵ�� �ϳ��� DTO
				//�÷��� ������ DTO�� �־ DTO �ϳ��� �����Ѵ�
				dto.setNo(no);
				dto.setName(name);
				dto.setTel(tel);
				dto.setRegdate(regdate);
												
			}
			System.out.println("��ȣ�� ��ȸ ��� dto: " +  dto + ", �Ű����� no :" + no);
			return dto;
		} finally {
			DBUtil.dbClose(rs, ps, con);
		}
		
	}
}
