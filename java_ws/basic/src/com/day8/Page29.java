package com.day8;

import java.util.Scanner;

public class Page29 {
	public static int convToInt(String a) {

		//public static int parseInt(String s)
		int num = Integer.parseInt(a);
		return num;
	}

	public static void Print(int a) {
		for (int i=0;i<a;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("A");
			}
			System.out.println("B");
		}
	}
	
	public static void main(String[] args) {
		//	문자 '0'이 전달되면 정수 0을, 문자 '7'이 전달되면 정수 7을 반환하는 메서드 만들기
		//	즉, 문자를 정수로 변환하는 메서드
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 0~9까지 입력하세요");
		String str = sc.nextLine();
		int num = convToInt(str);
		
		System.out.println(num);


		System.out.println("\n숫자를 입력하세요");
		int cnt = sc.nextInt();
		Print(cnt);
		
	}

}
