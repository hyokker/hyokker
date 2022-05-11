package com.day19.sample;

public class FruitMain {

	public static void main(String[] args) {
		FruitBuyer buyer = new FruitBuyer(10000);
		
		FruitSeller seller1 = new FruitSeller(30,0,1500);
		FruitSeller seller2 = new FruitSeller(20,0,1000);
		buyer.buyApple(seller1,4500);//사과 30개, 하나당 가격 1500인 판매자에게 4500원 어치 구매
		buyer.buyApple(seller2,2000);//사과 20개, 하나당 가격 1000인 판매자에게 2000원 어치 구매
		 
	
		seller1.showResult();
		seller2.showResult();
		buyer.showResult();
		
		
		buyer.buyApple(seller1, 2000);
		buyer.showResult();
		
		buyer.buyApple(seller2, 5000);
		buyer.showResult();
	
	
		seller1.showResult();
		seller2.showResult();
	}

}
