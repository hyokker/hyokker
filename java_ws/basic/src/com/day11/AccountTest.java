package com.day11;

/*
	객체(Object)
	- 물건, 대상
	
	객체 지향 프로그래밍
	-사물과 대상의 행동을 있는 그대로 실체화시키는 프로그래밍
	
	예) 나는 과일장사에게 두 개의 사과를 구매했다.
	예) 나는 은행계좌에서 30000원을 출금했다.
 
 	객체 - 상태정보(속성, 데이터)와 행동(기능)으로 구성됨
 	상태정보 => 변수를 통해서 표현 됨
 	행동 => 메소드를 통해서 표현됨
 	
 	객체를 여러개 만들기 위해서는 클래스라는 틀이 필요함.
 	
 	클래스
 	[1]	객체지향 이론의 관점
 	- 객체를 생성하기 위한 틀로써 상태정보와 행동으로 구성되어 있다.
 	[2]	프로그래밍 관점
 	- 자료형을 정의하는 것으로
 	관련 변수와 메서드를 함께 정의한 것
 	틀			실체
 	----------------
 	붕어빵틀		붕어빵
 	제품설계도		제품
 	자동차설게도	자동차
 	----------------
 	클래스		객체
 	
 	
 	클래스 정의
 	
 	class 클래스이름{
 		멤버변수;
 		메서드();
 	}
 */


class Account{
	//1.멤버변수
	String accId;	//계좌번호
	String name;	//이름
	int balance;	//잔액
	
	//2.메서드
	public void deposit(int money) {	//입금하다
		balance += money;
	}
	
	public void withdraw(int money) { 	//출금하다
		balance -= money;
	}
	
	public void showInfo() {
		System.out.println("계좌번호 : "+ accId);
		System.out.println("이름 : " + name);
		System.out.println("잔액 : " + balance+"\n");
	}
}//

//클래스를 작성한 다음, 클래스로부터 객체를 생성하여 사용
//객체를 사용한다는 것 - 객체가 가지고 있는 속성과 기능을 사용한다는 뜻
public class AccountTest {
	public static void main(String[] args) {
		int a;
		a = 5; 
		
		int[] arr;
		arr = new int[3];
		
		
		
		//1.객체 생성	- 해당 클래스의 멤버변수와 메서드를 메모리에 할당
		/*
		 객체 생성하는 방법
		 클래스명	참조변수	=	new 클래스명();
		 */
		
		Account acc;
		acc = new Account();
		
		//2.메서드 사용
		acc.showInfo(); //멤버변수는 자동으로 디폴트값으로 초기화됨
		
		//두번째 객체 생성
		Account acc2 = new Account();
		
		//멤버변수 사용
		acc2.accId="100-001-2000";
		acc2.name="홍길동";
		acc2.balance=100000;
		
		//메서드 사용
		acc2.withdraw(30000); // 30000원 출금
		acc2.showInfo();
		
		acc2.deposit(50000); // 50000원 입금
		System.out.println("현재 잔액 : " + acc2.balance);
		
		
	}

}
