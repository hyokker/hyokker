package com.day10;

import java.util.Scanner;

public class Page48 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[5];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("�ܰ� �Է��ϼ���");
			arr[i] = sc.nextDouble();
		}
		
		System.out.println("�������� �Է��ϼ���");
		double e = sc.nextDouble();
		double money = 0.0;
		for(int i=0;i<arr.length;i++) {
		//���ڹݿ� = ���� * ������(2.5% => 0.025)
			money=arr[i]+(arr[i]*(e/100));
			System.out.println("���ڰ� �ݿ��� �ܰ� ��ȸ :" + Math.round(money));
		}
	}

}
