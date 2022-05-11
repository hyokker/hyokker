package com.day15;

/*
 ��ü�������� 3��Ư¡ - ���м�(ĸ��ȭ), ��Ӽ�, ������
 
 ��� - �θ� Ŭ������ �������, ������ �״�� �����޾� ����ϰ�, �ڽŸ��� ������ҿ� ������ �߰��ؼ� ���
 	- Ŭ������ ��ӹް� �Ǹ� �θ� Ŭ������ ������� �����ٰ� ����� �� �ִ�.
 	- �ڽ� Ŭ�������� �������� �κ��� �θ� Ŭ�������� �����ϰ�, �ڽ� Ŭ������ �ڽſ� ���ǵ� ����鸸 ����
 
 �θ� Ŭ���� - ����(super)Ŭ����, �⺻(base)Ŭ����, ���� Ŭ����
 �ڽ� Ŭ���� - ����(sub)Ŭ����, �Ļ�(derived)Ŭ����, �ڼ� Ŭ����
 
 �ڽ� Ŭ������ ��� ������ �θ� Ŭ������ ���ų� ����
 
 class �ڽ�Ŭ������ extends �θ�Ŭ������
 */	
class Parent{
	protected String name;
	protected int age;
	protected int money=10000;
}
class Son extends Parent{
	Son(){
		this.name="�Ƶ�";
		this.age=30;
	}
	
	public void printInfo() {
		System.out.println("����" + this.name);
		System.out.println("���̴�" + this.age);
		System.out.println("�������� ������" + this.money + "\n");
	}
}

class Daughter extends Parent{
	Daughter() {
		this.name="��";
		this.age=25;
	}
	public void printInfo() {
		System.out.println("����" + this.name);
		System.out.println("���̴�" + this.age+ " \n");
	}
}	
//

class GrandChild extends Son{
	GrandChild(){
		this.name="����";
		this.age=2;
		
		
	}
}
public class Inheritance1 {
	public static void main(String[] args) {
		Son hong = new Son();
		hong.printInfo();
		
		Daughter d = new Daughter();
		d.printInfo();
		
		GrandChild gc = new GrandChild();
		gc.printInfo();
	}

}
