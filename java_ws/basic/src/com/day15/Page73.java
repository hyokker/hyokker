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
//		System.out.println("공부한다");
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
//		System.out.println("논문을 쓴다");
//	}
//}
//public class Page73 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("이름, 나이, 학번, 전공을 입력하세요");
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
//		System.out.println("이름 :" + gd.getName());
//		System.out.println("나이 :" + gd.getAge());
//		System.out.println("학번 :" + gd.getIdNo());
//		System.out.println("전공 :" + gd.getMajor());
//		gd.writeThesis();
//	}
//
//}
