package com.day10;

public class ArrayCopy {
	public static void main(String[] args) {
		/*
		 �迭 ������ ����
		 -�迭 �ν��Ͻ��� ������� �ʴ´�.
		 -2���� �迭 ������ ������ �迭 �ν��Ͻ��� ����(����Ų��)
		 -�迭�� �������̹Ƿ� �迭�����ϸ� ���� �޸� ������ ����Ų��.
		 */
		int[] arr= {10,22,37};
		int[] copy= arr;
		
		arr[0]++;
		System.out.println("arr[0]=" + arr[0] + "copy[0] ="+ copy[0]);
		
		for(int i=0;i<copy.length;i++){
			System.out.println(copy[i]+"\t");
		}
		
		//�迭 ���縦 �̿��� swap
		
		int[] arr1 = {1,3,5,7,9};
		int[] arr2 = {20,40,60};
		
		System.out.println("\n\narr1�� �ּ� : " + arr1 + ", arr2�� �ּ� : " + arr2);
		
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
		
		System.out.println("\n\nswap �� arr1�� �ּ� : " + arr1 + ", arr2�� �ּ� "+ arr2);
	}
}
