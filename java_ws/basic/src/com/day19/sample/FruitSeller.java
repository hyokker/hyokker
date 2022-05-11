package com.day19.sample;

//과일 판매자
public class FruitSeller {
	private int numOfApple; // 사과 개수 30, 27
							// 20 18
	private int myMoney; // 판매수익 0, 4500
						 //0, 2000
	private final int APPLE_PRICE; //사과 하나의 가격 1500/ 1000
										
	
	FruitSeller(int numOfApple, int myMomey, int price){
		this.numOfApple=numOfApple;
		this.myMoney=myMomey;
		this.APPLE_PRICE=price; //final상수- 생성자에서 단 한번 초기화 가능
		//==> 인스턴스별로 다른 값 할당
	
	}
	//사과 판매 메서드
	/*
	public int[] saleApple(int money) {
		int num=money/APPLE_PRICE; //3, 2
		int change=money%APPLE_PRICE; //거스름돈
		
		numOfApple-=num; //3, 2
		myMoney+=(money-change); //4500, 2000
		
		int[] arr= new int[2];
		arr[0]=num; //사과개수
		arr[1]=change; //거스름돈
		
		return arr;	//구매자에게 줄 사과 개수와 거스름돈

		
		
	}
	*/
	public FruitResult saleApple(int money) {
		int num=money/APPLE_PRICE; //3, 2
		int change=money%APPLE_PRICE; //거스름돈
		
		numOfApple-=num; //3, 2
		myMoney+=(money-change); //4500, 2000
		
		FruitResult result = new FruitResult(num, change);
		return result;

		
		
	}
/*
	public int saleApple(int money) {
		int num=money/APPLE_PRICE; //3, 2
		
		numOfApple-=num; //3, 2
		myMoney+=(money); //4500, 2000
		return num;	//구매자에게 줄 사과 개수와 거스름돈
		
		
		
	}
	*/
	public void showResult() {
		System.out.println("\n=====판매자 정보=====");
		System.out.println("남은 사과 : " + numOfApple);
		System.out.println("판매수익 : " + myMoney+"\n");
	}

}
