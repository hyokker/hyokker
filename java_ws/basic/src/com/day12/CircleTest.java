package com.day12;

import java.util.Scanner;

class Circle {
	//원을 나타내는 클래스
	//1. 멤버변수 - 상태정보, 속성, 특징
	int radius;  //반지름	
	
	
	//2. 생성자 - 멤버변수 초기화
	Circle(int p_radius){
		radius=p_radius;
	}
	
	//3. 메서드 - 행동, 기능
	//원의 넓이를 구하는 메서드
	public double findArea() {
		double area = radius*radius*3.14;
		return area;
	}
	
	//원의 둘레를 구하는 메서드
	public double findGirth() {
		double girth=2*radius*3.14;
		return girth;
	}
}

public class CircleTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름 입력");
		int r = sc.nextInt();
		
		//생성자를 이용해서 멤버변수의 값 초기화
		Circle c = new Circle(r);
		double area=c.findArea();
		double girth=c.findArea();
		
		System.out.println("원의 면적 : "+ area +", 원의둘레 : " + girth);
		
		
		//멤버변수의 값을 변경할 수도 있다.
		c.radius = 20;
		area=c.findArea();
		System.out.println("\n반지름 변경 후 원의 면적 :" + area);
	}

}
