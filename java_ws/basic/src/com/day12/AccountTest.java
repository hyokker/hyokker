package com.day12;

/*
	생성자(Constructor)
	-멤버변수의 초기화를 목적으로 정의되는 메서드
	-객체가 생성될 때 자동 호출되어 가장 먼저 실행되는 메서드
	
	생성자가 되기 위한 조건
	- 클래스의 이름과 동일한 이름의 메서드
	- 매개변수는 가질 수 있으나 반환값은 가질 수 없다
	
	객체 생성 문장에 생성자 호출하는 부분이 존재함
	클래스명 변수명 = new 클래스명();
	
	=> new 의 오른편 부분이 생성자 호출하는 부분
	
	기본 생성자 - 매개변수를 가지지 않는 생성자
	- 클래스 내에 생성자가 하나도 없으면 컴파일러가 자동으로 기본생성자를 추가해줌
	- 하지만 다른 생성자가 있으면 컴파일러에 의해 기본 생성자가 만들어지지 않음!!
	
	class Account{
		//생성자
		 Account(){
		 
		 }
	}
 */


class Account{
	//1.멤버변수
	String accId;	//계좌번호
	String name;	//이름
	int balance;	//잔액
	
	//2.생성자 - 멤버변수초기화
	Account(){
		
	}
	//=> 다른 생성자를 만들었기 때문에, 기본생성자가 자동으로 만들어지지 않으므로 직접 만들어야 함
	
	//매개변수가 있는 생성자
	Account(String p_accId, String p_name, int p_balance){
		accId=p_accId;
		name=p_name;
		balance=p_balance;
	}
	
	//3.메서드
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
		Account acc2 = new Account();
		
		//멤버변수 사용
		acc2.accId="100-001-2000";
		acc2.name="홍길동";
		acc2.balance=100000;
		
		//메서드 사용
		acc2.withdraw(30000); // 30000원 출금
		acc2.showInfo();
		
		//매개변수 있는 생성자를 이용
		Account acc = new Account("200-001-3000","박길동", 200000);
		acc.showInfo();
	}

}
