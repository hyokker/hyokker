package com.day14;

public class Circle {
		//원을 나타내는 클래스
		//1. 멤버변수 - 상태정보, 속성, 특징
		private int radius;  //반지름	
		
		
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

