package com.day7;

import java.util.Scanner;

public class ExampleWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�Է��� ������ ������ �Է��ϼ���");
		int cnt = sc.nextInt();
		int sum = 0;
		for(int i=0;i<cnt;i++) {
			System.out.println("������ �Է��ϼ���");
			int num =sc.nextInt();
			sum+=num;
			
		}
		double avg =(double)sum/cnt;
		System.out.println("\n�Էµ� ������ ��ü ��� :" + avg);
		
		
		//public static long round(double a)
		double d = 3.641592;
		long k = Math.round(d);
		System.out.println("d="+d+",k= "+k);
		
		//�Ҽ����� 3�ڸ��� ���⵵�� �ݿø�(�Ҽ����� 4°�ڸ����� �ݿø�)
		d= Math.round(d*1000)/1000.0;// 3641.593
		System.out.println("�ݿø� �� d="+d);
		
		avg = Math.round(avg*100)/100.0;
		System.out.println("�Էµ� ������ ��ü ���" + avg);
	}
}
