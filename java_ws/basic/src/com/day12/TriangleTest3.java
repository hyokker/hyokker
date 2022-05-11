package com.day12;

import java.util.Scanner;

class Triangle1{
	public  double findArea(int w, int h) {
		double area = w*h/2.0;
		return area;
	}
}

public class TriangleTest3 {

	public static void main(String[] args) {
		//[3] class를 새로 만들고, 메서드 만들어서 호출(멤버변수는 없는 메서드)
		Triangle1 tr = new Triangle1();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변 높이 입력!");
		int w = sc.nextInt();
		int h = sc.nextInt();
		double area = tr.findArea(w, h);
		System.out.println("면적 : "+ area);
	
	}
}
