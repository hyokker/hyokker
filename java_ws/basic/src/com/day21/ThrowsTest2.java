package com.day21;

public class ThrowsTest2 {

	public static void main(String[] args) {
		method1();
	}
	
	
	public static void method1() {
		method2();
	}
	public static void method2() {
		try {
			throw new Exception("예외발생!!!!");
		}catch(Exception e) {
			System.out.println(e.getMessage());
	
		}
	}
}
