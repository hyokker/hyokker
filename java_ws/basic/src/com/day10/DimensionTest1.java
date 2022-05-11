package com.day10;

public class DimensionTest1 {

	public static void main(String[] args) {
		/*
		 2차원 배열 
		 */
		//[1]배열선언, 메모리할당, 초기화를 모두 따로
		//배열선언
		int[][] arr;
		
		//메모리할당
		arr = new int[2][3]; // 2행 3열
		
		//초기화
		arr[0][0] = 10;
		arr[0][1] = 12;
		arr[0][2] = 17;
		arr[1][0] = 22;
		arr[1][1] = 33;
		arr[1][2] = 56;
		
		//[2] 배열의 선언과 메모리 할당을 동시에
		
		int arr2[][]= new int[3][2]; // 3행 2열
		
		arr2[0][0]=1;
		arr2[0][1]=3;
		arr2[1][0]=11;
		arr2[1][1]=33;
		arr2[2][0]=12;
		arr2[2][1]=34;
		
		//[3] 배열선언, 메모리 할당, 초기화를 모두 동시에
		int[][] arr3 = {{1,2,3,4},{6,7,8,9},{11,12,13,14}};
		
		//출력 행과 열을 나타내야 하기 때문에 중첩 for문을 사용한다.
		for(int i=0;i<arr.length;i++) { 	//행
			for(int j=0;j<arr[i].length;j++) { //열
				System.out.print(arr[i][j]+ "\t");
		}//안쪽 for
		System.out.println();
		}//바깥 for
		
		System.out.println("\n\n행의 개수 : " + arr.length);
		System.out.println("열의 개수 : "+ arr[0].length);
	}

	
}
