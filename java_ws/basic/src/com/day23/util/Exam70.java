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
		return "���� �ѷ� : " + findGirth();
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
		return "�簢���� �ѷ� : " + findGirth();
	}
}
public class Exam70 {
	static class ShapeManeger{
		ArrayList<Shape> list = new ArrayList<Shape>();
		Scanner sc = new Scanner(System.in);
		
		
		void inputCircle() {
			System.out.println("���� �������� �Է��ϼ���");
			double r = sc.nextDouble();
			list.add(new Circle(r));
		}
		
		void inputRect() {
			System.out.println("�簢���� ���� ���θ� �Է��ϼ���");
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
			System.out.print("1.�� 2.�簢�� 3.����. 4 ���� ==>");
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
					System.out.println("���α׷� ����");
						return;
				default :
					System.out.println("�߸��Է�!");
						break;
			}
		
		}

	}

}
