package com.day20;

import java.util.Scanner;

public class TryTest1 {

	public static void main(String[] args) {
		/*
		 예외 - 프로그램의 실행도중에 발생하는 예상치 못한 오류
		 		처리되지 않은 예외는 프로그램의 실행을 중단시키는 원인
		 		
		 
		 에러
		 	[1]	컴파일 에러(compile error)
		 	[2]	실행 에러(Runtime error) - 프로그램을 실행시켜 사용하는 도중에 발생되는 에러
		 		1)에러(error)
		 			- 메모리 부족, 스택오버플로우 같이 일단 발생하면 
		 			  복구할 수 없는 심각한 오류
		 		2)예외(Exception)
		 			- 발생하더라도 수습될 수 있는 비교적 덜 심각한 오류

		 
		 예외 처리
		 - 예외의 발생에 대비한 코드를 작성하는 것
		 - 프로그램 실행도중 발생한 에러를 처리, 에러에 의해서 비정상적으로 프로그램이
		 종료되는 것을 막아줌
		 
		 목적
		 - 비정상 종료를 막고, 정상적인 실행상태를 유지할 수 있도록 하는 것

		 예외처리 구문
		 try{
		 	예외가 발생할 만한 코드들이 배치
		 }catch(Exception e){
		 	예외를 잡아 실패에 대한 처리를 하는 코드
		 }
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("두 개의 정수 입력!");
			int n1=sc.nextInt(); //10
			int n2=sc.nextInt(); //0
			
			int result = n1/n2; //
			System.out.println("몫 :" + result );
			System.out.println("나머지 :" + n1%n2);
		}catch(Exception e) {
			System.out.println("예외 발생함! : " + e.getMessage());
		}
		System.out.println("\n-----next!-----");
	}

}
