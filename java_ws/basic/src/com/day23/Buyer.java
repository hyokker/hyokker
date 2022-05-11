package com.day23;

import java.util.ArrayList;



public class Buyer {
	private int myMoney;
	private int point;
	
	//구매한 상품을 저장할 컬렉션 추가
	private ArrayList<Product> list = new ArrayList<Product>(50);   
	
	public Buyer(int money) {
		this.myMoney=money;
	}
	
	//구매 메서드

	public void buy(Product p) {
		if(myMoney < p.getPrice()) {
			System.out.println("잔액이 부족하여 물건을 구매할 수 없습니다.");
			return;
		}
		
		//잔고는 줄고, 포인트는 늘어난다.
		myMoney -= p.getPrice();
		point+= p.getPoint();
		//구매한 상품을 컬렉션에 저장
		list.add(p);
		
		System.out.println(p+ " 을(를) 구매하였습니다.");
	}
	
	public void summary() {
		//구매한 상품명과 상품 가격의 합계 구하기
		int sum=0;
		String itemList="";
		
		if(list.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다");
			return;			
		}
		
		for(int i=0;i<list.size();i++) {
			Product p = list.get(i);
			sum+=p.getPrice();
			itemList+=p;
			if(i<list.size()-1) {
				itemList+=",";
			}
		}
		System.out.println("구매하신 물건의 총 금액은 " + sum + "입니다");
		System.out.println("구입하신 제품은 "+ itemList + "입니다.");
	}
	
	
	public void showInfo() {
		System.out.println("현재 잔고 " + myMoney);
		System.out.println("보너스 포인트 " + point+"\n");
	}
	
	public void refund(Product p) {
		//boolean remove(Object o)	
		if(list.remove(p)) {
			myMoney+=p.getPrice();
			point-=p.getPoint();
			System.out.println(p+"를 반품하셨습니다.");
		}else {
			System.out.println("구매한 상품 중 해당 제품이 없습니다");
		}
	}

}
