package com.pd.model;

import java.sql.Timestamp;

public class PersonDTO {
	private int no;
	private String name;
	private String tel;
	private Timestamp regdate;
	
	
	public PersonDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PersonDTO(int no, String name, String tel, Timestamp regdate) {
		super();
		this.no = no;
		this.name = name;
		this.tel = tel;
		this.regdate = regdate;
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public Timestamp getRegdate() {
		return regdate;
	}


	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}


	@Override
	public String toString() {
		return "PersonDTO [no=" + no + ", name=" + name + ", tel=" + tel + ", regdate=" + regdate + "]";
	}
	
	
}
