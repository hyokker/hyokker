package com.day20.sample;

import java.util.Scanner;

public class PdBuyerMain {

	public static void main(String[] args) {
		Buyer b =new Buyer(1000);
		
		//가격이 200인 TV구매
		b.buy(new TV(200));
		
		b.showInfo();
		//가격이 150인 computer구매
		Product p = new Computer(150);
		b.buy(p);
	
		b.summary();
		
		Buyer b2= new Buyer(1000);
		Scanner sc = new Scanner(System.in);
		PdManager manager = new PdManager();
		while(true) {
			System.out.println("1. 상품 구매 2. 구매내역 조회 3.종료");
			int type=sc.nextInt();
			
			switch(type) {
			case 1 :
				manager.inputPd(b2);
				break;
			case 2 :
				manager.showPd(b2);
				break;
			case 3 :
				System.out.println("종료합니다");
				System.exit(0);
			default :
				System.out.println("잘못 입력!\n");
				continue;
			}
			
		}
	}
}

class PdManager{
	Scanner sc = new Scanner(System.in);
	public void inputPd(Buyer b) {
		System.out.println("구매할 상품 선택 1.TV 2.Computer");
		int kind=sc.nextInt();
		
		if(kind!=1 && kind!=2) {
			System.out.println("구매할 상품을 다시 선택하세요");
			return;
		}
		System.out.println("상품 가격 입력!");
		int price= sc.nextInt();
		
		Product p = null;
		if(kind==1) {
			p=new TV(price);
		}else if(kind==2) {
			p=new Computer(price);
		}
		b.buy(p);
		b.showInfo();
	}

	public void showPd(Buyer b) {
		b.summary();
	}
}

//System.out.println("1. 상품 구매 2. 구매내역 조회 3.종료");
//int num=sc.nextInt();
//if(num==1) {
//	System.out.println("구매할 상품을 선택하세요 <1.TV 2.Computer>");
//	int type=sc.nextInt();
//	if(type==1) {
//	System.out.println("상품 가격을 입력하세요");
//	int price=sc.nextInt();
//	Product p2 = new TV(price);
//	b2.buy(p);
//	b2.showInfo();
//	}else if(type==2) {
//		System.out.println("상품 가격을 입력하세요");
//	int price=sc.nextInt();
//	Product p2 = new Computer(price);
//	b.buy(p);
//	b.showInfo();
//	}
//	
//}else if(num==2) {
//	b.summary();
//	
//}else if(num==3) {
//	System.out.println("종료 합니다");
//	return;
//}
//
//}
