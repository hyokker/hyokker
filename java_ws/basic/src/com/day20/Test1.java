package com.day20;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 정수 입력!");
		int n1=sc.nextInt(); //
		int n2=sc.nextInt(); //
		
		int result = n1/n2; //
		System.out.println("몫 :" + result );
		System.out.println("나머지 :" + n1%n2);
		
		System.out.println("\n-----next!-----");
	}

}
