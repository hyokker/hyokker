package com.day10;

public class JaggedArry {

	public static void main(String[] args) {
		/*
		 가변배열 (Jagged Array)
		 - 배열의 배열, 들쭉날쭉 배열, 동적 배열
		 - 배열의 요소가 일정하지 않은 배열
		 배열요소마다 크기를 다르게 지정할 수 있다.
		 (각 행마다 다른 크기의 배열을 생성하는 것이 가능)
		 */
		int[][] arr = new int [3][];
		
		arr[0]= new int[] {4,2,8,9};
		arr[1]= new int[] {2,3};
		arr[2]= new int[] {5,2,7};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

		int[][] arr2 = {{4,2,8,9},{2,3},{5,2,7}};
	}	

}
