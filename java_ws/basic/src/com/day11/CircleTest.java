package com.day11;

import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.radius=10;
		double area =c.findArea();
		System.out.println("원의 면적 : "+ area);
	
		Circle c2 = new Circle();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n반지름을 입력!");
		int r = sc.nextInt();
		
		c2.radius=r;
		area=c2.findArea();
		
		double girth = c2.findGirth();
		
		System.out.println("두번째 원 객체 - 면적 :" + area + ", 둘레 :" + girth);
	
		sc.close();
	}
	
}
