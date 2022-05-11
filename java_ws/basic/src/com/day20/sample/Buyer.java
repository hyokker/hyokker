package com.day20.sample;

public class Buyer {
	private int myMoney;
	private int point;
	
	//구매한 상품을 저장한 배열 추가
	private final int MAX_COUNT=10;
	private Product[] pdArr = new Product[MAX_COUNT];
	private int idx;
	
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
		//구매한 상품을 배열에 저장
		pdArr[idx++] = p;
		
		System.out.println(p.findInfo()+ " 을(를) 구매하였습니다.");
	}
	
	public void summary() {
		//구매한 상품명과 상품 가격의 합계 구하기
		int sum=0;
		String itemList="";
		
		for(int i=0;i<idx;i++) {
			//Product p = pdArr[i];
			sum+=pdArr[i].getPrice();
			itemList+=pdArr[i].findInfo();
			if(i<idx-1) {
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
	
	

}
