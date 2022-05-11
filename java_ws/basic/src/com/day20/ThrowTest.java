package com.day20;

import java.util.Scanner;

public class ThrowTest {

	public static void main(String[] args) {
		/*
		 throw
		 - 개발자가 고의로 예외를 직접 발생시킬 수 있다
		 - 자바 가상머신에 의해 인식될 수 있는 예외상황이 아니지만,
		   프로그램의 성격에 따라 개발자가 정의한 예외상황인 경우 throw문 사용
		   
		 throw new Exception("예외 메시지");
		 
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("나이 입력");
			int age=sc.nextInt();
			if(age<0 || age>150) {
				throw new Exception("나이는 양수여야 하고, 150보다 작아야 합니다!");
			}
			
			System.out.println("나이 : " + age);
		}catch (Exception e) {
			System.out.println("예외 : " + e.getMessage());
		}
		System.out.println("\n 다음문장~");
	}

}
