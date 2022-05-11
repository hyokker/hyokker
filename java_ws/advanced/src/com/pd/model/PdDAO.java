package com.pd.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.db.DBUtil;

//DAO(Data Access Object)
//�����ͺ��̽� �۾��� �����ϴ� ��ü
/*
CRUD
C : create, insert
R : read, select
U : update
D : delete
 */

public class PdDAO {

	/**
	 * ��ǰ ��� �޼���
	 * @param dto
	 * @return
	 * @throws SQLException
	 */
	//[1] �Է�, ������ ��� - �Ű������� DTO�� ����
	public int insertPd(PdDTO dto) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;

		try {
			//1, 2
			con=DBUtil.getConnection();

			//3
			String sql="insert into pd(no, pdname, price)"
					+ " values (pd_seq.nextval, ?,?)";
			ps=con.prepareStatement(sql);

			ps.setString(1, dto.getPdName()); //���콺
			ps.setInt(2, dto.getPrice()); //19000

			//4
			int cnt=ps.executeUpdate();
			System.out.println("��ǰ ��� ��� cnt="+ cnt+", �Ű����� dto="+dto);

			return cnt;
		}finally {
			DBUtil.dbClose(ps, con);
		}		
	}

	/**
	 * ��ȣ�� ��ȸ�ϴ� �޼���
	 * @param no
	 * @return
	 * @throws SQLException
	 */
	//[2] select ��� ���ڵ尡 �ϳ��� ��� ��� - ��ȯŸ����  DTO�� ����
	public PdDTO selectByNo(int no) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;

		PdDTO dto = new PdDTO(); //��� ���ڵ� �ϳ��� DTO�� ��� �����Ϸ��� �뵵
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

				//�ϳ��� ���ڵ�� �ϳ��� DTO
				//�÷��� ������ DTO�� �־ DTO �ϳ��� �����Ѵ�
				dto.setNo(no);
				dto.setPdName(pdName);
				dto.setPrice(price);
				dto.setRegdate(regdate);
			}

			System.out.println("��ȣ�� ��ȸ ��� dto="+dto+", �Ű����� no="+no);

			return dto;
		}finally {
			DBUtil.dbClose(rs, ps, con);
		}
	}

	/**
	 * ��ü��ȸ�ϴ� �޼���
	 * @return
	 * @throws SQLException
	 */
	//[3] select ��� ���ڵ尡 �������� ��� ��� - ��ȯŸ���� List�� ����
	public List<PdDTO> selectAll() throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;

		//���� ���� ���ڵ�(DTO)�� list�� ��� �����Ϸ��� �뵵
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

				//[1] �ϳ��� ���ڵ带 DTO�� �����ش�
				PdDTO dto = new PdDTO(no, pdName, price, regdate);

				//[2] �������� DTO�� list�� ���´�
				list.add(dto);
			}
			System.out.println("��ǰ��ü ��ȸ ��� list.size="+list.size());

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

			String sql="update pd set pdname=? , price=? where no=? ";
			ps= con.prepareStatement(sql);

			ps.setString(1,dto.getPdName());
			ps.setInt(2,dto.getPrice() );
			ps.setInt(3,dto.getNo());

			int cnt= ps.executeUpdate();
			System.out.println("��ǰ ������� cnt="+cnt +", �Ű����� dto="+dto);

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
				
				//[1]
				PdDTO dto = new PdDTO(no, pdName, price, regdate);
				
				//[2]
				list.add(dto);
			}
			System.out.println("�̸����� ��ȸ ��� list.size="+list.size()
				+ ", �Ű����� pdName="+ pdName);
			
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
			System.out.println("��ǰ ���� ��� cnt="+cnt+", �Ű����� no="+no);
			
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
			System.out.println("��ǰ ���� ��� cnt="+cnt+", �Ű����� dto="+dto);
			
			return cnt;
		}finally {
			DBUtil.dbClose(ps, con);
		}
	}
}
