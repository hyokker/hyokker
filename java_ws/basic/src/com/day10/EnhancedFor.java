package com.day10;

public class EnhancedFor {

	public static void main(String[] args) {
		/*
		 확장 for문(Enhanced for문)
		 - 배열이나 컬렉션의 요소들을 반복처리할 때 사용
		 - 배열에 데이터가 있는 만큼 반복
		 
		 for(자료형 변수 : 배열){
		 	명령문;
		 }
		 */
		int[] arr = {10,20,50,90};
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}

		
		System.out.println("\n\n=====확장 for 문 이용=====");
		
		for(int n : arr) {
			System.out.print(n+ " ");
		}
		
		String[] sArr = new String[2];
		sArr[0]="java";
		sArr[1]="Spring";
		
		System.out.println("\n\n");
		for(int i=0;i<sArr.length;i++) {
			System.out.println(sArr[i]+"\t");
		}
		
		System.out.println("\n\n======확장 for 문 이용=====");
		for(String str : sArr) {
			System.out.print(str + "\t");
		}
	}

}
