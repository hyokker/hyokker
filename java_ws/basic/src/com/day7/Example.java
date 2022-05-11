package com.day7;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두개의 정수를 입력하세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = 0;
		for(int i=num1;i<=num2;i++) {
			sum+=i;
		}//for
		System.out.println("두 정수 사이의 합 : " + sum);
		
		System.out.println("\n\n두개의 정수를 입력하세요");
		 num1= sc.nextInt();
		 num2 = sc.nextInt();
		 int start=0, end=0;
		 if(num1>num2) {
			 start = num2;
			 end = num1;
		 }else {
			 start = num1;
			 end = num2;
		 for(int i=start;i<=end;i++) {
			 		 sum+=i;
			 }
			 System.out.println(sum);
		 }
		 sum = 0;
		 System.out.println("");
		
		 
		 
		 
		 
		 for(int i=1;i<100;i++) {
			 if(i%3==0 || i%5==0) {
				 sum+=i;
			 }
		 }
		 System.out.println("3과 5의 배수의 합은 :"+ sum);
	}

}
