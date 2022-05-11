package com.day6;

import java.util.*;

public class Example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("3의 배수의 계수를 입력하세요");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			int sum = 3*i;
			System.out.println(sum);
		}
		
		System.out.println("n의 계승 구하기 : n을 입력하세요");
		int n = sc.nextInt();
		int result =1;
		for(int i=1;i<=n;i++) {
			 result *= i;
		System.out.println("1~"+n+"4까지의 곱(계승, factorial) = "+result);
		}
		System.out.println("1~"+n+"4까지의 곱(계승, factorial) = "+result);
	}
}
