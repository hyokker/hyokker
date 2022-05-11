/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ez.amember.model;

import com.db.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author HYOKKER
 */
public class amemberDAO {
    public int loginCheck(String userid, String pwd) throws SQLException{
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs=null;
        int result=0;
        
        try{
            
        con=DBUtil.getConnection();
         String sql="select Pwd from amember where userid=?";
        ps=con.prepareCall(sql);
        ps.setString(1, userid);
        
       
        rs=ps.executeQuery();
        if(rs.next()){
                String dbPwd=rs.getString(1);
                if(dbPwd.equals(pwd)){
                    result=amemberService.LOGIN_OK;  //로그인 성공
                }else{
                    result=amemberService.PWD_DISAGREE; //비밀번호 불일치
                }
            }else{
                result=amemberService.NONE_USERID;  //아이디 존재하지 않음
            }
            System.out.println("로그인 처리 결과 result="+result+", 매개변수 userid="
                    + userid+", pwd="+pwd);
            
            return result;
        }finally{
            DBUtil.dbClose(rs, ps, con);
        }
    }
    
    public int insertAmember(amemberDTO dto) throws SQLException{
        Connection con= null;
        PreparedStatement ps = null;
        
        try{
            con=DBUtil.getConnection();
            String sql="insert into amember(userid,cname,pwd,zipcode,address,address2,email,tel)\n" +
                        "VALUES(?,?,?,?,?,?,?,?)";
            ps=con.prepareStatement(sql);
            
            ps.setString(1, dto.getUserid());
            ps.setString(2, dto.getCname());
            ps.setString(3, dto.getPwd());
            ps.setString(4, dto.getZipcode());
            ps.setString(5, dto.getAddress1());
            ps.setString(6, dto.getAddress2());
            ps.setString(7, dto.getEmail());
            ps.setString(8, dto.getTel());

            
            int cnt = ps.executeUpdate();
            System.out.println("회원가입 결과 cnt :" + cnt +"입력값 dto :"+dto);
            return cnt;
        }finally{
            DBUtil.dbClose(ps, con);
        }
        
    }

    public int duplicate(String userid) throws SQLException {
     Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        int result=0;
        try{
            //1,2
            con=DBUtil.getConnection();
            
            //3
            String sql="select count(*) from amember where userid=?";
            ps=con.prepareStatement(sql);
            ps.setString(1, userid);
            
            //4
            rs=ps.executeQuery();
            if(rs.next()){
                int count=rs.getInt(1);
                if(count>0){
                    result=amemberService.NONE_USABLE_ID;  //이미 아이디 존재=>사용불가
                }else{
                    result=amemberService.USABLE_ID; //사용가능
                }
            }
            System.out.println("아이디 중복확인 result="+result+", 매개변수 userid="+userid);
            return result;                    
        }finally{
            DBUtil.dbClose(rs, ps, con);
        }
    }
}
