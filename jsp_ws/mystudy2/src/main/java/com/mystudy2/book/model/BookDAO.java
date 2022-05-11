package com.mystudy2.book.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.mystudy2.db.ConnectionPoolMgr;

public class BookDAO {
	private ConnectionPoolMgr pool;
	
	
	public BookDAO() {
		pool=new ConnectionPoolMgr();
	}
	
	public int insertBook(BookDTO dto) throws SQLException {
		Connection con =null;
		PreparedStatement ps=null;
		
		try {
			//1,2
			con=pool.getConnection();
			
			//3
			String sql="insert into book(no,title,price,publisher)\r\n"
					+ "values(BOOK_SEQ.nextval,?,?,?)";
			ps=con.prepareStatement(sql);
			
			ps.setString(1, dto.getTitle());
			ps.setInt(2, dto.getPrice());
			ps.setString(3, dto.getPublisher());
			
			int cnt=ps.executeUpdate();
			System.out.println("책 등록 결과 cnt ="+cnt+"매개변수 dto ="+dto);
			return cnt;
		}finally {
			pool.dbClose(ps, con);
		}
	}
	
	public List<BookDTO> selectAll() throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		List<BookDTO> list = new ArrayList<BookDTO>();
		try {
			con=pool.getConnection();
			
			String sql="select * from book order by no desc";
			ps=con.prepareStatement(sql);
			
			rs=ps.executeQuery();
			while(rs.next()) {
				int no=rs.getInt("no");
				String title=rs.getString("title");
				int price=rs.getInt("price");
				String publisher=rs.getString("publisher");
				Timestamp joindate=rs.getTimestamp("joindate");
				
				BookDTO dto =new BookDTO(no, title, price, publisher, joindate);
				
				list.add(dto);
				
			}
			System.out.println("상품 전체 조회 결과 list.size()="+list.size());
			return list;
		
		}finally {
			pool.dbClose(rs, ps, con);
		}
	}
	
	
	public BookDTO selectByNo(int no) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		BookDTO dto = new BookDTO();
		
		try {
			con=pool.getConnection();
			
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
			System.out.println("번호로 조회결과 dto ="+dto+", 매개변수 no="+no);
			return dto;
		}finally {
			pool.dbClose(rs, ps, con);
		}
	}
}