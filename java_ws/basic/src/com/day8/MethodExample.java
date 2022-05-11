package com.day8;

import java.util.Scanner;

public class MethodExample {
	public static float toCm(float inch) {
		float a = inch*2.54f;
		return a;
	
	}
	
	public static float toInch(float cm) {
		float a = cm/2.54f;
		return a;
	}
	
	
	public static double angle(double a, double b) {
		
		double angle = (a*b)/2;
		return angle;
		
	}
	public static void main(String[] args) {
		
		
		System.out.println("변환 하려는 inch를 입력하세요");
		Scanner sc = new Scanner(System.in);
		float i = sc.nextFloat();
		float cm=toCm(i);
		
		System.out.println(i + " inch =>" +cm +"cm");
		
		System.out.println("\n 변환하려는 cm을 입력하세요");
		float a = sc.nextFloat();
		float inch = toInch(a);
		
		System.out.println(a + " cm =>"+ inch + "inch");
		
		
		System.out.println("삼각형의 밑변의 길이와 높이를 입력하세요");
		double d = sc.nextDouble();
		double width = sc.nextDouble();
		
		double dw= angle(d, width);
		System.out.println("삼각형의 면적="+ dw);
		
		sc.close();
		
	}

}
