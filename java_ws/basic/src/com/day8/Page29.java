package com.day8;

import java.util.Scanner;

public class Page29 {
	public static int convToInt(String a) {

		//public static int parseInt(String s)
		int num = Integer.parseInt(a);
		return num;
	}

	public static void Print(int a) {
		for (int i=0;i<a;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("A");
			}
			System.out.println("B");
		}
	}
	
	public static void main(String[] args) {
		//	���� '0'�� ���޵Ǹ� ���� 0��, ���� '7'�� ���޵Ǹ� ���� 7�� ��ȯ�ϴ� �޼��� �����
		//	��, ���ڸ� ������ ��ȯ�ϴ� �޼���
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 0~9���� �Է��ϼ���");
		String str = sc.nextLine();
		int num = convToInt(str);
		
		System.out.println(num);


		System.out.println("\n���ڸ� �Է��ϼ���");
		int cnt = sc.nextInt();
		Print(cnt);
		
	}

}
