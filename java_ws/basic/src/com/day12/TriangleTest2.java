package com.day12;

import java.util.Scanner;

public class TriangleTest2 {
	public static double findArea(int w, int h) {
		double area = w*h/2.0;
		return area;
	}
	public static void main(String[] args) {
		//[2] 메서드만 만들어서 호출하여 면적 구하기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변, 높이 입력!");
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		double area = findArea(w, h);
		
		System.out.println("\n면적 : "+ area);
	}

}
