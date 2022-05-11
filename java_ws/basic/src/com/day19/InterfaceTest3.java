package com.day19;
/*
 간접적인 관계의 두 클래스(A-I-B)
 - 클래스 A가 클래스 B를 직접 호출하지 않고 인터페이스를 매개체로 하는 경우
 클래스 A 는 인터페이스 I하고만 직접적인 관계에 있기 때문에 클래스 B의 변경에
 영향 받지 않는다.
 */

interface I{
	void method();
}

class AA {
	public void methodA(I i) {
		i.method();
	}
}

class BB implements I{
	public void method() {
		System.out.println("BB클래스에서 구현한 메서드");
	}
}
class CC implements I{
	public void method() {
		System.out.println("CC클래스에서 구현한 메서드");
	}
}
public class InterfaceTest3 {

	public static void main(String[] args) {
		AA a = new AA();
		//methodA()호출
		//a.methodA(new BB());
		a.methodA(new CC());
	}

}
