/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ez.alist.model;

import java.util.Date;
import java.util.List;
import java.sql.Timestamp;

/**
 *
 * @author HYOKKER
 */
public class alistDTO {
        private int aNo;
	private String cId;
	private String cName;
	private String kind;
	private String price;
	private String waresize;
	private String wareweight;
	private Timestamp regdate;
        private String description;
        
        
    public alistDTO() {
    }

    public alistDTO(int aNo, String cId, String cName, String kind, String price, String waresize, String wareweight, Timestamp regdate, String description) {
        this.aNo = aNo;
        this.cId = cId;
        this.cName = cName;
        this.kind = kind;
        this.price = price;
        this.waresize = waresize;
        this.wareweight = wareweight;
        this.regdate = regdate;
        this.description=description;
    }

    public alistDTO(int aNo, String cId, String cName) {
        this.aNo = aNo;
        this.cId = cId;
        this.cName = cName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public int getaNo() {
        return aNo;
    }

    public void setaNo(int aNo) {
        this.aNo = aNo;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getWaresize() {
        return waresize;
    }

    public void setWaresize(String waresize) {
        this.waresize = waresize;
    }

    public String getWareweight() {
        return wareweight;
    }

    public void setWareweight(String wareweight) {
        this.wareweight = wareweight;
    }

    public Timestamp getRegdate() {
        return regdate;
    }

    public void setRegdate(Timestamp regdate) {
        this.regdate = regdate;
    }

    @Override
    public String toString() {
        return "alistDTO{" + "aNo=" + aNo + ", cId=" + cId + ", cName=" + cName + ", kind=" + kind + ", price=" + price + ", waresize=" + waresize + ", wareweight=" + wareweight + ", regdate=" + regdate + '}'+", description="+description+'}';
    }

 
    
}
