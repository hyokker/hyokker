package com.day15;

import java.util.Scanner;

class Human{	
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

class Teacher extends Human{	
	private String subject;

	public String getSubject()	{
		return this.subject;
	}

	public void setSubject(String subject)	{
			this.subject = subject;			
	}

	public void work()	{
		System.out.println("����ġ�� ���� �մϴ�\n");
	}		
}//

class Programmer extends Human{	
	private int career;

	public int getCareer()	{
		return this.career;
	}

	public void setCareer(int career)	{
			this.career = career;			
	}

	public void work()	{									
		System.out.println("���α׷����� �մϴ�\n");
	}		
}//

public class ExamHuman {
	public  static void main(String[] args)	{
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�, ����, ������ �Է��ϼ���");		
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String subject = sc.nextLine();

		System.out.println();

		Teacher t = new Teacher();
		t.setName(name);
		t.setAge(age);
		t.setSubject(subject);
		System.out.println("�̸�:"+t.getName());
		System.out.println("����:"+t.getAge());
		System.out.println("����:"+t.getSubject());
		t.work();

		System.out.println("\n�̸�, ����, ���߰���� �Է��ϼ���");	
		name = sc.nextLine();
		age =sc.nextInt();
		int career =sc.nextInt();
		System.out.println();

		Programmer p = new Programmer();
		p.setName(name);
		p.setAge(age);
		p.setCareer(career);
		System.out.println("�̸�:"+p.getName());
		System.out.println("����:"+p.getAge());
		System.out.println("���߰��:"+p.getCareer());
		p.work();
	}
}
