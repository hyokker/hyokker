package com.day13;

import java.util.Scanner;

class Temporary{
	//1.멤버변수
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
		System.out.println("고용형태 : 임시직");
		System.out.println("이름 : " + name);
		System.out.println("급여 :" + pay*time);
	}
}

public class Example90 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 일한시간, 시간당 급여를 입력하세요");
		String name = sc.nextLine();
		int time = sc.nextInt();
		int pay = sc.nextInt();
		
		Temporary t = new Temporary(name, time, pay);
		
		t.pay();
		
		System.out.println("-------------------");
		t.setName("김길동");
		t.pay();
		
		System.out.println("고용형태 : 임시직 ");
		System.out.println("이름 : " + t.getName());
		System.out.println("급여 : " + pay*time);
	}

}
