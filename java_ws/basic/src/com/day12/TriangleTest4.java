package com.day12;

import java.util.Scanner;

class Triangle2{
	//1. 멤버변수
	int width;
	int height;
	
	//2. 생성자
	Triangle2(int p_width, int p_height){
		width=p_width;
		height=p_height;
	}
	//3. 메서드
	public double findArea() {
		return width * height/2.0;
	}
}
public class TriangleTest4 {

	public static void main(String[] args) {
		//[4] 클래스 만들고, 메서드 만들어서 호출(멤버변수, 생성자 만들기)
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변, 높이 입력!");
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		
		Triangle2 tr = new Triangle2(w, h); // 생성자를 이용한 멤버변수 초기화
		double area = tr.findArea();
		
		System.out.println("\n면적 : " + area);

	}

}
