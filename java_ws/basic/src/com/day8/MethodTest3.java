package com.day8;

import java.util.Scanner;

public class MethodTest3 {

	public static double multiply(double a, double b) {
		double d = a*b;
		return d;
	}
	public static void main(String[] args) {
		//public static int parseInt(String s)
		//[1]
		int n = Integer.parseInt("1234");
		
		//[2]
		String str="123";
		n = Integer.parseInt(str);
		//[3]
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�");
		String str2 = sc.nextLine();
		
		n = Integer.parseInt(str2);//main���� �������� ���� ������ ����Ҽ� ����!
		System.out.println("n = " + n);
		
		//[1]
		double d = multiply(10.2, 36.4);
		
		//[2]
		double n1=2.3, n2=3.5;
		d = multiply(n1,n2);
		
		//[3]
		System.out.println("�Ǽ� �ΰ��� �Է��ϼ���");
		double d1 =sc.nextDouble();
		double d2 =sc.nextDouble();
		
		d=multiply(d1, d2);
		System.out.println("d = "+ d);
	}

}
