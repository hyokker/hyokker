package com.day13;

import java.util.Scanner;

class Temporary{
	//1.�������
	private String name;
	private int time, pay;
	public Temporary(String name, int time, int pay){
		this.name=name;
		this.time=time;
		this.pay=pay;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
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
	
	public void  pay(){
		System.out.println("������� : �ӽ���");
		System.out.println("�̸� : " + name);
		System.out.println("�޿� :" + pay*time);
	}
}

public class Example90 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�, ���ѽð�, �ð��� �޿��� �Է��ϼ���");
		String name = sc.nextLine();
		int time = sc.nextInt();
		int pay = sc.nextInt();
		
		Temporary t = new Temporary(name, time, pay);
		
		t.pay();
		
		System.out.println("-------------------");
		t.setName("��浿");
		t.pay();
		
		System.out.println("������� : �ӽ��� ");
		System.out.println("�̸� : " + t.getName());
		System.out.println("�޿� : " + pay*time);
	}

}
