package com.day10;

public class DimensionTest1 {

	public static void main(String[] args) {
		/*
		 2���� �迭 
		 */
		//[1]�迭����, �޸��Ҵ�, �ʱ�ȭ�� ��� ����
		//�迭����
		int[][] arr;
		
		//�޸��Ҵ�
		arr = new int[2][3]; // 2�� 3��
		
		//�ʱ�ȭ
		arr[0][0] = 10;
		arr[0][1] = 12;
		arr[0][2] = 17;
		arr[1][0] = 22;
		arr[1][1] = 33;
		arr[1][2] = 56;
		
		//[2] �迭�� ����� �޸� �Ҵ��� ���ÿ�
		
		int arr2[][]= new int[3][2]; // 3�� 2��
		
		arr2[0][0]=1;
		arr2[0][1]=3;
		arr2[1][0]=11;
		arr2[1][1]=33;
		arr2[2][0]=12;
		arr2[2][1]=34;
		
		//[3] �迭����, �޸� �Ҵ�, �ʱ�ȭ�� ��� ���ÿ�
		int[][] arr3 = {{1,2,3,4},{6,7,8,9},{11,12,13,14}};
		
		//��� ��� ���� ��Ÿ���� �ϱ� ������ ��ø for���� ����Ѵ�.
		for(int i=0;i<arr.length;i++) { 	//��
			for(int j=0;j<arr[i].length;j++) { //��
				System.out.print(arr[i][j]+ "\t");
		}//���� for
		System.out.println();
		}//�ٱ� for
		
		System.out.println("\n\n���� ���� : " + arr.length);
		System.out.println("���� ���� : "+ arr[0].length);
	}

	
}
