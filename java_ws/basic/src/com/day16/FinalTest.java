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
		System.out.println("�Ա��� �ݾ��� �Է��ϼ���");
		int money = sc.nextInt();
		
		Account a = new Account();
		a.Acc(money);
		System.out.println("���� : " + money +"��"+", ������ : "
		+ a.INTEREST_RATE +", ���� : " + a.Acc(money)+"��");
	}

}
