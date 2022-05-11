package com.day15;

/*
 객체지향언어의 3대특징 - 은닉성(캡슐화), 상속성, 다형성
 
 상속 - 부모 클래스의 구성요소, 행위를 그대로 물려받아 사용하고, 자신만의 구성요소와 행위는 추가해서 사용
 	- 클래스를 상속받게 되면 부모 클래스의 멤버들을 가져다가 사용할 수 있다.
 	- 자식 클래스들의 공통적인 부분은 부모 클래스에서 관리하고, 자식 클래스는 자신에 정의된 멤버들만 관리
 
 부모 클래스 - 상위(super)클래스, 기본(base)클래스, 조상 클래스
 자식 클래스 - 하위(sub)클래스, 파생(derived)클래스, 자손 클래스
 
 자식 클래스의 멤버 개수는 부모 클래스와 같거나 많다
 
 class 자식클래스명 extends 부모클래스명
 */	
class Parent{
	protected String name;
	protected int age;
	protected int money=10000;
}
class Son extends Parent{
	Son(){
		this.name="아들";
		this.age=30;
	}
	
	public void printInfo() {
		System.out.println("나는" + this.name);
		System.out.println("나이는" + this.age);
		System.out.println("물려받은 유산은" + this.money + "\n");
	}
}

class Daughter extends Parent{
	Daughter() {
		this.name="딸";
		this.age=25;
	}
	public void printInfo() {
		System.out.println("나는" + this.name);
		System.out.println("나이는" + this.age+ " \n");
	}
}	
//

class GrandChild extends Son{
	GrandChild(){
		this.name="손자";
		this.age=2;
		
		
	}
}
public class Inheritance1 {
	public static void main(String[] args) {
		Son hong = new Son();
		hong.printInfo();
		
		Daughter d = new Daughter();
		d.printInfo();
		
		GrandChild gc = new GrandChild();
		gc.printInfo();
	}

}
