package com.day9;

import java.util.Scanner;

public class OverloadingTest {
	public static int add(int a,int b) {
		int c=a+b;
		return c;
}
	public static double add(double a,double b) {
		double c=a+b;
		return c;
}
	public static String add(String a,String b) {
		String c=a+b;
		return c;
}
//	public static String add(int a,int b) { // 매개변수가 같으면 안된다! 개수나 자료형이 다른경우 사용할수있다.
//		//=> 반환타입으로는 구별안함
//		String c = Integer.toString(a+b);
//		return c;
//}

	public static void main(String[] args) {
		/*
		 오버로딩 메서드
		 - 하나의 클래스에서 동일한 이름을 가진 메서드
		 단, 매개변수의 개수나 자료형이 다른경우 사용
		 */
		int res=add(5, 7);
		
		double d1=3.14, d2=5.78;
		double res2=add(d1,d2);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 2개 입력!");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();

		String result=add(s1,s2);
		
		System.out.println(res);
		System.out.println(res2);
		System.out.println(result);
	}

}
