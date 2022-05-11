package com.day9;

public class ArrayTest1 {

	public static void main(String[] args) {
		/*
		 배열
		 - 같은 타입의 데이터를 여러 개 저장할 수 있는 저장소
		 - 동일한 타입의 변수들을 하나의 이름으로 묶어 놓은 것
		 - 참조형, 배열의 이름에 주소값이 들어감
		 배열의 요소들은 인덱스(index, 첨자)로 접근 가능
		 */
		//[1] 배열선언, 메모리할당, 초기화를 따로
		//1. 배열 선언
		int[] arr;
		
		//2. 메모리할당
		arr = new int[3];
		
		//3. 초기화
		arr[0]=10;
		arr[1]=23;
		arr[2]=65;
		
		//배열 요소들 출력
		/*
		 System.out.println(arr[0]);
		 System.out.println(arr[1]);
		 System.out.println(arr[2]); 이건 너무 길어짐 중복되는것은 안하는게 좋음
		 */
		
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		//[2] 배열선언과 메모리 할당을 동시에
		int [] arr2 = new int[2];
		//=> 배열 요소들은 기본값(default값)으로 초기화됨
		//[3] 배열선언, 메모리할당, 초기화를 모두 동시에
		int [] arr3 = {1,8,9,13,37};
		
		for(int i=0;i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}
		//
		int[] arr4 = new int[] {10,20,30};
		
		//
		int[] arr5;
		arr5 = new int[] {40,50,60};
		
		//
		int[] arr6;
		arr6 = new int[3];
//		arr6 = {7,8,9}; //error
		
		//배열의 인덱스는 0부터 시작
		
		//
		int arr7[];
		arr7 = new int [4];
		
		for(int i=0;i<arr7.length;i++) {
			System.out.println(arr7[i]);
		}
		
		System.out.println("배열 요소의 크기 :" +arr.length);
		System.out.println("배열의 주소 : " + arr);
	}
}


