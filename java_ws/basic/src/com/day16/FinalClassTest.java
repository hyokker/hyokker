package com.day16;


	/*
	final - 마지막의, 변경될 수 없는
	[1] final 변수
		-값을 변경 할 수 없는 상수
		멤버변수, 지역변수에 모두 사용 가능
	[2] final method
		-오버라이딩을 할 수 없게 됨
		
	[3] final class 
		-자식 클래스를 정의하지 못하게 됨
		
	*/

final class Parent{
	
}

//class Child extends Parent{ 
//	//error : The type Child cannot subclass the final class Parent	
//}

class Parent2{
	public void func1() {
		System.out.println("func1()");
	}
	public final void func2() {
		System.out.println("func2()");
	}
}

class Child2 extends Parent2{
	public void func1() {
		System.out.println("오버라이딩 func1()");
	}
	/*
	public final void func2() { //error 
		//Cannot override the final method from Parent2
	}
	*/
}

class MyFinal{
	public final static double PI=3.141592;
	public final int DELIVERY=3000;
	int age=20;
}
public class FinalClassTest {
	
	public static void main(String[] args) {
		MyFinal obj = new MyFinal();
		System.out.println(obj.age);
		System.out.println(MyFinal.PI);
		System.out.println(obj.DELIVERY);
		
		obj.age=23;
		//MyFinal.PI=3.14; //error
		//The final field MyFinal.PI cannot be assigned
		//obj.DELIVERY=2500;//error
		
		//final 지역변수
		final double INTEREST_RATE=0.02;
		System.out.println(INTEREST_RATE);
		
		//INTEREST_RATE=0.15; //error 
		/*
		  final 변수 - 상수
					- 한번 초기화 되면 더 이상 값을 변경할 수 없는 멤버
		 */
	}

}
