package com.day6;

import java.util.*;

public class Page116 {

	public static void main(String[] args) {
		// public char charAt(int index)
		Scanner sc = new Scanner(System.in);//@@@@@@@@@@@@@@@@@@@@@@//
		System.out.println("4자리 이상의 숫자를 입력하세요");
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
//				int n=num%10; //뒷자리 없애기 1234
//				num=num/10; // 나누기 10 
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

