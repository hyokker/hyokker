package com.day15;

import java.util.Scanner;

class Person3{	
	protected String name;
	protected int age;

	public void setName(String name){
			this.name = name;
	}

	public String getName(){
			return this.name;
	}

	public int getAge()	{
		return this.age;
	}

	public void setAge(int age)	{
			this.age = age;			
	}
}//

class Student3 extends Person3{	
	protected int sNo;
	
	public int getSNo()	{
		return this.sNo;
	}

	public void setSNo(int sNo)	{
		this.sNo = sNo;			
	}

	public void study()	{
		System.out.println("�����Ѵ�");
	}
}//

class Graduate extends Student3{	
	private String major;

	public String getMajor()	{
		return this.major;
	}

	public void setMajor(String major)	{
			this.major = major;			
	}

	public void writeThesis()	{
		System.out.println("������");
	}
}//

public class ExamGraduate {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�, ����, �й�, ������ �Է��ϼ���");
		
		String name = sc.nextLine();
		int age = sc.nextInt();
		int sNo =sc.nextInt();
		sc.nextLine();
		String major = sc.nextLine();

		System.out.println();

		Graduate s = new Graduate();
		s.setName(name);
		s.setAge(age);
		s.setSNo(sNo);
		s.setMajor(major);

		System.out.println("�̸�:"+s.getName());
		System.out.println("����:"+s.getAge());
		System.out.println("�й�:"+s.getSNo());
		System.out.println("����:"+s.getMajor());
		s.writeThesis();
	}
}
