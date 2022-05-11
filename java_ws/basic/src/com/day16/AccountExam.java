package com.day16;

import java.util.Scanner;

class AccountTest{
	protected String accNum;
	protected int accCost;
	
	AccountTest(String accNum, int accCost){
		this.accNum=accNum;
		this.accCost=accCost;
	}
	
	public void display() {
		System.out.println("계좌번호 : " + accNum);
		System.out.println("계좌잔액 : " + accCost);
	}
}

class KBAccount extends AccountTest{
	private int accLimit;
	
	KBAccount(String accNum, int accCost, int accLimit) {
		super(accNum, accCost);
		this.accLimit=accLimit;
	}
	
	public void display() {
		super.display();
		System.out.println("이체 한도 :"+ accLimit );
	}
}
public class AccountExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("계좌번호, 잔액, 이체한도를 입력");
		String accNum = sc.nextLine();
		int accCost = sc.nextInt();
		int accLimit = sc.nextInt();
		
		KBAccount ka = new KBAccount(accNum, accCost, accLimit);
		
		ka.display();
		
		//Account 배열 만들고 3개 요소 추가, for 에서 출력 메서드 호출(확장 for도 이용)
		
		KBAccount[] arr = new KBAccount[3];
		arr[0] =new KBAccount("100-1000-10000",10000,1000000);
		arr[1] =new KBAccount("100-1000-20000",20000,2000000);
		arr[2] =new KBAccount("100-1000-30000",30000,3000000);
		System.out.println("\n===== for문 사용 =====");
		
		for(int i=0;i<arr.length;i++) {
			arr[i].display();
		}
		
		System.out.println("\n=====확장 for문 사용 =====");
		for(KBAccount c : arr) {
			c.display();
		}
	
		
		
	}

}
