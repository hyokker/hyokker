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
		System.out.println("가로,세로,반지름을 입력하세요");
		int width = sc.nextInt();
		int height = sc.nextInt();
		double rad = sc.nextDouble();
		
		int area=area(width, height);
		
		double circle=area(rad);
		
		System.out.println("사각형의 면적 =" + area);
		System.out.println("원의 면적 ="+ circle);
	}

}
