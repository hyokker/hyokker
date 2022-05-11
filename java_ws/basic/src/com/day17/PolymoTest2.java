package com.day17;

import java.util.Scanner;

class Shape{
	public void draw() {
		System.out.println("도형을 그리는 메서드");
	}
	public void delete() {
		System.out.println("도형을 지우는 메서드");
	}
	public void display() {
		System.out.println("부모 메서드!");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("원을 그린다");
	}
	public void delete() {
		System.out.println("원을 지운다");
	}
	public void sayCircle() {
		System.out.println("원만의 메서드");
	}
}

class Triangle extends Shape{
	public void draw() {
		System.out.println("삼각형을 그린다");
	}
	public void delete() {
		System.out.println("삼각형을  지운다");
	}
	public void sayTriangle() {
		System.out.println("삼각형만의 메서드");
	}
	
}
public class PolymoTest2 {

	public static void main(String[] args) {
		//기본 사용법
		Circle c = new Circle();
		c.draw();
		c.delete();
		c.sayCircle();
		c.display();
		System.out.println();
		
		//다형성 이용
		Shape sh = new Circle();
		sh.draw();
		sh.delete();
		sh.display();
		//sh.sayCircle(); // error
		
		sh = new Triangle();
		sh.draw();
		sh.delete();
		
		//사용자로부터 입력 받아서 처리
		Scanner sc = new Scanner(System.in);
		System.out.println("도형 선택(1.원 2.삼각형)");
		int type=sc.nextInt();
		
		//기본사용법
		if(type==1) {
			Circle c2= new Circle();
			c2.draw();
			c2.delete();
			
		}else if(type==2) {
			Triangle tr = new Triangle();
			tr.draw();
			tr.delete();
		}else {
			System.out.println("잘못 선택!");
		}
		
		//다형성 이용
		Shape sh2=null;
		if(type==1) {
			sh2 = new Circle();
		}else if(type==2) {
			sh2 = new Triangle();
		}else {
			System.out.println("잘못입력!");
			return;
		}
		
		sh2.draw();
		sh2.delete();
		//
		System.out.println("\n======메서드 이용=====");
		Shape sh3 =createShape(type);
		if(sh3!=null) {
			sh3.draw();
			sh3.delete();			
		}else {
			System.out.println("잘못입력!");
			return;
		}
	}//main
	
	//반환타입이 부모 클래스(Shape)이면 자식 객체가 리턴된다.
	public static Shape createShape(int type) {
		//다형성 이용
		Shape sh2=null;
		if(type==1) {
			sh2 = new Circle();
		}else if(type==2) {
			sh2 = new Triangle();
		}
		
		return sh2;
	}
}
