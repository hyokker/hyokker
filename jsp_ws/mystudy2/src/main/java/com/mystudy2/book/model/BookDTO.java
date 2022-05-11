package com.mystudy2.book.model;

import java.sql.Timestamp;

public class BookDTO {
	private int no;
	private String title;
	private int price;
	private String publisher;
	private Timestamp joindate;
	
	
	public BookDTO() {
		super();
	}


	public BookDTO(int no, String title, int price, String publisher, Timestamp joindate) {
		super();
		this.no = no;
		this.title = title;
		this.price = price;
		this.publisher = publisher;
		this.joindate = joindate;
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public Timestamp getJoindate() {
		return joindate;
	}


	public void setJoindate(Timestamp joindate) {
		this.joindate = joindate;
	}


	@Override
	public String toString() {
		return "BookDTO [no=" + no + ", title=" + title + ", price=" + price + ", publisher=" + publisher
				+ ", joindate=" + joindate + "]";
	}
	
	
}