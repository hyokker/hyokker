package com.day7;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		/*
		 do ~ while ��
		  - do�� �ִ� ��ɹ��� �� ���� �� while ���� ��
		  - ���Ǻ��� ����� ���� �´�.
		  -	������ �����̴���, ���� ������ �ּ��� �ѹ��� ����
		  
		  do{
		  	��ɹ�;
		  }while(���ǽ�);
		  
		 */
//		int k=0;
//		do {
//			System.out.println(k);
//			
//			k++;
//		}while(k<3);
//		
//		k=1;
//		do {
//			System.out.println("k="+k);
//			
//			k++;
//		}while(k>5);
		
		//����ڷκ��� �Է¹��� ���� ���� ���ϵ�, 0�� �ԷµǸ� ������ ����
		//[1]do~while �̿�
		Scanner sc = new Scanner(System.in);
		
		int num=0;
		int sum=0;
		
		do {
			System.out.println("���ڸ� �Է��ϼ���. 0�̵Ǹ� ����");
			num=sc.nextInt();
			sum+=num;
		}while(num!=0); //{}������ �����ݷ� ; ���� �ݾƾ���
		System.out.println("\ndo~while �̿� �Էµ� ������ ��"+ sum);
		
		//[2]���ѷ����̿�
		 num=0;
		 sum=0;
		while(true) {
			System.out.println("���ڸ� �Է��ϼ���. 0�̵Ǹ� ����");
			num =sc.nextInt();
			if(num==0) break;
			
			sum+=num;
		}
			System.out.println("\nsum ="+ sum);
			//sc.close();
	}
}