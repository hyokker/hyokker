package com.day14;

import java.util.Scanner;

class FoodSale{
	//1.�������
	private String menu; //�޴�
	private int quantity; //����
	private int count;	// �ܰ�
	private int  salePrice;	//�Ǹűݾ�
	
	//������
	//2.static ���� => ���Ǹűݾ�
	private static double sc=0.15;
	private static int totalSalePrice;
	
	
	//3.������
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
			System.out.println("�޴�, ����, �ܰ��� �Է��ϼ��� !");
			String menu = sc.nextLine();
			int qty = sc.nextInt();
			int count = sc.nextInt();
			
			FoodSale fs = new FoodSale(menu, qty, count);
			fs.saleCount();
			fs.totalSaleCount();
			
			System.out.println("�Ǹ� �ݾ� = " + fs.getSalePrice() );
			System.out.println("���� �ݾ� = " + FoodSale.getTotalSalePrice());
			
			System.out.println("�׸��Ͻðڽ��ϱ�? <Q>uit");
			sc.nextLine();
			String quit = sc.nextLine();
			if(quit.equalsIgnoreCase("Q")) break;
		}
	}

}
