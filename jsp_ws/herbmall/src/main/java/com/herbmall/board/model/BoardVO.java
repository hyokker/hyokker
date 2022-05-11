package com.herbmall.board.model;

import java.sql.Timestamp;

public class BoardVO {
	private int no;
	private String name;	
	private String pwd;
	private String title;
	private String email;
	private Timestamp regdate;
	private int readcount;
	private String content;
	
	
	public BoardVO() {
		super();
	}

	public BoardVO(int no, String name, String pwd, String title, String email, Timestamp regdate, int readcount,
			String content) {
		super();
		this.no = no;
		this.name = name;
		this.pwd = pwd;
		this.title = title;
		this.email = email;
		this.regdate = regdate;
		this.readcount = readcount;
		this.content = content;
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

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getRegdate() {
		return regdate;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}

	public int getReadcount() {
		return readcount;
	}

	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "BoardVO [no=" + no + ", name=" + name + ", pwd=" + pwd + ", title=" + title + ", email=" + email
				+ ", regdate=" + regdate + ", readcount=" + readcount + ", content=" + content + "]";
	}
		
}
