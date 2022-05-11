/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ez.alist.model;

import com.db.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import com.ez.alist.model.alistDTO;

/**
 *
 * @author HYOKKER
 */
public class alistDAO {

    public List<alistDTO> selectAll() throws SQLException {
        //1
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        List<alistDTO> list = new ArrayList<alistDTO>();
        try{
        con=DBUtil.getConnection();
        
        String sql="select * from alist order by ano";
        ps=con.prepareStatement(sql);
        
        rs=ps.executeQuery();
        while(rs.next()) {
		int no=rs.getInt(1);
		String cId=rs.getString(2);
		String cName=rs.getString(3);
                String kind=rs.getString(4);
                String price=rs.getString(5);
                String waresize=rs.getString(6);
                String wareweight=rs.getString(7);
		Timestamp regdate=rs.getTimestamp(8);
                String description=rs.getString(9);

		//[1] 하나의 레코드를 DTO로 묶어준다
                alistDTO dto = new alistDTO(no, cId, cName, kind, price, waresize, wareweight, regdate, description);
		//[2] 여러개의 DTO를 list로 묶는다
		list.add(dto);
            }
                System.out.println("접수 전체 조회 결과 list.size="+list.size());
                
                return list;
            }finally{
                DBUtil.dbClose(rs, ps, con);
        }
    }

    public int insertA(alistDTO dto) throws SQLException {
        Connection con =null;
        PreparedStatement ps =null;
        
        try{
            con=DBUtil.getConnection();
            String sql="insert into alist(ano,cid,cname,kind,price,waresize,wareweight)\n" +
                "values(ano_seq.nextval,?,?,?,?,?,?)";
            ps=con.prepareStatement(sql);
            
            ps.setString(1,dto.getcId());
            ps.setString(2, dto.getcName());
            ps.setString(3, dto.getKind());
            ps.setString(4, dto.getPrice());
            ps.setString(5, dto.getWaresize());
            ps.setString(6, dto.getWareweight());
            
            int cnt = ps.executeUpdate();
            System.out.println("물품 등록 결과 cnt="+ cnt+", 매개변수 dto="+dto);

			return cnt;
            
        }finally{
            DBUtil.dbClose(ps, con);
        }
    }

    public alistDTO selectByNo(int no) throws SQLException {
        Connection con= null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        alistDTO dto = new alistDTO();
            try{
                con=DBUtil.getConnection();
                String sql="select * from alist where ano=?";
                ps=con.prepareStatement(sql);
                
                ps.setInt(1, no);
                
                rs=ps.executeQuery();
			if(rs.next()) {
				int aNo=rs.getInt("aNo");
				String cid=rs.getString("cId");
				String cName=rs.getString("cName");
				String kind=rs.getString("kind");
                                String price=rs.getString("price");
                                String waresize=rs.getString("waresize");
                                String wareweight=rs.getString("wareweight");
				String desc=rs.getString("description");
                                
				Timestamp regdate=rs.getTimestamp("regdate");

				//하나의 레코드는 하나의 DTO
				//컬럼의 값들을 DTO에 넣어서 DTO 하나를 리턴한다
				dto.setaNo(no);
				dto.setcName(cName);
				dto.setcId(cid);
				dto.setKind(kind);
                                dto.setPrice(price);
                                dto.setWaresize(waresize);
                                dto.setWareweight(wareweight);
                                dto.setDescription(desc);
                                
			}

			System.out.println("번호로 조회 결과 dto="+dto+", 매개변수 no="+no);

			return dto;
            }finally{
                
            }
       
    }
    public int deleteAlist(int no) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			//1,2 con
			con=DBUtil.getConnection();
			
			//3 ps
			String sql="delete from alist where ano=?";
			ps=con.prepareStatement(sql);
			
			ps.setInt(1, no);
			
			//4 exec
			int cnt=ps.executeUpdate();
			System.out.println("접수 취소 결과 cnt="+cnt+", 매개변수 no="+ no);
			
			return cnt;
		}finally {
			DBUtil.dbClose(ps, con);
		}
	}
}
