package com.day16;

/*
 ȯ�溯�� path : Ȯ���ڰ� exe�� ���������� ã�� ���
 ȯ�溯�� classpath : Ȯ���ڰ� class�� Ŭ���������� ã�� ���
 
 �ڹ� ����ӽ��� Ŭ������ ã�� ��, �� Ŭ���� �н��� �������� ã�� ��
 */

class AAA{
	public void printName() {
		System.out.println("AAA");
	}
}

class BBB{
	public void printName() {
		System.out.println("BBB");
	}
}
public class ClassPathTest {

	public static void main(String[] args) {
		System.out.println("class path test!!");
		
		AAA a = new AAA();
		a.printName();
		
		BBB b = new BBB();
		b.printName();
	}

}
