package com.day6;

import java.util.*;

public class ForTest {
	
	public static void main(String[]args) {
		System.out.println("�ݺ��ϰ� ���� Ƚ���� �Է��ϼ���");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.println("����ִ� java!!");
		}
		for(int i=0;i<=num;i++) {
			System.out.println("i = " + i);
			
		}
		int sum = 0;
		for(int i=0;i<=num;i++) {
			sum+=i;
			System.out.println("i =" + i + ", sum = "+ sum);
		}
		System.out.println("0����" + num + "������ �� = " + sum );
	}
}
