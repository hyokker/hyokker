package com.day10;

public class JaggedArry {

	public static void main(String[] args) {
		/*
		 �����迭 (Jagged Array)
		 - �迭�� �迭, ���߳��� �迭, ���� �迭
		 - �迭�� ��Ұ� �������� ���� �迭
		 �迭��Ҹ��� ũ�⸦ �ٸ��� ������ �� �ִ�.
		 (�� �ึ�� �ٸ� ũ���� �迭�� �����ϴ� ���� ����)
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
