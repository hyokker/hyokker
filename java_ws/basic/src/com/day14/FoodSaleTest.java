package com.day14;

import java.util.Scanner;

class FoodSale{
	//1.멤버변수
	private String menu; //메뉴
	private int quantity; //수량
	private int count;	// 단가
	private int  salePrice;	//판매금액
	
	//할인율
	//2.static 변수 => 총판매금액
	private static double sc=0.15;
	private static int totalSalePrice;
	
	
	//3.생성자
	FoodSale(String menu,int quantity,int count){
		this.menu=menu;
		this.quantity=quantity;
		this.count=count;
	}
	
	//4.getter/setter
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu=menu;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count=count;
	}
	
	public int getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(int salePrice) {
		this.salePrice=salePrice;
	}
	
	public static int getTotalSalePrice() {
		return totalSalePrice;
	}
	public static void setTotalSalePrice(int totalSalePrice) {
		FoodSale.totalSalePrice=totalSalePrice;
	}
	
	public void saleCount() {
		salePrice=(int)((quantity*count)-(quantity*count*sc));
	}
	
	public void totalSaleCount() {
		saleCount();
		FoodSale.totalSalePrice+=salePrice;
	}
}
public class FoodSaleTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("메뉴, 수량, 단가를 입력하세요 !");
			String menu = sc.nextLine();
			int qty = sc.nextInt();
			int count = sc.nextInt();
			
			FoodSale fs = new FoodSale(menu, qty, count);
			fs.saleCount();
			fs.totalSaleCount();
			
			System.out.println("판매 금액 = " + fs.getSalePrice() );
			System.out.println("누적 금액 = " + FoodSale.getTotalSalePrice());
			
			System.out.println("그만하시겠습니까? <Q>uit");
			sc.nextLine();
			String quit = sc.nextLine();
			if(quit.equalsIgnoreCase("Q")) break;
		}
	}

}
