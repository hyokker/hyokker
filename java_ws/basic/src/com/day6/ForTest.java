package com.day6;

import java.util.*;

public class ForTest {
	
	public static void main(String[]args) {
		System.out.println("반복하고 싶은 횟수를 입력하세요");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.println("재미있는 java!!");
		}
		for(int i=0;i<=num;i++) {
			System.out.println("i = " + i);
			
		}
		int sum = 0;
		for(int i=0;i<=num;i++) {
			sum+=i;
			System.out.println("i =" + i + ", sum = "+ sum);
		}
		System.out.println("0부터" + num + "까지의 합 = " + sum );
	}
}
