package com.day19;

import java.util.Scanner;

abstract class Shape2{
	abstract double findArea();
}

class Circle2 extends Shape2{
	private double r;
	
	Circle2(double r){
		this.r=r;
	}
	
	public double findArea() {
		return  r*r*3.14;
	}
}

class Rectangle2 extends Shape2{
	private double w,h;
	
	Rectangle2(double w, double h){
		this.w=w;
		this.h=h;
	}
	
	public double findArea() {
		return w*h;
	}
}
public class Exam47_2 {

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
					s.findArea();
					break;
				case 2 :
					System.out.println("����, ���� �Է�");
					int w = sc.nextInt();
					int h = sc.nextInt();
					s = new Rectangle(w, h);
					s.findArea();
					break;
		}
	
	}

}
