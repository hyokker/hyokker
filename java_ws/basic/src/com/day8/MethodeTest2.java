package com.day8;

public class MethodeTest2 {
	// [1]매개변수, 반환값이 모두 없는 메서드 정의
	public static void func1() {
		System.out.println("*********");
	}
	// [2]매개변수는 있고, 반환값은 없는 메서드

	public static void func2(int cnt){
		//입력받은 개수만큼 별 출력하는 기능
		for(int i=0;i<cnt;i++) {
			System.out.print("8");
		}
		System.out.println();
		
	}
	
	//[3]매개변수는 없고, 반환값은 있는 메서드 정의
	public static float func3() {
		//1~10까지의 합
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		
		float avg =sum/10f;
		return avg;
	}
	// [4] 매개변수, 반환값이 모두 있는 메서드 정의
	public static int func4(int a, int b) {
		// 두수의 합 구하는 기능
		int c = a+b;
		return c;
	}
	
	
	public static void main(String[] args) {
		// 1) 매개변수, 반환값이 없는 메서드호출
		func1();
		
		// 2) 매개변수는 있고, 반환값은 없은 메서드
		func2(7);
		
		// 3) 매개변수는 없고, 반환값은 있는 메서드 호출
		float f = func3();
		System.out.println("f ="+f);
		
		// 4) 매개변수도 있고, 반환값도 있는 메서드 호출
		int res = func4(10, 30);
		System.out.println("res ="+ res);
	}
}
