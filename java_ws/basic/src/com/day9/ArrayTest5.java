package com.day9;

import java.util.Scanner;

public class ArrayTest5 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 배열의 갯수를 입력하세요");
		int count = sc.nextInt();
		
		int[] arr;
		arr = new int[count];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i;
			System.out.println("arr"+"["+i+"]"+"="+i);			
		}
		
		
		int[] arr2;
		arr2 = new int[5];
//		arr2[0] = 1;
//		arr2[1] = 3;
//		arr2[2] = 5;
//		arr2[3] = 7;
//		arr2[4] = 9;
		
		for(int i=0;i<arr2.length;i++) {
//			arr2[i]=(i+1)+i;
			arr2[i]=2*i+1;
		}
		for(int i=0;i<arr2.length;i++) {
		System.out.println(arr2[i]);

	}

}
	
}
