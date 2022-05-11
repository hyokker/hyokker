package com.day16;

import java.util.Scanner;

class Person {
	protected String name;
	protected int age;

	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public void showInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}
	
}

class Student extends Person{
	private String major;
	
	Student(String name, int age, String major){
		super(name, age);
		this.major=major;
	}


	public void showInfo() {
		super.showInfo();
		System.out.println("���� :" + major);
	}
}
public class SuperTest3 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("�̸�, ����, ���� �Է�!");
	String name = sc.nextLine();
	int age = sc.nextInt();
	sc.nextLine();
	String major = sc.nextLine();
	
	Student st = new Student(name, age, major);
	st.showInfo();
	}
}
