package com.day6;

public class Example4 {

	public static void main(String[] args) {
		for(int i=0;i<3;i++) {
			System.out.println("*");
		}
		System.out.println("\n===========");
		for(int i=10;i<=30;i+=10) {//�ظ��ϸ� ���� ���� �ʱⰪ�� �Ҵ�
			System.out.println(i);
		}
		System.out.println("\n===========");
		for(int i=0;i<5;i++) {
			System.out.print("*");
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
			System.out.print("*");
		}
			System.out.println();
		}
	}
}
