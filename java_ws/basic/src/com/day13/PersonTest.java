package com.day13;

import java.util.Scanner;

class Person{
	//1.�������
	private String name;
	private int age;
	private String tel;
	
	//2.������
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
	
	//4.�޼���
	
	public void showInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("��ȭ��ȣ : " + tel + "\n");
	}
}

public class PersonTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�, ����, ��ȭ��ȣ�� �Է��ϼ���");
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String tel =sc.nextLine();
		
		Person p = new Person(name, age, tel);
		p.showInfo();
		
		p.setName("��浿");
		p.setAge(25);
		p.setTel("010-1234-5678");
		
		System.out.println("�̸��� : " + p.getName());
		System.out.println("���̴� : " + p.getAge());
		System.out.println("��ȭ��ȣ�� : " + p.getTel());
		
	
	}

}
