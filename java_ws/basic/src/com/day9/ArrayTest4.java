package com.day9;

import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {
		// for문 안에서 배열 초기화 하기
		// 5,10,15,20,25
		int[] arr = new int[5];
		
		/*
		 arr[0]=5;
		 arr[1]=10;
		 ...
		 arr[4]=25;
		System.out.println(arr[i]);
		 
		 */
		//초기화
		for(int i=0;i<arr.length;i++) {
			arr[i]=(i+1)*5;
		}
		
		//출력
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		double[] dArr= new double[4];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n실수 4개 입력!");
		/*
		double d = sc.nextDouble();
		dArr[0] = d;
		dArr[1] = sc.nextDouble();
		dArr[2] = sc.nextDouble();
		dArr[3] = sc.nextDouble();
		*/
		
		//초기화
		for(int i=0;i<dArr.length;i++) {
			dArr[i] = sc.nextDouble();
		}
		//출력
		for(int i=0;i<dArr.length;i++) {
			System.out.println(dArr[i]);
		}
	}
	

}
