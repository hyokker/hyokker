package com.day21;

class Person{
	public void showInfo() {
		System.out.println("this = " + this);
	}
}
public class ToStringTest {

	public static void main(String[] args) {
		Person p = new Person();
		p.showInfo();
		
		System.out.println("p객체를 표현하는 기본 문자열 :"+ p.toString());
		System.out.println("p=" + p);
		System.out.println(p);
		
		/*
		  	toString() 메서드가 자동으로 호출되는 경우
		 	[1] System.out.println() 메서드에 매개변수로 들어가는 경우
 			[2] 객체에 대하여 더하기(+) 연산을 하는 경우
		 */
		
		/*
		 toStrint() 메서드의 결과 : 클래스명@16진수 해시코드
		 hashCode() - 객체의 메모리 주소를 리턴
		 */
		
		
	}

}
