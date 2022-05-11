package com.day23.util;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Shape{
	abstract double findGirth();
}

class Circle extends Shape{
	private double r;
	private final double PI=3.14;
	
	Circle(double r){
		this.r=r;
	}
	
	public double findGirth() {
		return 2*r*PI;
	}
	
	public String toString() {
		return "원의 둘레 : " + findGirth();
	}
}

class Rect extends Shape{
	private double w,h;
	
	Rect(double w, double h){
		this.w=w;
		this.h=h;
	}
	
	public double findGirth() {
		return (w+h)*2;
	}
	
	public String toString() {
		return "사각형의 둘레 : " + findGirth();
	}
}
public class Exam70 {
	static class ShapeManeger{
		ArrayList<Shape> list = new ArrayList<Shape>();
		Scanner sc = new Scanner(System.in);
		
		
		void inputCircle() {
			System.out.println("원의 반지름을 입력하세요");
			double r = sc.nextDouble();
			list.add(new Circle(r));
		}
		
		void inputRect() {
			System.out.println("사각형의 가로 세로를 입력하세요");
			double w = sc.nextDouble();
			double h = sc.nextDouble();
			list.add(new Rect(w,h));
		}
		void showView() {
			for(int i=0;i<list.size();i++) {
				Shape s = list.get(i);
				System.out.println(s);
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ShapeManeger sm = new ShapeManeger();
		while(true) {
			System.out.print("1.원 2.사각형 3.보기. 4 종료 ==>");
			int type=sc.nextInt();
			
			switch(type) {
				case 1:
						sm.inputCircle();
						break;
				case 2:
						sm.inputRect();
						break;
				case 3: 
						sm.showView();
						break;
				case 4: 
					System.out.println("프로그램 종료");
						return;
				default :
					System.out.println("잘못입력!");
						break;
			}
		
		}

	}

}
