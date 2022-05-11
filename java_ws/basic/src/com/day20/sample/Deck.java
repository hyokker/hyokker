package com.day20.sample;

//ī�� �ѹ� - 52���� ī�带 ���� Ŭ����
public class Deck {
	private static final int CARD_NUM=52; // ī���� ����
	private Card[] cardList=new Card[CARD_NUM]; //ī�� 52���� ��� �迭
	private int idx;
	
	public Deck() {
		//Card 52�� �ʱ�ȭ 4*13
		for(int i=1;i<=Card.MAX_KIND;i++) {//4
			for(int j=1;j<=Card.MAX_NUMBER;j++) {//13
				cardList[idx++]=new Card(i, j);
			}
			
		}
	}
	
	public Card[] getCardList() {
		return cardList;
	}
	
	//ī�� �̱� - ������ ��ġ�� �ִ� ī�� �ϳ� ����
	public Card pick(int index) {
		Card c = null;
		if(index<0 || index>=CARD_NUM) {
			c=pick();
		}else {
			c=cardList[index];
		}
		return c;

	}
	
	//������ ī�� ���� �̱�
	public Card pick() {
		int rnd=(int)(Math.random()*52);
		return cardList[rnd];
	}
	public void shuffle() {
		for(int i=0;i<1000;i++) {
			//������ index�� �о����
			int rnd=(int)(Math.random()*52);
			
			//0��° �迭�� ���� ���� �¹ٲٱ�
			Card temp=cardList[0];
			cardList[0]=cardList[rnd];
			cardList[rnd]=temp;
		}//for
	}
}
