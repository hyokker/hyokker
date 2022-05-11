package com.pd.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.db.DBUtil;

public class BookDAO {
	public static  int updateBook(BookDTO dto) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con=DBUtil.getConnection();
			
			String sql="update book set title=?, price=?, publisher=? where no=?";
			ps=con.prepareStatement(sql);
			
			ps.setString(1, dto.getTitle());
			ps.setInt(2, dto.getPrice());
			ps.setString(3, dto.getPublisher());
			ps.setInt(4, dto.getNo());
			
			int cnt=ps.executeUpdate();
			System.out.println("책 수정 결과 cnt:"+cnt+", 매개변수 dto :" + dto);
			
			return cnt;
		} finally {
			DBUtil.dbClose(ps, con);
		}
	}
	
	public static   List<BookDTO> selectByTitle(String sTitle) throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		List<BookDTO> list = new ArrayList<BookDTO>();
		try {
			con=DBUtil.getConnection();
			
			String sql="select * from book where title=?";
			ps=con.prepareStatement(sql);
			
			ps.setString(1, sTitle);
			
			rs=ps.executeQuery();
			while(rs.next()) {
				int no =rs.getInt(1);
				String title = rs.getString(2);
				int price = rs.getInt(3);
				String publisher = rs.getString(4);
				Timestamp joindate = rs.getTimestamp(5);
				
				BookDTO dto = new BookDTO(no, title, price, publisher, joindate);
				
				list.add(dto);
			}
			
		} catch(SQLException e){
			e.printStackTrace();
		} finally {
			DBUtil.dbClose(rs, ps, con);
		}
		return list;
	}
	
	
	
	public static  int insertBook(BookDTO dto) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con=DBUtil.getConnection();
			
			String sql="insert into book values(book_seq.nextval,?,?,?,sysdate)";
			ps=con.prepareStatement(sql);
			
			//in parameter setting
			
			ps.setString(1, dto.getTitle());
			ps.setInt(2, dto.getPrice());
			ps.setString(3, dto.getPublisher());

			int cnt = ps.executeUpdate();
			System.out.println("책 등록 결과 cnt:" + cnt + ", 매개변수 dto=" + dto);

			return cnt;
		} finally {
			DBUtil.dbClose(ps, con);
		}
	}
	
	public static int deleteBook(int no) throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con=DBUtil.getConnection();
			String sql="delete from book where no=?";
			ps=con.prepareStatement(sql);
			
			ps.setInt(1, no);

			int cnt=ps.executeUpdate();
			System.out.println("책 삭제 결과 cnt:"+cnt);
			
			return cnt;
			
		} finally {
			DBUtil.dbClose(ps, con);
		}
	}
	
	public static BookDTO selectByNo(int no) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs= null;
		
		BookDTO dto = new BookDTO();//결과 레코드 하나를 DTO 로 묶어서 리턴하려는 용도
		try {
			con=DBUtil.getConnection();
			
			String sql="select * from book where no=?";
			ps=con.prepareStatement(sql);
			
			ps.setInt(1, no);
			
			rs=ps.executeQuery();
			if(rs.next()) {
				String title=rs.getString("title");
				int price=rs.getInt("price");
				String publisher=rs.getString("publisher");
				Timestamp joindate=rs.getTimestamp("joindate");
				
				dto.setNo(no);
				dto.setTitle(title);
				dto.setPrice(price);
				dto.setPublisher(publisher);
				dto.setJoindate(joindate);
			}
			System.out.println("번호로 조회 결과 dto =" + dto +", 매개변수 no=" + no);
			return dto;
		
		} finally {
			DBUtil.dbClose(ps, con);
		}
	}
	

}
