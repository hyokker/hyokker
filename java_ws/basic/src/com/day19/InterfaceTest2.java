package com.day19;
/*
 �������� ������ �� Ŭ���� (A-B)
 ���� : �������� ������ ��  Ŭ������ ����(provider)�� ����Ǹ�,
 �̸� ����ϴ� �ٸ� �� �� (user)�� ����Ǿ�� ��
 
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
		System.out.println("B Ŭ������ �޼���!");
	}
}
class C{
	public void methodB() {
		System.out.println("C Ŭ������ �޼���!");
	}
}
public class InterfaceTest2 {

	public static void main(String[] args) {
		A a = new A();
		//methodA() ȣ��
		//B b = new B();
		//a.methodA(new B());
		a.methodA(new C());
	}

}
