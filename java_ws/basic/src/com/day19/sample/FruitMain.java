package com.day19.sample;

public class FruitMain {

	public static void main(String[] args) {
		FruitBuyer buyer = new FruitBuyer(10000);
		
		FruitSeller seller1 = new FruitSeller(30,0,1500);
		FruitSeller seller2 = new FruitSeller(20,0,1000);
		buyer.buyApple(seller1,4500);//��� 30��, �ϳ��� ���� 1500�� �Ǹ��ڿ��� 4500�� ��ġ ����
		buyer.buyApple(seller2,2000);//��� 20��, �ϳ��� ���� 1000�� �Ǹ��ڿ��� 2000�� ��ġ ����
		 
	
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
