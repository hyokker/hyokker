package com.day9;

public class ArrayTest1 {

	public static void main(String[] args) {
		/*
		 �迭
		 - ���� Ÿ���� �����͸� ���� �� ������ �� �ִ� �����
		 - ������ Ÿ���� �������� �ϳ��� �̸����� ���� ���� ��
		 - ������, �迭�� �̸��� �ּҰ��� ��
		 �迭�� ��ҵ��� �ε���(index, ÷��)�� ���� ����
		 */
		//[1] �迭����, �޸��Ҵ�, �ʱ�ȭ�� ����
		//1. �迭 ����
		int[] arr;
		
		//2. �޸��Ҵ�
		arr = new int[3];
		
		//3. �ʱ�ȭ
		arr[0]=10;
		arr[1]=23;
		arr[2]=65;
		
		//�迭 ��ҵ� ���
		/*
		 System.out.println(arr[0]);
		 System.out.println(arr[1]);
		 System.out.println(arr[2]); �̰� �ʹ� ����� �ߺ��Ǵ°��� ���ϴ°� ����
		 */
		
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		//[2] �迭����� �޸� �Ҵ��� ���ÿ�
		int [] arr2 = new int[2];
		//=> �迭 ��ҵ��� �⺻��(default��)���� �ʱ�ȭ��
		//[3] �迭����, �޸��Ҵ�, �ʱ�ȭ�� ��� ���ÿ�
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
		
		//�迭�� �ε����� 0���� ����
		
		//
		int arr7[];
		arr7 = new int [4];
		
		for(int i=0;i<arr7.length;i++) {
			System.out.println(arr7[i]);
		}
		
		System.out.println("�迭 ����� ũ�� :" +arr.length);
		System.out.println("�迭�� �ּ� : " + arr);
	}
}


