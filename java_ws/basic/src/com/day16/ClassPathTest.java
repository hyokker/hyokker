package com.day16;

/*
 환경변수 path : 확장자가 exe인 실행파일을 찾는 경로
 환경변수 classpath : 확장자가 class인 클래스파일을 찾는 경로
 
 자바 가상머신이 클래스를 찾을 때, 이 클래스 패스를 기준으로 찾게 됨
 */

class AAA{
	public void printName() {
		System.out.println("AAA");
	}
}

class BBB{
	public void printName() {
		System.out.println("BBB");
	}
}
public class ClassPathTest {

	public static void main(String[] args) {
		System.out.println("class path test!!");
		
		AAA a = new AAA();
		a.printName();
		
		BBB b = new BBB();
		b.printName();
	}

}
