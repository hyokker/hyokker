package com.day16;


	/*
	final - ��������, ����� �� ����
	[1] final ����
		-���� ���� �� �� ���� ���
		�������, ���������� ��� ��� ����
	[2] final method
		-�������̵��� �� �� ���� ��
		
	[3] final class 
		-�ڽ� Ŭ������ �������� ���ϰ� ��
		
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
		System.out.println("�������̵� func1()");
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
		
		//final ��������
		final double INTEREST_RATE=0.02;
		System.out.println(INTEREST_RATE);
		
		//INTEREST_RATE=0.15; //error 
		/*
		  final ���� - ���
					- �ѹ� �ʱ�ȭ �Ǹ� �� �̻� ���� ������ �� ���� ���
		 */
	}

}
