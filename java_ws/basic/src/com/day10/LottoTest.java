package com.day10;

import java.util.Arrays;
import java.util.Scanner;

public class LottoTest {

	public static void main(String[] args) {
		// int Lotto=(int)Math.random()*45 + 1
		// Arrays.Sort(int[] a)
		//1. �迭 ����� 2.6�� �ݺ� 3. random�� �̾Ƽ� �迭�� �ֱ� 4.�ߺ�Ȯ��. 5.���� 6.���
		
		//1. ��Ұ� 6���� �迭 �����
		int[] arr= new int[6];
	
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {		
				//2. 6�� �ݺ�ó��
			for(int i=0;i<arr.length;i++) {
				
				//3. 1~45������ ������ ���� ���ؼ� �迭�� �ֱ�
				int temp=(int)(Math.random()*45+1);
				arr[i]=temp;
				
				//4.�ߺ�����
				for(int k=0; k<i;k++) {
					if(arr[k]==arr[i]) {
						i--;
						break;
					}
				}//���� for
			}//�ٱ� for
			
				//5.����
				Arrays.sort(arr);
				
			
				//6. ���
				for(int n : arr) {
					
					System.out.print(n+" ");
				}//for
		
				System.out.println("\n"
						+ "�׸� �Ϸ��� Q");
				String quit=sc.nextLine();
				if(quit.equalsIgnoreCase("Q"))
					break;
		}//while
	}

}
