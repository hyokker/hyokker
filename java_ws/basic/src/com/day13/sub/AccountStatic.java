package com.day13.sub;

class BankAccount{
	//1.멤버변수
	//[1]인스턴스변수
	private int balance;

	//[2]static 변수
	public static final double INTEREST_RATE=0.02;
	private static int totalBalance; //각 계좌(객체)의 원금


	//2.생성자
	public BankAccount(int balance) {
		this.balance=balance;
	}
	
	//3. getter/setter
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance=balance;
	}
	
	public static int getTotalBalance() {
		return totalBalance;
	}
	
	public static void setTotalBalance(int totalBalance) {
		//static 에서는 this 사용불가
		//그래스 클래스명.totalbalance 사용
		BankAccount.totalBalance=totalBalance;
	
	}
	
	//4.메서드
	public void findTotal() {
		totalBalance+=balance;
	}
	
	
}


public class AccountStatic {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount(100000);
		BankAccount acc2 = new BankAccount(100000);
	
		acc1.findTotal();
		acc2.findTotal();
		
		System.out.println("계좌1의 원금 : " + acc1.getBalance());
		System.out.println("계좌2의 원금 : " + acc2.getBalance());
		System.out.println("이율 : " + BankAccount.INTEREST_RATE);
		System.out.println("전 계좌의 원금의 합계 : " + BankAccount.getTotalBalance());
	
	
	
	}

}
