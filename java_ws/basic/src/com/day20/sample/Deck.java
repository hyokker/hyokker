package com.day20.sample;

//카드 한벌 - 52장의 카드를 갖는 클래스
public class Deck {
	private static final int CARD_NUM=52; // 카드의 개수
	private Card[] cardList=new Card[CARD_NUM]; //카드 52장을 담는 배열
	private int idx;
	
	public Deck() {
		//Card 52장 초기화 4*13
		for(int i=1;i<=Card.MAX_KIND;i++) {//4
			for(int j=1;j<=Card.MAX_NUMBER;j++) {//13
				cardList[idx++]=new Card(i, j);
			}
			
		}
	}
	
	public Card[] getCardList() {
		return cardList;
	}
	
	//카드 뽑기 - 지정된 위치에 있는 카드 하나 선택
	public Card pick(int index) {
		Card c = null;
		if(index<0 || index>=CARD_NUM) {
			c=pick();
		}else {
			c=cardList[index];
		}
		return c;

	}
	
	//임의의 카드 한장 뽑기
	public Card pick() {
		int rnd=(int)(Math.random()*52);
		return cardList[rnd];
	}
	public void shuffle() {
		for(int i=0;i<1000;i++) {
			//임의의 index값 읽어오기
			int rnd=(int)(Math.random()*52);
			
			//0번째 배열의 값과 서로 맞바꾸기
			Card temp=cardList[0];
			cardList[0]=cardList[rnd];
			cardList[rnd]=temp;
		}//for
	}
}
