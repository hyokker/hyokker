//package com.day15;
//
//import java.util.Scanner;
//
//class Person{
//	protected String name;
//	protected int age;
//	
//	public String getName() {
//		return this.name;
//	}
//	public void setName(String name) {
//		this.name=name;
//	}
//	
//	public int getAge() {
//		return this.age;
//	}
//	public void setAge(int age) {
//		this.age=age;
//	}
//}
//
//class Student3 extends Person{
//	private int idNo;
//	
//	public int getIdNo() {
//		return this.idNo;
//	}
//	public void setIdNo(int idNo) {
//		this.idNo=idNo;
//	}
//	
//	public void study() {
//		System.out.println("�����Ѵ�");
//	}
//}
//class Graduate extends Student3{
//	private String major;
//	
//	public String getMajor() {
//		return this.major;
//	}
//	public void setMajor(String major) {
//		this.major=major;
//	}
//	public void writeThesis() {
//		System.out.println("���� ����");
//	}
//}
//public class Page73 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("�̸�, ����, �й�, ������ �Է��ϼ���");
//		String name=sc.nextLine();
//		int age=sc.nextInt();
//		int idNo=sc.nextInt();
//		sc.nextLine();
//		String major=sc.nextLine();
//		
//		
//		Graduate gd = new Graduate();
//		
//		
//		gd.setName(name);
//		gd.setAge(age);
//		gd.setIdNo(idNo);
//		gd.setMajor(major);
//		System.out.println("�̸� :" + gd.getName());
//		System.out.println("���� :" + gd.getAge());
//		System.out.println("�й� :" + gd.getIdNo());
//		System.out.println("���� :" + gd.getMajor());
//		gd.writeThesis();
//	}
//
//}
