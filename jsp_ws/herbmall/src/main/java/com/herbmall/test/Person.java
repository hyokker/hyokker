package com.herbmall.test;
	
/*싱글톤 패턴(SingleTon)
-인스턴스를 하나만 생성해서 사용하는 패턴*/


public class Person {
	//static 변수 - 클래스 차원에서 하나만 생성되어 모든 객체가 공유한다
	private static Person instance;

	private Person() { //private 생성자
	}
	
	public static Person getInstance() {
		if(instance==null) {
			instance = new Person();
		}
		
		return instance;
	}
	
	public void showInfo() {
		System.out.println("Person 메서드!");
	}
}
