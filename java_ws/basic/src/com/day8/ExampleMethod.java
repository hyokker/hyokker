package com.day8;

public class ExampleMethod {

	// 1) �Ű�����, ��ȯ���� ��� ���°��
	public static void func1() {
		System.out.println("Hello Java");
	}

	// 2) �Ű������� �ִ� ���
	public static void func2(int a) {
		for (int i = 1; i <= a; i++) {
			System.out.println("Hello Java");
		}
	}

	// 3) �Ű������� ����, ��ȯ���� �ִ� ���

	public static int func3() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		int avg = sum;
		return sum;
	}

	// 4) �Ű�����, ��ȯ���� ��� �ִ°��
	public static double func4(double a, double b) {
		double c = a * b;
		return c;
	}

	public static void main(String[] args) {

		// 1) �Ű����� ��ȯ���� ���� ���
		func1();

		System.out.println("==============");
		// 2) �Ű������� �ִ� ���
		
		
		func2(3);
		

		// 3) ��ȯ���� �ִ� ���

		int sum = func3();
		System.out.println("sum =" + sum);

		// 4) �Ű�����, ��ȯ���� �Ѵ� �ִ� ���

		double d = func4(10.5, 5.5);
		System.out.println("d = " + d);
	}

}
