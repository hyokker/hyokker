package com.day15.sub;

class Shape2 {
	public double findArea() {
		return 0;
	}
}

class Circle extends Shape2 {
	private final double PI = 3.14;	
	private int r;

	public Circle(int r){
		this.r = r;
	}

	public double findArea() {
		return PI*r*r;
	}
}

class Rectangle extends Shape {
	private int w;
	private int h;

	public Rectangle(int w, int h){
		this.w =w;
		this.h = h;
	}

	public double findArea() {
		return w*h;
	}
}

public class ExamShape {
	public static void main(String[] args) {
		Circle c = new Circle(10);
		double area = c.findArea();
		System.out.println("원의 면적 : "+area);

		Rectangle r = new Rectangle(5, 7);
		area = r.findArea();
		System.out.println("사각형의 면적 : "+area);
	}//main
}

