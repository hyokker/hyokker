package com.pd.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.db.DBUtil;

public class MemDAO {
	public static int insertMem(MemDTO dto) throws SQLException {
		Connection con=null;
		PreparedStatement ps = null;
		
		
		try {
			con=DBUtil.getConnection();
			
			String sql="insert into mem\r\n"
					+ "values(MEM_SEQ.nextval,?,?,?,?,sysdate)";
			ps=con.prepareStatement(sql);
			
			
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPwd());
			ps.setString(3, dto.getName());
			ps.setString(4, dto.getHp());
			
			int cnt=ps.executeUpdate();
			System.out.println("멤버 등록 결과 cnt:" + cnt + ", 매개변수 dto=" + dto);
			
			return cnt;
		} finally {
			DBUtil.dbClose(ps, con);
		}
	}
	
	public static int updateMem(MemDTO dto) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con=DBUtil.getConnection();
			String sql = "update mem set id = ?, pwd = ?, name = ?, hp = ? where no = ?";
			ps=con.prepareStatement(sql);
			
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPwd());
			ps.setString(3, dto.getName());
			ps.setString(4, dto.getHp());
			ps.setInt(5, dto.getNo());
			
			int cnt = ps.executeUpdate();
			System.out.println("멤버 수정 결과 cnt:" + cnt + ", 매개변수 dto=" + dto);
			
			return cnt;
		} finally {
			DBUtil.dbClose(ps, con);
		}
	}
	
	public static int deleteMem(int no) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con=DBUtil.getConnection();
			
			String sql="delete from mem where no =?";
			ps=con.prepareStatement(sql);
			
			ps.setInt(1, no);
			
			int cnt = ps.executeUpdate();
			System.out.println("멤버 삭제 결과 cnt :"+cnt+", 매개변수 no :" + no);
			return cnt;
		} finally {
			DBUtil.dbClose(ps, con);
		}
	}
	
	public static List<MemDTO> selectAll() throws SQLException{
		Connection con=null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		
		//여러개의 레코드를 담을 리스트 생성
		List<MemDTO> list = new ArrayList<MemDTO>();
		try {
			con=DBUtil.getConnection();
			
			String sql="select * from mem order by no";
			ps=con.prepareStatement(sql);
			
			rs=ps.executeQuery();
			while(rs.next()) {
				int no = rs.getInt(1);
				String id = rs.getString(2);
				String pwd = rs.getString(3);
				String name = rs.getString(4);
				String hp = rs.getString(5);
				Timestamp regdate = rs.getTimestamp(6);
				
				MemDTO dto = new MemDTO(no, id, pwd, name, hp, regdate);
			
				list.add(dto);
			}
			System.out.println("멤버 전체 조회 결과 list.size="+list.size());
			return list;
		} finally {
			DBUtil.dbClose(rs, ps, con);
		}
		
	}
	
	public static MemDTO selectByNo(int no) throws SQLException {
		Connection con=null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		
		MemDTO dto = new MemDTO();
		try {
			con=DBUtil.getConnection();
			String sql="select * from mem where no = ?";
			ps=con.prepareStatement(sql);
			
			ps.setInt(1, no);
			
			rs=ps.executeQuery();
			if(rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String hp = rs.getString("hp");
				Timestamp regdate = rs.getTimestamp("regdate");
				
				dto.setNo(no);
				dto.setId(id);
				dto.setPwd(pwd);
				dto.setName(name);
				dto.setHp(hp);
				dto.setRegdate(regdate);
			}
			System.out.println("번호로 조회 결과 dto =" + dto +", 매개변수 no=" + no);
			
			return dto;
		}finally {
			DBUtil.dbClose(rs, ps, con);
		}
		
	}
}
