package com.day12;

import java.util.Scanner;

class Triangle3{
	//1. 멤버변수
	private int width;
	private int height;
	
	//2. 생성자
	Triangle3(int p_width, int p_height){
		width=p_width;
		height=p_height;
	}
	
	//3.getter/setter
	public int getWidth() {
		return width;
	}
	public void setWidth(int w) {
		width=w;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int h) {
		height = h;
	}
	//4. 메서드
	public double findArea() {
		return width * height/2.0;
	}
}
public class TriangleTest5 {

	public static void main(String[] args) {
		//[4] 클래스 만들고, 메서드 만들어서 호출(멤버변수, 생성자 만들기)
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변, 높이 입력!");
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		//(1) 생성자를 이용한 멤버변수 초기화
		Triangle3 tr = new Triangle3(w, h); // 생성자를 이용한 멤버변수 초기화
		double area = tr.findArea();
		
		System.out.println("\n면적 : " + area);
		
		//(2) setter을 이용한 멤버변수의 값 변경
		tr.setWidth(30);
		tr.setHeight(40);
		
		System.out.println("\n\n변경한 밑변 : " + tr.getWidth());
		System.out.println("높이 :" + tr.getHeight());
		System.out.println("삼각형 면적 : " + tr.findArea());
	}	

}
