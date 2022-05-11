package com.day16;

import java.util.Scanner;

class Person2{
	protected String name;
	protected int age;

	Person2(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public void showInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}
	
}

class Student2 extends Person{
	protected String stNo;
	
	Student2(String name, int age, String stNo){
		super(name, age);
		this.stNo=stNo;
		
	}


	public void showInfo() {
		super.showInfo();
		System.out.println("�й� :" + stNo);
	}
}

class Graduate extends Student2{
	private String major;
	
	Graduate(String name, int age, String stNo, String major){
		super(name, age, stNo);
		this.major=major;
		
	}
	
	//�������̵�
	
	public void showInfo() {
		super.showInfo();
		System.out.println("���� : " + major+"\n");
	}
}
public class GraduateTest {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("�̸�, ����,�й�, ���� �Է�!");
	String name = sc.nextLine();
	int age = sc.nextInt();
	sc.nextLine();
	String stNo=sc.nextLine();
	String major = sc.nextLine();
	
	Graduate gr = new Graduate(name, age, stNo, major);
	gr.showInfo();
	}
}
