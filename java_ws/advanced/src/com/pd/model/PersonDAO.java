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
			System.out.println("인물 등록 결과 cnt : " + cnt +", 매개면수 dto :" + dto );
			
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
			System.out.println("사람 전체 조회 결과 :"+list.size());
			
			return list;
		} finally {
			DBUtil.dbClose(rs, ps, con);
		}		
	}
	
	
	public PersonDTO selectByNo(int no) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		PersonDTO dto = new PersonDTO();//결과 레코드 하나를 DTO 로 묶어서 리턴하려는 용도
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
				
				//하나의 레코드는 하나의 DTO
				//컬럼의 값들을 DTO에 넣어서 DTO 하나를 리턴한다
				dto.setNo(no);
				dto.setName(name);
				dto.setTel(tel);
				dto.setRegdate(regdate);
												
			}
			System.out.println("번호로 조회 결과 dto: " +  dto + ", 매개변수 no :" + no);
			return dto;
		} finally {
			DBUtil.dbClose(rs, ps, con);
		}
		
	}
}
