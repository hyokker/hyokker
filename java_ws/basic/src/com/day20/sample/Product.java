package com.day20.sample;

public abstract class Product {
	private int price; //��ǰ����
	private int Point; // ����Ʈ ����
	private final double POINT_RATE=0.02; // ������ 2%�� ����Ʈ ����

	public Product(int price) {
		this.price=price;
		this.Point=(int)(price*POINT_RATE);
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getPoint() {
		return Point;
	}
	
	public abstract String findInfo();
}

class TV extends Product{
		TV(int price){
			super(price);
		}
	
		public String findInfo() {
			return "TV";
		}
}

class Computer extends Product{
		Computer(int price){
			super(price);
		}
	
		public String findInfo() {
			return "Computer";
		}
}

	
