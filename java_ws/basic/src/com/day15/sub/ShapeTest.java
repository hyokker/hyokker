package com.day15.sub;

class Shape{
	public void draw() {
		System.out.println("도형을 그리는 메서드");
	}
}

class Triangle extends Shape{
	//오버라이딩 메서드
	public void draw() {
		System.out.println("삼각형을 그린다");
	}
}
public class ShapeTest {

	public static void main(String[] args) {
		Triangle tr = new Triangle();
		tr.draw();
	}

}
