package com.day13;

import java.util.Scanner;

class Person{
	//1.멤버변수
	private String name;
	private int age;
	private String tel;
	
	//2.생성자
	public Person(String name, int age, String tel) {
		this.name = name;
		this.age = age;
		this.tel = tel;
	}
	
	//3.gettet/setter
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
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	//4.메서드
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("전화번호 : " + tel + "\n");
	}
}

public class PersonTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 나이, 전화번호를 입력하세요");
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String tel =sc.nextLine();
		
		Person p = new Person(name, age, tel);
		p.showInfo();
		
		p.setName("김길동");
		p.setAge(25);
		p.setTel("010-1234-5678");
		
		System.out.println("이름은 : " + p.getName());
		System.out.println("나이는 : " + p.getAge());
		System.out.println("전화번호는 : " + p.getTel());
		
	
	}

}
