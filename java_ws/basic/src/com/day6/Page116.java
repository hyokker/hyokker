package com.day6;

import java.util.*;

public class Page116 {

	public static void main(String[] args) {
		// public char charAt(int index)
		Scanner sc = new Scanner(System.in);//@@@@@@@@@@@@@@@@@@@@@@//
		System.out.println("4�ڸ� �̻��� ���ڸ� �Է��ϼ���");
		String str= sc.nextLine();
		//str = "12345";
		
		int sum = 0;
		for(int i= 0;i<str.length();i++) {
			sum += str.charAt(i) - '0';
		}
			System.out.println("sum ="+sum);
			
			
			System.out.println("");
			
			
//			int num =sc.nextInt(); //@@@@@@@@@@@@@@@@@@@@@@@@@@@//
//			sum = 0;
//			for(int i=0;i<6;i++) {
//				int n=num%10; //���ڸ� ���ֱ� 1234
//				num=num/10; // ������ 10 
//				sum = sum+n;
//				System.out.println("num ="+ num);
				//sum+=num;
//			}
//				System.out.println("sum ="+sum);
			int num=sc.nextInt();
			sum = 0;
			while( num >0 ) {
				sum += num%10;
				num /= 10;
			}
			System.out.println("sum="+ sum);
			}
	}

