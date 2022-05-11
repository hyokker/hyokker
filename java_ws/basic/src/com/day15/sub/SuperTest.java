package com.day15.sub;

/*
 super.��� - �θ��� ����� �����ϴ� super (�θ��� ����� �ڽ��� ����� �����ϴ� �� ���)
 super() - �θ� �����ڸ� ȣ���ϴ� super()
 
 
 
 */
class Parent{
	 int x = 10;
}

class Child extends Parent{
	int x = 20;
	
	public void method() {
		System.out.println("x=" + x);//20
		System.out.println("this.x=" + this.x);//20
		System.out.println("super.x=" + super.x);//10
	}
	
}
public class SuperTest {

	public static void main(String[] args) {
		 Child ch = new Child();
		 ch.method();
	}

}
