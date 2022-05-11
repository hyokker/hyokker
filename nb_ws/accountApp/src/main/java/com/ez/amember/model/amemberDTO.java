/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ez.amember.model;

import oracle.sql.TIMESTAMP;

/**
 *
 * @author HYOKKER
 */
public class amemberDTO {
    private String userid;
    private String cname;
    private String pwd;
    private String address1;
    private String address2;
    private String email;
    private String tel;
    private String coupon;
    private String zipcode;
    private TIMESTAMP regdate;

    public amemberDTO() {
    }

    public amemberDTO(String userid, String cname, String pwd, String address, String email, String tel, String coupon, TIMESTAMP regdate) {
        this.userid = userid;
        this.cname = cname;
        this.pwd = pwd;
        this.address1 = address;
        this.email = email;
        this.tel = tel;
        this.coupon = coupon;
        this.regdate = regdate;
    }

    public amemberDTO(String userid, String cname, String pwd, String address1, String address2, String email, String tel, String coupon, TIMESTAMP regdate) {
        this.userid = userid;
        this.cname = cname;
        this.pwd = pwd;
        this.address1 = address1;
        this.address2 = address2;
        this.email = email;
        this.tel = tel;
        this.coupon = coupon;
        this.regdate = regdate;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

    public TIMESTAMP getRegdate() {
        return regdate;
    }

    public void setRegdate(TIMESTAMP regdate) {
        this.regdate = regdate;
    }

    @Override
    public String toString() {
        return "amemberDTO{" + "userid=" + userid + ", cname=" + cname + ", pwd=" + pwd + ", address1=" + address1 + ", address2=" + address2 + ", email=" + email + ", tel=" + tel + ", coupon=" + coupon + ", regdate=" + regdate + '}';
    }

}
