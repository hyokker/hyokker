package com.day6;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int num=0;
		do{			
			System.out.println("���ڸ� �Է��ϼ���. �������� 0");
			num =  sc.nextInt();

			sum+=num;
		}while(num!=0);

		System.out.println(sum);
	}

}
