package com.day19;

import java.util.Scanner;

interface Shape{
	void findArea();
}

class Circle implements Shape{
	private double r;
	
	Circle(double r){
		this.r=r;
	}
	
	public void findArea() {
		double radius = r*r*3.14;
		System.out.println("���� :" + radius);
	}
}

class Rectangle implements Shape{
	private double w,h;
	
	Rectangle(double w, double h){
		this.w=w;
		this.h=h;
	}
	
	public void findArea() {
		double area=w*h;
		System.out.println("���� :"+area);
	}
}
public class Exam47 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �����ϼ���<1.�� 2.�簢��>");
		int type=sc.nextInt();
		Shape s = null;
		switch(type) {
				case 1 :
					System.out.println("������ �Է�");
					int r = sc.nextInt();
					s = new Circle(r);
					break;
				case 2 :
					System.out.println("����, ���� �Է�");
					int w = sc.nextInt();
					int h = sc.nextInt();
					s = new Rectangle(w, h);
					break;
		}
		s.findArea();
	}

}
