package com.test;

import java.util.Scanner;

public class RandomSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ �Է��ϼ���");
		int ran=sc.nextInt();
		int sum=0;
		for(int i=0;i<ran;i++) {
			sum+=(int)((Math.random()*45)+1);
		}
		System.out.println("������ ���� :" + ran);
		System.out.println("1~45 ������ ����"+ran+"���� �հ�" +sum);
	}

}
