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
	private String stNo;  //학번
	
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
		System.out.println("이름, 나이, 학번 입력!");
		String name=sc.nextLine();
		int age=sc.nextInt();
		sc.nextLine();
		String stNo=sc.nextLine();
		
		Student2 st = new Student2();
		st.setAge(age);
		st.setName(name);
		st.setStNo(stNo);
		
		System.out.println("\n이름 : " + st.getName());
		System.out.println("나이 : " + st.getAge());
		System.out.println("학번 : " + st.getStNo());
		
	}

}//class
