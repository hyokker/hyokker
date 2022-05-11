package com.day14;

import java.util.Scanner;

class BookSales{
	//1.멤버변수
	//인스턴스 변수
	private String title;	//제목
	private int quantity;	//수량
	private int price;		//단가
	private int salesPrice;	//판매금액
	
	//static 변수
	private static int totalSalesPrice; // 총 판매금액(각 객체들의 만패금액의 합계)
	//2.생성자
	BookSales(String title, int quantity, int price) {
		this.title=title;
		this.quantity=quantity;
		this.price=price;
	}
	
	//3.getter/setter
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	public int getSalesPrice() {
		return salesPrice;
	}
	
	public void setSalesPrice(int salesPrice) {
		this.salesPrice=salesPrice;
	}
	
	public static int getTotalSalesPrice() {
		return totalSalesPrice;
	}
	
	public static void setTotalSalesPrice(int totalSalesPrice) {
			BookSales.totalSalesPrice = totalSalesPrice;
	}
	//4.메서드
	
	public void findSalesPrice() {
		 salesPrice=quantity*price;
	}
	
	public void findTotal() {
		totalSalesPrice+=salesPrice;
	}
}

public class BookSalesTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("책 제목, 수량, 단가입력!");
			String title=sc.nextLine();
			int qty = sc.nextInt();
			int price = sc.nextInt();
			BookSales bs = new BookSales(title, qty, price);
			bs.findSalesPrice();
			bs.findTotal();
			
			System.out.println("\n판매금액 : " + bs.getSalesPrice()
				+ ", 누적 판매 금액 : " + BookSales.getTotalSalesPrice());
			
			System.out.println("그만하려면 Q");
			sc.nextLine();
			String quit=sc.nextLine();
			if(quit.equalsIgnoreCase("Q")) break;
		}//while
	}

}
