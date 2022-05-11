package com.day17;

  /*
 	다형성(Polymorphism)
 	-여러가지 형태를 가질 수 있는 능력
 	-부모 타입의 참조변수로 자식의 인스턴스를 참조할 수 있도록 함으로써 다형성을 구현
 	-여러 개의 개별적인 클래스를 하나의 부모 클래스 객체로 통합 관리하여 그 효율성을 높인 것
 	
  
  */

class Parent{
	public void parentFunc() {
		System.out.println("부모의 메서드!");
	}
	
	public void showInfo() {
		System.out.println("Parent - showInfo()");
	}
}

class Child extends Parent{
	public void showInfo() {
		System.out.println("Child - showInfo() 오버라이딩 메서드");
	} 
	public void childFunc() {
		System.out.println("자식만의 메서드!!");
	}
}
public class PolymoTest {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.showInfo();
		ch.parentFunc();
		ch.childFunc();
		
		//다형성
		Parent p = new Child();//부모의 참조변수로 자식의 인스턴스 참조
		//부모에 자식 대입(부모에 자식을 넣는다)
		p.showInfo(); //부모의 참조변수로 자식의 오버라이딩 메서드 호출
		p.parentFunc(); // 부모의 참조변수로는 부모의 메서드만 호출가능
		//p.childFunc(); //error : 부모의 참조변수로 자식만의 메서드는 호출 불가!
	}
		/*
		 다형성
		 -[1] 부모에 자식을 넣으면
		 -[2] 부모의 참조변수로는 부모의 멤버들만 사용 가능
		  단, 오버라이딩 메서드의 경우는 자식의 오버라이딩 메서드가 호출됨!
		  (자식만의 메서드는 호출 불가)
		 */
		//=> 부모의 참조변수로 자식의 인스턴스를 참조 할 수 있다. 이때는 자식의 오버라이딩 메서드가
	 	//=> 호출됨
		//부모 타입이 파생된 모든 자식 타입을 가리킬 수 있으므로
		//부모 타입의 변수로 모든 자식 타입을 일관되게 관리할 수 있다.
}
