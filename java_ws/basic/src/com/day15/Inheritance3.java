package com.day15;

class GrandFather{
	GrandFather(){
		System.out.println("GrandFather 생성자");	
	}
	
	public void showGrand() {
		System.out.println("메서드 - GrandFather!");
	}
}
	

class Father extends GrandFather{
	Father(){
		System.out.println("Father 생성자");
	}
	
	public void showFather() {
		System.out.println("메서드 - Father!");
	}
}

class Child extends Father{
	Child(){
		System.out.println("Chile 생성자");
	}
	public void showChild() {
		System.out.println("메서드 - Child!");
	}
	
}
public class Inheritance3 {
	public static void main(String[] args) {
		Child ch = new Child();
		/*
		 단계별 상속
		 - 상위 레벨의 생성자가 차례대로 호출되어지고,제일 마지막에 자신의 것이 호출됨
		 - 메모리는 최상위 클래스부터 차례대로 생성됨
		 */
		
		System.out.println();
		ch.showChild();
		ch.showGrand();
		ch.showFather();
	}
}
