package com.day21;

import java.util.Scanner;

/*
 사용자 정의 예외 클래스 만들기
 Exception을 상속받고, super(message) 이용하여 Exception 생성자에 메세지를 넘겨주면 된다
 
 public Exception(String message)
 */

class AgeInputException extends Exception{
	AgeInputException() {
		super("유효하지 않은 나이입니다!");
	}
}
public class UserExTest {
	public static int readAge() throws AgeInputException{
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 입력!");
		int age=sc.nextInt();
		if(age<0|| age>150) {
			throw new AgeInputException();
		}
		
		return age;
	}
	public static void main(String[] args) {
		try {
			int age=readAge();
			System.out.println("나이는 " + age + "세");
		}catch(AgeInputException e) {
			System.out.println(e.getMessage());
		}
	}

}
