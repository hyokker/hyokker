package com.day6;

import java.util.*;

public class Example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("3�� ����� ����� �Է��ϼ���");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			int sum = 3*i;
			System.out.println(sum);
		}
		
		System.out.println("n�� ��� ���ϱ� : n�� �Է��ϼ���");
		int n = sc.nextInt();
		int result =1;
		for(int i=1;i<=n;i++) {
			 result *= i;
		System.out.println("1~"+n+"4������ ��(���, factorial) = "+result);
		}
		System.out.println("1~"+n+"4������ ��(���, factorial) = "+result);
	}
}
