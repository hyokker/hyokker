package com.day20;

import java.util.Scanner;

public class ExamCatch {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("�� �� �Է�");
		try {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int n3 = n1%n2;
			System.out.println(n3);
		}catch(ArithmeticException e) {
			System.out.println("0���� ������ ������" + e.getMessage());
		}catch(Exception e) {
			System.out.println("���� �߻���! " + e.getMessage());
		}
	}
}
