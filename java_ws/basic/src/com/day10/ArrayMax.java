package com.day10;

public class ArrayMax {

	public static void main(String[] args) {
		//�迭�� ����� �ִ밪 ���ϱ�
		int[] arr= {10,59,20,35,77,26};
		int max = arr[0];//10
		
		for(int i=1;i<arr.length;i++) {
			if(max < arr[i]) {
				max=arr[i];
			}
		}//for

		
		//�迭 ��ü ��� ���
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+ " ");
		}
		
		System.out.println("\n\n�ִ밪 : " + max);
	}

}
