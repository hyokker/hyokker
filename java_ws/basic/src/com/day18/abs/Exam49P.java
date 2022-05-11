package com.day18.abs;

import java.util.Scanner;

abstract class Employee{
	protected String name;
	
	Employee(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public abstract void findPay();
}

class Permanent extends Employee{
	protected int salary;
	
	Permanent(String name, int salary){
		super(name);
		this.salary=salary;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public void findPay() {		
		System.out.println("������� : �����");
		System.out.println("�̸� : " + name);
		System.out.println("�޿� :" + salary);
	}
}

class Temporary extends Employee{
	private int time,pay;
	
	Temporary(String name, int time,int pay) {
		super(name);
		this.time=time;
		this.pay=pay;
	}
	
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time=time;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay=pay;
	}
	
	public void findPay() {
		int p = time*pay;
		System.out.println("������� : �ӽ���");
		System.out.println("�̸� : " + name);
		System.out.println("�޿� : " + p);
	}
}
class SalesPerson extends Permanent{
	private int earnings;
	private  final double RATE=0.15;
	SalesPerson(String name, int salary, int earnings) {
		super(name,salary);
		this.earnings=earnings;
	}
	public int getEarnings() {
		return earnings;
	}
	public void setEarnings(int earnings) {
		this.earnings=earnings;
	}
	public void findPay() {
		int p = (int) (salary+(earnings*RATE));
		System.out.println("������� : �Ǹ��� ");
		System.out.println("�̸� :"+ name);
		System.out.println("�޿� :"+ p);
	}
	
}
public class Exam49P {

	public static void main(String[] args) {
		System.out.println("������� - �����<P>, �ӽ���<T>, �Ǹ���<S> �� �Է��ϼ���");
		Scanner sc= new Scanner(System.in);
		String type = sc.nextLine();
		Employee[] arr = new Employee[3];
		
		if(type.equalsIgnoreCase("P")) {
			System.out.println("�̸�, �⺻�޿��� �Է��ϼ���");
			String name=sc.nextLine();
			int pay=sc.nextInt();
			arr[0]=new Permanent(name, pay);
			arr[0].findPay();
		
		}else if(type.equalsIgnoreCase("T")) {
			System.out.println("�̸�, ���ѽð�, �ð��� �޿��� �Է��ϼ���");
			String name=sc.nextLine();
			int time=sc.nextInt();
			int pay=sc.nextInt();
			arr[1]=new Temporary(name, time, pay);
			arr[1].findPay();
		
		}else if(type.equalsIgnoreCase("S")) {
			System.out.println("�̸�, �⺻�޿�, �Ǹż����� �Է��ϼ���");
			String name=sc.nextLine();
			int pay=sc.nextInt();
			int earnings=sc.nextInt();
			arr[2]=new SalesPerson(name, pay, earnings);
			arr[2].findPay();
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			return;
		}
	}

}
