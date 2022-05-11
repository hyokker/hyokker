package com.day6;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum =0;
		for(int i=0;i<=100;i+=2){
			sum+=i;
			System.out.println("i="+i+", sum=>"+sum);
		}
		System.out.println(sum+"\n");
		/* 
		 * int sum = 0;
		 * for(int i=0;i<=100;i++){
		 * 		if(i%2==0){
		 * 			sum+=i;
		 * }
		 * 
		 * */
		
		System.out.println("출력할 구구단의 단을 입력하세요");
		int num = sc.nextInt();
		for(int i=9;i>0;i--) {
			System.out.println(num + " * " + i + " = "+ num*i);
		}
		
	}
}
//a+=a
//1