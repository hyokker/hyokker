package com.day15.sub;

/*
 super.멤버 - 부모의 멤버를 참조하는 super (부모의 멤버와 자신의 멤버를 구별하는 데 사용)
 super() - 부모 생성자를 호출하는 super()
 
 
 
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
