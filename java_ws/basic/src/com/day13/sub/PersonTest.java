package com.day13.sub;

class Person{
	//1.멤버변수
	private String name;
	private int age;
	private static int count; //
	
	//static 같이쓴다. 공유한다
	
	/*
	 static변수 ( 클래스 변수)
	 - 클래스 차원에서 하나만 생성되어 모든 객체가 공유함
	 - 클래스 차원에서 바로 호출 가능 => 클래스의 이름으로 접근
	 - 해당 클래스가 메모리에 로드될때 생성됨
	 * 
	  
	 */
	//2.생성자
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
		
		System.out.println(++count + "번쨰 객체 카운트 생성됨!");
	}
	
	
	//3.메서드
	
	public void display() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "\n");
	}
}
public class PersonTest {

	public static void main(String[] args) {
		System.out.println("test");
		Person hong = new Person("홍길동", 20);
		hong.display();
		
		
		Person kim = new Person("김길동", 20);
		kim.display();
	}
	//java PersonTest
}
