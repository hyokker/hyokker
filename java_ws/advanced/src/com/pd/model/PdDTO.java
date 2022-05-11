package com.pd.model;

import java.sql.Timestamp;

/*
DTO(Data Transfer Object), VO(Value Object), Bean
객체를 표현한 한 단위
데이터를 전달하는 단위

빈즈 규약(캡슐화된 객체)
- 멤버변수는 private으로
- 멤버변수에 대한 접근은 getter/setter로
*/

public class PdDTO {
	//1. private 멤버변수
	private int no;
	private String pdName; //마우스
	private int price; //19000
	private Timestamp regdate;
	
	//2. 생성자
	public PdDTO() {
		super();
	}

	public PdDTO(int no, String pdName, int price, Timestamp regdate) {
		super();
		this.no = no;
		this.pdName = pdName;
		this.price = price;
		this.regdate = regdate;
	}

	//3. getter/setter
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getPdName() {
		return pdName;
	}

	public void setPdName(String pdName) {
		this.pdName = pdName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Timestamp getRegdate() {
		return regdate;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}

	//4. toString()
	@Override
	public String toString() {
		return "PdDTO [no=" + no + ", pdName=" + pdName + ", price=" + price + ", regdate=" + regdate + "]";
	}
	 
	
	
	
}
