package com.day21;

public class ThrowsTest {

	public static void main(String[] args) {
		/*
		 RuntimeException과 그 자식 클래스들
		 - 개발자의 실수에 의해서 발생할 수 있는 예외들
		 - 예외처리 안해도 됨
		 
		 Exception클래스와 그 자식 클래스들
		 - 반드시 예외처리를 해주어야 함
		 그렇지 않으면 컴파일 에러 발생
		 
		 예외를 처리하는 방법
		 [1] try~catch문을 사용
		 [2] throws를 이용하여 예외 떠넘기기(예외전달, 예외를 메서드에 선언) 
		 
		 void method() throws Exception1, Exception2{
		 }
		 
		 => 메서드 내에서 발생할 가능성이 있는 예외를 메서드의 선언부에 명시하여
		 이 메서드를 사용하는 쪽에서는 이에 대한 처리를 하도록 강요함
		 */
		try {
			method1();
		}catch(Exception e) {
			System.out.println("예외 :" + e.getMessage() );
		}
		
		System.out.println("\n=========next!==========");
	}
	
	public static void method1() throws Exception{
		method2();
	}
	
	public static void method2() throws Exception {
		throw new Exception("예외 발생 했다!!");
	}
}
