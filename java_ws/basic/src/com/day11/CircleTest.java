package com.day11;

import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.radius=10;
		double area =c.findArea();
		System.out.println("���� ���� : "+ area);
	
		Circle c2 = new Circle();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n�������� �Է�!");
		int r = sc.nextInt();
		
		c2.radius=r;
		area=c2.findArea();
		
		double girth = c2.findGirth();
		
		System.out.println("�ι�° �� ��ü - ���� :" + area + ", �ѷ� :" + girth);
	
		sc.close();
	}
	
}
