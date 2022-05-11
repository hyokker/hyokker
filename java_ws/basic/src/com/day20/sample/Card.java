package com.day20.sample;

public class Card {
	private final int KIND; // 카드무늬 1~4
	private final int NUMBER; //무늬별 카드 숫자(1~10, JQK

	private static final int SPADE=1;
	private static final int DIAMOND=2;
	private static final int HEART=3;
	private static final int CLOVER=4;
	
	public static final int MAX_KIND=4;
	public static final int MAX_NUMBER=13;
	
	Card(){
		this(SPADE, 1);
	}
	
	Card(int kind, int num){
		this.KIND=kind;
		this.NUMBER=num;
	}
	
	public String findInfo() {
		String kind = " ", number=" ";
		
			switch(KIND) {
				case SPADE:
					kind="Spade";break;
				case DIAMOND:
					kind="Diamond";break;
				case HEART:
					kind="Heart";break;
				case CLOVER :
					kind="Clover";break;
		}
		
		switch (NUMBER) {
		case 11:
				number="J"; break;
		case 12:
			number="Q"; break;
		case 13:
			number="K"; break;
			default:
					number=NUMBER+""; break;
		}
		
		return "card[kind="+ kind + ", number=" + number+"]"; //Spade,k
	}
}
