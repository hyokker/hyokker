package com.day15.sub;

class Shape{
	public void draw() {
		System.out.println("������ �׸��� �޼���");
	}
}

class Triangle extends Shape{
	//�������̵� �޼���
	public void draw() {
		System.out.println("�ﰢ���� �׸���");
	}
}
public class ShapeTest {

	public static void main(String[] args) {
		Triangle tr = new Triangle();
		tr.draw();
	}

}
