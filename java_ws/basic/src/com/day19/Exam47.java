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
		System.out.println("면적 :" + radius);
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
		System.out.println("면적 :"+area);
	}
}
public class Exam47 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("도형을 선택하세요<1.원 2.사각형>");
		int type=sc.nextInt();
		Shape s = null;
		switch(type) {
				case 1 :
					System.out.println("반지름 입력");
					int r = sc.nextInt();
					s = new Circle(r);
					break;
				case 2 :
					System.out.println("가로, 세로 입력");
					int w = sc.nextInt();
					int h = sc.nextInt();
					s = new Rectangle(w, h);
					break;
		}
		s.findArea();
	}

}
