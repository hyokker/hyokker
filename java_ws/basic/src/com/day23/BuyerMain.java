package com.day23;

public class BuyerMain {

	public static void main(String[] args) {
		Buyer b = new Buyer(1000);
		
		//100만원인 TV 구매
		Product tv= new TV(100);
		b.buy(tv);
		
		//200만원인 Computer 구매
		b.buy(new Computer(200));
	
		//summary 호출
		b.summary();
		
		//구매한 TV반품
		b.refund(tv);
		
		//summary 호출
		b.summary();
	
	}

}
