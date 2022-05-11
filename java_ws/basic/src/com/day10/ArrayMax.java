package com.day10;

public class ArrayMax {

	public static void main(String[] args) {
		//배열에 저장된 최대값 구하기
		int[] arr= {10,59,20,35,77,26};
		int max = arr[0];//10
		
		for(int i=1;i<arr.length;i++) {
			if(max < arr[i]) {
				max=arr[i];
			}
		}//for

		
		//배열 전체 요소 출력
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+ " ");
		}
		
		System.out.println("\n\n최대값 : " + max);
	}

}
