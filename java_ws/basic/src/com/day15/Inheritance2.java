package com.day15;

import java.util.Scanner;

class Person{
	protected String name;
	protected int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
}//class

class Student2 extends Person{
	private String stNo;  //�й�
	
	public String getStNo() {
		return stNo;
	}
	
	public void setStNo(String stNo) {
		this.stNo=stNo;
	}
}//class

public class Inheritance2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�, ����, �й� �Է�!");
		String name=sc.nextLine();
		int age=sc.nextInt();
		sc.nextLine();
		String stNo=sc.nextLine();
		
		Student2 st = new Student2();
		st.setAge(age);
		st.setName(name);
		st.setStNo(stNo);
		
		System.out.println("\n�̸� : " + st.getName());
		System.out.println("���� : " + st.getAge());
		System.out.println("�й� : " + st.getStNo());
		
	}

}//class
