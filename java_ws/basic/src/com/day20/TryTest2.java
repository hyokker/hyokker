package com.day20;

import java.util.Scanner;

public class TryTest2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<2;i++) {
			try {
				System.out.println("�� ���� �Է�!");
				int n1=sc.nextInt();
				int n2=sc.nextInt();
				
				System.out.println("������: " + n1/n2);
			}catch(ArithmeticException e) {
				System.out.println("���� : "+ e.getMessage());
				i--;
				
			}
		}//for
	}

}
