package com.day14;

import java.util.Scanner;

public class ArrayClassTest2 {

	public static void main(String[] args) {
		Account[] arr = new Account[3];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("계좌번호, 잔액, 출금액 입력");
			String accId=sc.nextLine();
			int balance=sc.nextInt();
			int money=sc.nextInt();
			sc.nextLine();
			
			arr[i] = new Account(accId, balance);
			
			arr[i].withdraw(money);
		}	//for
	
	
			System.out.println("\n=======전체 계좌 정보 =======");
			for(Account acc:arr) {
				acc.display();
			}//for
	}

}
