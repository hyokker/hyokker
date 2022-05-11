package com.day10;

public class ArrayCopy {
	public static void main(String[] args) {
		/*
		 배열 변수의 복사
		 -배열 인스턴스는 복사되지 않는다.
		 -2개의 배열 변수는 동일한 배열 인스턴스를 참조(가리킨다)
		 -배열은 참조형이므로 배열복사하면 같은 메모리 영역을 가리킨다.
		 */
		int[] arr= {10,22,37};
		int[] copy= arr;
		
		arr[0]++;
		System.out.println("arr[0]=" + arr[0] + "copy[0] ="+ copy[0]);
		
		for(int i=0;i<copy.length;i++){
			System.out.println(copy[i]+"\t");
		}
		
		//배열 복사를 이용한 swap
		
		int[] arr1 = {1,3,5,7,9};
		int[] arr2 = {20,40,60};
		
		System.out.println("\n\narr1의 주소 : " + arr1 + ", arr2의 주소 : " + arr2);
		
		int[] temp;
		temp=arr1;	//temp => {1,3,5,7,9}
		arr1=arr2;	//arr1 => {20,40,60}
		arr2=temp;	//arr2 => {1,3,5,7,9}
		
		System.out.println("\n\n=====arr1=======");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]+"\t");
		}
		
		System.out.println("\n\n=====arr2=======");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]+"\t");
		}
		
		System.out.println("\n\nswap 후 arr1의 주소 : " + arr1 + ", arr2의 주소 "+ arr2);
	}
}
