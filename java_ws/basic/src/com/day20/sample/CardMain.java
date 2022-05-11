package com.day20.sample;

public class CardMain {

	public static void main(String[] args) {
		Deck d = new Deck(); //ī�� �ѹ� �����
		Card c = d.pick(0); //0��° ��ġ�� ī�� �̱�
		System.out.println(c.findInfo());
		
		//ī�� �ѹ� ����ϱ�
		System.out.println("\n========ī���ѹ�========");
		Card[] cardArr=d.getCardList();
		for(Card card : cardArr) {
			System.out.println(card.findInfo());
		}//for
	
		//ī�� ����
		d.shuffle();
		
		//ī�� ���� �� 0��° ��ġ�� ī�� �̱�
		c=d.pick();
		System.out.println("\nī�� ���� �� " + c.findInfo());
		
		System.out.println("\n=============");
		cardArr=d.getCardList();
		for(Card card : cardArr) {
			System.out.println(card.findInfo());
		}//for
		
		c=d.pick();
		System.out.println("������ ī�� : " + c.findInfo() );
	}

}
