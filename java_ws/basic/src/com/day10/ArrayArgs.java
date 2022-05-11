package com.day10;

import java.util.Scanner;

public class ArrayArgs {
	//�迭�� �Ű������� �޴� �޼���
	//call by reference : �Ű������� ���� �Ѿ�� ���� �ƴ϶�, �ּҰ� �Ѿ
	//=> ���� �ּҸ� ����Ű�Ƿ�, ���� ���� ����Ű�� ��
	//==> �޼��忡�� �Ű������� ���� �����ϸ� main()������ ������ ���� ����� (������ ������ ����)
	public static double findAvg(int[] score) {
		//��,��,�� ������ �迭�� �޾ƿͼ� ��� ���� ����ϱ�
		int sum=0;
		for(int i=0;i<score.length;i++) {
			sum+=score[i]; //����
		}
		
		double avg = (double)sum/score.length; 
		
		score[0]++; //
		
		return avg;
	}
	//call by value : ���� �Ű������� �ѱ�
	//�޼��忡�� �Ű������� ���� �����ص� main(�޼��带 ȣ���Ѱ�)������ ������ ������ ���� �ʴ´�.
	public static int add(int a,int b) {
		int c=a+b;
		
		a++; // 11
		return c;
	}
	
	public static void main(String[] args) {
		int[] arr= {90,85,77};
		double avg=findAvg(arr);
		System.out.println("��� : " + avg);

		int[] arr2 = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("��, ��, �� ���� �Է�");
		
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		
		avg=findAvg(arr2);
		System.out.println("��� :" + avg);
		
		//
		System.out.println("�޼��忡�� �� ���� �� arr2[0]"+arr2[0]);
		
		int n1=10, n2=30;
		int res = add(n1, n2);
		
		System.out.println("res =" + res +",�޼��忡�� �� ���� �� n1="+ n1);

	}

}
