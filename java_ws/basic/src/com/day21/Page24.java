package com.day21;

import java.util.ArrayList;

class Product{
	private int code;
	private String pdName;
	private int price;
	
	
	Product(int code, String pdName, int price){
		this.code=code;
		this.pdName=pdName;
		this.price=price;
	}
	
	public int getCode() {
		return code;
	}
	public void SetCode(int code) {
		this.code=code;
	}
	public String getPdName() {
		return pdName;
	}
	public void SetCode(String pdName) {
		this.pdName=pdName;
	}
	public int getPrice() {
		return price;
	}
	public void SetPrice(int price) {
		this.price=price;
	}
	
	public String toString() {
		return "상품번호 = "+code+",상품명 = "+pdName+", 상품 가격 = "+ price;
	}
	
}
public class Page24 {

	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<Product>();
		
		list.add(new Product(1, "고오스빵", 1500));
		list.add(new Product(2, "피카츄빵", 2500));
		list.add(new Product(3, "로켓단빵", 3500));
		
		for(int i=0;i<list.size();i++) {
			Product p = list.get(i);
			System.out.println(p.toString());
		}
		
		System.out.println("======확장 for======");
		for(Product p : list) {
			System.out.println(p);
		}
		
		System.out.println("\n=============");
		Product[] pArr = new Product[3];
		
		
		pArr[0] = new Product(10, "사과", 1000);
		pArr[1] = new Product(11, "배", 2000);
		pArr[2] = new Product(12, "수박", 3000);
		
		for(int i=0; i<pArr.length;i++) {
			Product p=pArr[i];
			System.out.println(p);
		}
		System.out.println("\n=====확장 for=====");
		for(Product p2 : pArr) {
			System.out.println(p2);
		}
	}


}
