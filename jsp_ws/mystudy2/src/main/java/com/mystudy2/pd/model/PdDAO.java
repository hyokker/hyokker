package com.mystudy2.pd.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.mystudy2.db.ConnectionPoolMgr;

public class PdDAO {
	private ConnectionPoolMgr pool;
	
	public PdDAO() {
		pool= new ConnectionPoolMgr();
	}
	
	public int insertPd(PdDTO dto) throws SQLException {
		Connection con =null;
		PreparedStatement ps =null;
		try {
			//1,2 con
			con=pool.getConnection();
			
			
			//3.ps
			String sql="insert into pd(no,pdname,price)"
					+ "VALUES(PD_SEQ.nextval,?,?)";
			ps=con.prepareStatement(sql);
			
			
			//in parameter setting
			
			ps.setString(1, dto.getPdName());
			ps.setInt(2, dto.getPrice());
			
			//4. exec
			
			int cnt=ps.executeUpdate();
			System.out.println("상품 등록 결과 cnt="+cnt +", 매개변수 dto="+dto);
		
			return cnt;
		}finally {
			pool.dbClose(ps, con);
		}
	}
	
	public List<PdDTO> selectAll() throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		List<PdDTO> list = new ArrayList<PdDTO>();
		try {
			//1,2
			con=pool.getConnection();
			
			//3
			String sql="select * from pd order by no desc";
			ps=con.prepareStatement(sql);
			
			
			//4 exec
			rs=ps.executeQuery();
			while(rs.next()) {
				int no=rs.getInt("no");
				int price=rs.getInt("price");
				String pdName=rs.getString("pdName");
				Timestamp regdate=rs.getTimestamp("regdate");
				
				 PdDTO dto = new PdDTO(no, pdName, price, regdate);
				 
				 list.add(dto);
			}
			System.out.println("상품 전체 조회 결과 list.size="+ list.size());
			
			return list;
		}finally {
			pool.dbClose(rs, ps, con);
		}
	}
	
	public PdDTO selectByNo(int no) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		PdDTO dto = new PdDTO();
		try {
			//1,2
			con=pool.getConnection();
			//3
			String sql="select * from pd where no=?";
			ps=con.prepareStatement(sql);
			
			ps.setInt(1, no);
			
			//4
			rs=ps.executeQuery();
			if(rs.next()) {
				int price=rs.getInt("price");
				String pdName=rs.getString("pdname");
				Timestamp regdate=rs.getTimestamp("regdate");
			
				dto.setNo(no);
				dto.setPdName(pdName);
				dto.setPrice(price);
				dto.setRegdate(regdate);
			}
			
			System.out.println("번호로 조회 결과, dto =" + dto+", 매개변수 no="+ no);
			return dto;
		}finally {
			pool.dbClose(rs, ps, con);
		}
		
	}
	
	public int deletePd(int no) throws SQLException {
		Connection con=null;
		PreparedStatement ps =null;
		
		try {
			//1,2
			con=pool.getConnection();
			
			//3
			String sql="delete from pd where no=?";
			ps=con.prepareStatement(sql);
			
			ps.setInt(1, no);
			
			//4
			int cnt = ps.executeUpdate();
			System.out.println("상품 삭제 결과 cnt ="+cnt+", 매개변수 no="+no);
			
			return cnt;
		}finally {
			pool.dbClose(ps, con);
		}
	}
	
	public int updatePd(PdDTO dto) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs = null;
		
		
		try {
			con=pool.getConnection();
			String sql="update pd"
					+ " set pdname=?, price=?"
					+ " where no=?";
			ps=con.prepareStatement(sql);
			
			ps.setString(1, dto.getPdName());
			ps.setInt(2, dto.getPrice());
			ps.setInt(3, dto.getNo());
			
			int cnt=ps.executeUpdate();
			System.out.println("상품수정 결과 cnt="+ cnt+", 매개변수 dto="+dto);
			
			return cnt;
		}finally {
			pool.dbClose(ps, con);
			
			
		}
	}
}

