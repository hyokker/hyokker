package com.day8;

public class ExampleMethod {

	// 1) 매개변수, 반환값이 모두 없는경우
	public static void func1() {
		System.out.println("Hello Java");
	}

	// 2) 매개변수가 있는 경우
	public static void func2(int a) {
		for (int i = 1; i <= a; i++) {
			System.out.println("Hello Java");
		}
	}

	// 3) 매개변수는 없고, 반환값은 있는 경우

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

	// 4) 매개변수, 반환값이 모두 있는경우
	public static double func4(double a, double b) {
		double c = a * b;
		return c;
	}

	public static void main(String[] args) {

		// 1) 매개변수 반환값이 없는 경우
		func1();

		System.out.println("==============");
		// 2) 매개변수가 있는 경우
		
		
		func2(3);
		

		// 3) 반환값이 있는 경우

		int sum = func3();
		System.out.println("sum =" + sum);

		// 4) 매개변수, 반환값이 둘다 있는 경우

		double d = func4(10.5, 5.5);
		System.out.println("d = " + d);
	}

}
