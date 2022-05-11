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
		System.out.println("���¹�ȣ : " + accNum);
		System.out.println("�����ܾ� : " + accCost);
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
		System.out.println("��ü �ѵ� :"+ accLimit );
	}
}
public class AccountExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���¹�ȣ, �ܾ�, ��ü�ѵ��� �Է�");
		String accNum = sc.nextLine();
		int accCost = sc.nextInt();
		int accLimit = sc.nextInt();
		
		KBAccount ka = new KBAccount(accNum, accCost, accLimit);
		
		ka.display();
		
		//Account �迭 ����� 3�� ��� �߰�, for ���� ��� �޼��� ȣ��(Ȯ�� for�� �̿�)
		
		KBAccount[] arr = new KBAccount[3];
		arr[0] =new KBAccount("100-1000-10000",10000,1000000);
		arr[1] =new KBAccount("100-1000-20000",20000,2000000);
		arr[2] =new KBAccount("100-1000-30000",30000,3000000);
		System.out.println("\n===== for�� ��� =====");
		
		for(int i=0;i<arr.length;i++) {
			arr[i].display();
		}
		
		System.out.println("\n=====Ȯ�� for�� ��� =====");
		for(KBAccount c : arr) {
			c.display();
		}
	
		
		
	}

}
