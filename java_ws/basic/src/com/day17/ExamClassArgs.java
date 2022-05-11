package com.day17;

class AAA{
	public void method1(Cat c) {
		c.bark();
	}
	public void method2(Animal an) {
		an.bark();
	}
	
	public Cat method3() { //=>Cat 가 리턴된다
		return  new Cat();
	}
	public Animal method4() { //=>부모에 자식을 넣는다> Cow 가 리턴된다
		return  new Cow();
		
	}
}

public class ExamClassArgs {

	public static void main(String[] args) {
		//각 메서드 호출
		AAA a = new AAA();
		a.method1(new Cat());
		
		a.method2(new Cow());
		
		Cat c =a.method3();
		
		
		Animal an=a.method4();
		
		
	}

}
