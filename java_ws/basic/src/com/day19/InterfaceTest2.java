package com.day19;
/*
 직접적인 관계의 두 클래스 (A-B)
 단점 : 직접적인 관계의 두  클래스는 한쪽(provider)이 변경되면,
 이를 사용하는 다른 한 쪽 (user)도 변경되어야 함
 
 A(user) - > B(provider)
 */

class A{
	/*
	public void methodA(B b) {
		b.methodB();
	}
	*/
	public void methodA(C b) {
		b.methodB();
	}
}

class B{
	public void methodB() {
		System.out.println("B 클래스의 메서드!");
	}
}
class C{
	public void methodB() {
		System.out.println("C 클래스의 메서드!");
	}
}
public class InterfaceTest2 {

	public static void main(String[] args) {
		A a = new A();
		//methodA() 호출
		//B b = new B();
		//a.methodA(new B());
		a.methodA(new C());
	}

}
