package com.day16;

/*
 [1] final 변수
 	- 상수지만 선언과 함께 초기화하지 않고,
 	  생성자에서 단 한번 초기화할 수 있다.
 	- 각 인스턴스마다 다른 값을 갖도록 할 수 있다.  
 [2] static final 변수
 	- 선언과 함께 초기화
 	- 클래스 차원에서 하나만 생성되고, 모든 인스턴스가 같은 값을 갖는다(공유)
 	
 */

class Card{
	final String KIND; //카드 무늬
	final int NUMBER; // 카드 숫자

	static final int WIDTH=100;
	static final int HEIGHTO=250;

	Card(String k, int num){
		KIND=k;
		NUMBER=num;
	}

	public void showInfo() {
		System.out.println("카드종류 :" +KIND);
		System.out.println("카드슷자 :" + NUMBER +"\n");
	}
}


public class CardFinal {

	public static void main(String[] args) {
		Card c1= new Card("Diamond", 0);
		c1.showInfo();
		
		Card c2= new Card("Herat", 9);
		c2.showInfo();
		
		System.out.println("카드너비:"+ Card.WIDTH);
		System.out.println("카드높이:"+ Card.HEIGHTO);
	
		//KIND="Spade"; // error : KIND cannot be resolved to a variable
	}

}
