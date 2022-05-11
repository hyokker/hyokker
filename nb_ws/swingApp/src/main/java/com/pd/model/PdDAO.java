package com.pd.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.db.DBUtil;
import java.util.Vector;

//DAO(Data Access Object)
//데이터베이스 작업을 전담하는 객체
/*
CRUD
C : create, insert
R : read, select
U : update
D : delete
 */

public class PdDAO {

	/**
	 * 상품 등록 메서드
	 * @param dto
	 * @return
	 * @throws SQLException
	 */
	//[1] 입력, 수정시 사용 - 매개변수가 DTO인 유형
	public int insertPd(PdDTO dto) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;

		try {
			//1, 2
			con=DBUtil.getConnection();

			//3
			String sql="insert into pd(no, pdname, price, description)"
					+ " values (pd_seq.nextval, ?,?, ?)";
			ps=con.prepareStatement(sql);

			ps.setString(1, dto.getPdName()); //마우스
			ps.setInt(2, dto.getPrice()); //19000
			ps.setString(3, dto.getDescription());

			//4
			int cnt=ps.executeUpdate();
			System.out.println("상품 등록 결과 cnt="+ cnt+", 매개변수 dto="+dto);

			return cnt;
		}finally {
			DBUtil.dbClose(ps, con);
		}		
	}

	/**
	 * 번호로 조회하는 메서드
	 * @param no
	 * @return
	 * @throws SQLException
	 */
	//[2] select 결과 레코드가 하나인 경우 사용 - 반환타입이  DTO인 유형
	public PdDTO selectByNo(int no) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;

		PdDTO dto = new PdDTO(); //결과 레코드 하나를 DTO로 묶어서 리턴하려는 용도
		try {
			//1,2 con
			con=DBUtil.getConnection();

			//3.ps
			String sql="select * from pd where no=?";
			ps=con.prepareStatement(sql);

			ps.setInt(1, no);

			//4. exec
			rs=ps.executeQuery();
			if(rs.next()) {
				int price=rs.getInt("price");
				String pdName=rs.getString("pdname");
				Timestamp regdate=rs.getTimestamp("regdate");
				String desc=rs.getString("description");

				//하나의 레코드는 하나의 DTO
				//컬럼의 값들을 DTO에 넣어서 DTO 하나를 리턴한다
				dto.setNo(no);
				dto.setPdName(pdName);
				dto.setPrice(price);
				dto.setRegdate(regdate);
                                dto.setDescription(desc);
			}

			System.out.println("번호로 조회 결과 dto="+dto+", 매개변수 no="+no);

			return dto;
		}finally {
			DBUtil.dbClose(rs, ps, con);
		}
	}

	/**
	 * 전체조회하는 메서드
	 * @return
	 * @throws SQLException
	 */
	//[3] select 결과 레코드가 여러개인 경우 사용 - 반환타입이 List인 유형
	public List<PdDTO> selectAll() throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;

		//여러 개의 레코드(DTO)를 list로 묶어서 리턴하려는 용도
		List<PdDTO> list = new ArrayList<PdDTO>();
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
				String desc=rs.getString(5);

				//[1] 하나의 레코드를 DTO로 묶어준다
				PdDTO dto = new PdDTO(no, pdName, price, regdate, desc);

				//[2] 여러개의 DTO를 list로 묶는다
				list.add(dto);
			}
			System.out.println("상품전체 조회 결과 list.size="+list.size());

			return list;
		}finally {
			DBUtil.dbClose(rs, ps, con);
		}
	}

	public int updatePd(PdDTO dto) throws SQLException {
		Connection con= null;
		PreparedStatement ps= null;
		try {
			con=DBUtil.getConnection();

			String sql="update pd set pdname=? , price=?, description=? where no=? ";
			ps= con.prepareStatement(sql);

			ps.setString(1,dto.getPdName());
			ps.setInt(2,dto.getPrice() );
			ps.setString(3,dto.getDescription());
			ps.setInt(4,dto.getNo());

			int cnt= ps.executeUpdate();
			System.out.println("상품 수정결과 cnt="+cnt +", 매개변수 dto="+dto);

			return cnt;
		}finally{
			DBUtil.dbClose(ps, con);
		}
	}

	public List<PdDTO> selectByName(String pdName) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		List<PdDTO> list = new ArrayList<PdDTO>();
		try {
			//1,2
			con = DBUtil.getConnection();
			
			//3
			String sql="select * from pd where pdName = ?";			
			ps=con.prepareStatement(sql);
			
			ps.setString(1, pdName);
			
			//4
			rs=ps.executeQuery();
			while(rs.next()) {
				int no=rs.getInt(1);
				int price=rs.getInt(3);
				Timestamp regdate=rs.getTimestamp(4);
				String desc=rs.getString(5);
				
				//[1]
				PdDTO dto = new PdDTO(no, pdName, price, regdate, desc);
				
				//[2]
				list.add(dto);
			}
			System.out.println("이름으로 조회 결과 list.size="+list.size()
				+ ", 매개변수 pdName="+ pdName);
			
			return list;
		} finally {
			DBUtil.dbClose(rs, ps, con);
		}

	}

	public int deletePd(int no) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			//1,2 con
			con=DBUtil.getConnection();
			
			//3 ps
			String sql="delete from pd where no=?";
			ps=con.prepareStatement(sql);
			
			ps.setInt(1, no);
			
			//4 exec
			int cnt=ps.executeUpdate();
			System.out.println("상품 삭제 결과 cnt="+cnt+", 매개변수 no="+no);
			
			return cnt;
		}finally {
			DBUtil.dbClose(ps, con);
		}
	}
	
	public int deletePd2(PdDTO dto) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			//1,2 con
			con=DBUtil.getConnection();
			
			//3 ps
			String sql="delete from pd where no=?";
			ps=con.prepareStatement(sql);
			
			ps.setInt(1, dto.getNo());
			
			//4 exec
			int cnt=ps.executeUpdate();
			System.out.println("상품 삭제 결과 cnt="+cnt+", 매개변수 dto="+dto);
			
			return cnt;
		}finally {
			DBUtil.dbClose(ps, con);
		}
	}
        
        public Vector<String> selectPdName() throws SQLException{
            Connection con = null;
            PreparedStatement ps=null;
            ResultSet rs = null;
            
            Vector<String> vec = new Vector<>();
            try{//1,2
                con=DBUtil.getConnection();
                //3        
                String sql="select pdName from pd";
                ps=con.prepareStatement(sql);
            
                //4
                rs=ps.executeQuery();
                while(rs.next()){
                    String pdName=rs.getString(1);
                    
                    
                    vec.add(pdName);
                }
                System.out.println("상품명조회결과 vec.size="+ vec.size());
                return vec;
            
            
            }finally{
                DBUtil.dbClose(rs, ps, con);
            }
        }
}
