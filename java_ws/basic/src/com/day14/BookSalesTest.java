package com.day14;

import java.util.Scanner;

class BookSales{
	//1.�������
	//�ν��Ͻ� ����
	private String title;	//����
	private int quantity;	//����
	private int price;		//�ܰ�
	private int salesPrice;	//�Ǹűݾ�
	
	//static ����
	private static int totalSalesPrice; // �� �Ǹűݾ�(�� ��ü���� ���бݾ��� �հ�)
	//2.������
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
	//4.�޼���
	
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
			System.out.println("å ����, ����, �ܰ��Է�!");
			String title=sc.nextLine();
			int qty = sc.nextInt();
			int price = sc.nextInt();
			BookSales bs = new BookSales(title, qty, price);
			bs.findSalesPrice();
			bs.findTotal();
			
			System.out.println("\n�Ǹűݾ� : " + bs.getSalesPrice()
				+ ", ���� �Ǹ� �ݾ� : " + BookSales.getTotalSalesPrice());
			
			System.out.println("�׸��Ϸ��� Q");
			sc.nextLine();
			String quit=sc.nextLine();
			if(quit.equalsIgnoreCase("Q")) break;
		}//while
	}

}
