package com.pd.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.db.DBUtil;

public class ProductDAO {
	
	public List<ProductDTO> selectByPrice(int min, int max) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<ProductDTO> list = new ArrayList<ProductDTO>();
		//1 db¿¬°á
		try {
		con=DBUtil.getConnection();
		
		String sql="select * from product  where p_price between ? and ?  ";
		ps=con.prepareStatement(sql);
		
		ps.setInt(1, min);
		ps.setInt(2, max);
		rs=ps.executeQuery();
		while(rs.next()) {
			ProductDTO dto = new ProductDTO(rs.getInt(1), rs.getString(2), rs.getInt(3));
			list.add(dto);
		}
		return list;
		
		}finally {
			DBUtil.dbClose(rs, ps, con);
		}
	

	
	}
}
