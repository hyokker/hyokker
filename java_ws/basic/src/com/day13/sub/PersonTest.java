package com.day13.sub;

class Person{
	//1.�������
	private String name;
	private int age;
	private static int count; //
	
	//static ���̾���. �����Ѵ�
	
	/*
	 static���� ( Ŭ���� ����)
	 - Ŭ���� �������� �ϳ��� �����Ǿ� ��� ��ü�� ������
	 - Ŭ���� �������� �ٷ� ȣ�� ���� => Ŭ������ �̸����� ����
	 - �ش� Ŭ������ �޸𸮿� �ε�ɶ� ������
	 * 
	  
	 */
	//2.������
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
		
		System.out.println(++count + "���� ��ü ī��Ʈ ������!");
	}
	
	
	//3.�޼���
	
	public void display() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age + "\n");
	}
}
public class PersonTest {

	public static void main(String[] args) {
		System.out.println("test");
		Person hong = new Person("ȫ�浿", 20);
		hong.display();
		
		
		Person kim = new Person("��浿", 20);
		kim.display();
	}
	//java PersonTest
}
