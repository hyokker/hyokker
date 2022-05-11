package com.day8;

import java.util.Scanner;

public class MethodExample2 {
	
	public static int big(int a, int b) {
		int c = (a>b)?a:b;//삼항 연산자의 괄호는 앞의 비교및 논리 연산자에 들어간다.
		return c;
	}
	public static int rest(int a, int b) {
		int c = a%b;
		return c;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c= big(a, b);
		System.out.println(c);
		
		System.out.println("두 수를 입력하세요");
		
		while(true) {
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		if(num==0 || num2==0) break;
		
		int res =rest(num, num2);
			System.out.println("나머지 연산결과 :" + num + "%" + num2 + " = " +res);
		}
		System.out.println("");
			
		
	}

}
