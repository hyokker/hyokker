package com.day9;

import java.util.Scanner;

public class OverloadingTest1 {
	
	public static int area(int a, int b) {
		int c = a*b;
		return c;
	}
	public static double area(double a) {
		double c = a*a*3.14;
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����,����,�������� �Է��ϼ���");
		int width = sc.nextInt();
		int height = sc.nextInt();
		double rad = sc.nextDouble();
		
		int area=area(width, height);
		
		double circle=area(rad);
		
		System.out.println("�簢���� ���� =" + area);
		System.out.println("���� ���� ="+ circle);
	}

}
