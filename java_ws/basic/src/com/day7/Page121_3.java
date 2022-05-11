package com.day7;

import java.util.*;

public class Page121_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두개의 정수를 입력하세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int start = 0;
		int end = 0;
		int sum = 0;
		if (num1 > num2) {
			start = num2;
			end = num1;
		} else {
			start = num1;
			end = num2;
		}
		for (int i = start; i <= end; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println(sum);
		System.out.println("\n==============");

		sum = 0; // 2 3 4 5 6 7 8 9//10
		for (int i = start; i <= end; i += 2) {
			if (i % 2 == 1) {
				sum += i;
			}else{
				sum += i+1;
			}
		}
		System.out.println(sum);
	}
}
