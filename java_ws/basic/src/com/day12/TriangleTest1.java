package com.day12;

import java.util.Scanner;

public class TriangleTest1 {

	public static void main(String[] args) {
		//삼각형 면적 구하기
		//[1]main()에서 직접 면적 구하기
		//1.사용자로부터 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 밑변, 높이 입력!");
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		//2.비즈니스 로직 처리 - 삼각형 면적
		double area = w*h/2.0;
		
		//3.결과 출력
		System.out.println("삼각형 면적 :"+ area);
		
	}

}
