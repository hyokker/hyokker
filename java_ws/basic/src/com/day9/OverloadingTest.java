package com.day9;

import java.util.Scanner;

public class OverloadingTest {
	public static int add(int a,int b) {
		int c=a+b;
		return c;
}
	public static double add(double a,double b) {
		double c=a+b;
		return c;
}
	public static String add(String a,String b) {
		String c=a+b;
		return c;
}
//	public static String add(int a,int b) { // �Ű������� ������ �ȵȴ�! ������ �ڷ����� �ٸ���� ����Ҽ��ִ�.
//		//=> ��ȯŸ�����δ� ��������
//		String c = Integer.toString(a+b);
//		return c;
//}

	public static void main(String[] args) {
		/*
		 �����ε� �޼���
		 - �ϳ��� Ŭ�������� ������ �̸��� ���� �޼���
		 ��, �Ű������� ������ �ڷ����� �ٸ���� ���
		 */
		int res=add(5, 7);
		
		double d1=3.14, d2=5.78;
		double res2=add(d1,d2);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ� 2�� �Է�!");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();

		String result=add(s1,s2);
		
		System.out.println(res);
		System.out.println(res2);
		System.out.println(result);
	}

}
