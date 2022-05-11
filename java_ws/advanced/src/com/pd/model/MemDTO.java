package com.pd.model;

import java.sql.Timestamp;

public class MemDTO {
	private int no;
	private String id;
	private String pwd;
	private String name;
	private String hp;
	private Timestamp regdate;
	
	public MemDTO(int no, String id, String pwd, String name, String hp, Timestamp regdate) {
		super();
		this.no = no;
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.hp = hp;
		this.regdate = regdate;
	}

	public MemDTO() {
		super();
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public Timestamp getRegdate() {
		return regdate;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "MemDTO [no=" + no + ", id=" + id + ", pwd=" + pwd + ", name=" + name + ", hp=" + hp + ", regdate="
				+ regdate + "]";
	}
	
}
