package com.day10;

public class EnhancedFor {

	public static void main(String[] args) {
		/*
		 Ȯ�� for��(Enhanced for��)
		 - �迭�̳� �÷����� ��ҵ��� �ݺ�ó���� �� ���
		 - �迭�� �����Ͱ� �ִ� ��ŭ �ݺ�
		 
		 for(�ڷ��� ���� : �迭){
		 	��ɹ�;
		 }
		 */
		int[] arr = {10,20,50,90};
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}

		
		System.out.println("\n\n=====Ȯ�� for �� �̿�=====");
		
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
		
		System.out.println("\n\n======Ȯ�� for �� �̿�=====");
		for(String str : sArr) {
			System.out.print(str + "\t");
		}
	}

}
