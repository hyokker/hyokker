package com.day8;

import java.util.Scanner;

public class MethodExample2 {
	
	public static int big(int a, int b) {
		int c = (a>b)?a:b;//���� �������� ��ȣ�� ���� �񱳹� �� �����ڿ� ����.
		return c;
	}
	public static int rest(int a, int b) {
		int c = a%b;
		return c;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("�� ���� �Է��ϼ���");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c= big(a, b);
		System.out.println(c);
		
		System.out.println("�� ���� �Է��ϼ���");
		
		while(true) {
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		if(num==0 || num2==0) break;
		
		int res =rest(num, num2);
			System.out.println("������ ������ :" + num + "%" + num2 + " = " +res);
		}
		System.out.println("");
			
		
	}

}
