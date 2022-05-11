package com.day18;

class Parent{
	int x = 100;
	
	public void method() {
		System.out.println("Parent");
	}
	
}

class Child extends Parent{
	int x = 300;
	
	public void method() {
		System.out.println("Child");
	}
	
	
}
public class BindingTest {

	public static void main(String[] args) {
		Parent p = new Child();//다형성에서
		System.out.println("p.x=" + p.x); //부모의 참조변수로는 부모의 멤버만 접근 가능
		//=> 100
		p.method(); // 단, 오버라이딩 메서드가 있다면 자식의 오버라이딩 메서드 호출
	}

}
