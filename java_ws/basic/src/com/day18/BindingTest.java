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
		Parent p = new Child();//����������
		System.out.println("p.x=" + p.x); //�θ��� ���������δ� �θ��� ����� ���� ����
		//=> 100
		p.method(); // ��, �������̵� �޼��尡 �ִٸ� �ڽ��� �������̵� �޼��� ȣ��
	}

}
