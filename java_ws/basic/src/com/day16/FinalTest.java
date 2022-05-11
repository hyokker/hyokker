package com.day16;

import java.util.Scanner;

class Account{
	static final double INTEREST_RATE=0.02;
	
	
	public int Acc(int money) {
		return (int)(money*INTEREST_RATE);
	}
}
public class FinalTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입금할 금액을 입력하세요");
		int money = sc.nextInt();
		
		Account a = new Account();
		a.Acc(money);
		System.out.println("원금 : " + money +"원"+", 이자율 : "
		+ a.INTEREST_RATE +", 이자 : " + a.Acc(money)+"원");
	}

}
