package com.day13;

import java.util.Scanner;

class Programmer{
	private String name;
	private String language;
	private int career;
	
	/*
	 this
	 - 자기자신을 가리키는 this (자신의 멤버를 가리키는 this => this.멤버변수)
	 - 인스턴스 자신을 가리키는 참조변수
	 - 인스턴스의 주소가 저장됨
	 - 클래스를 디자인할 때 사용, 객체 생성 후 사용하는 것이 아님
	 - 객체를 생성하기 전 단계의 그 주소를 this라 하고, 할당되는 순간
	   this에게 할당된 메모리의 주소값(참조값)을 넘겨줌
	 */
	public Programmer(){
		
	}
	public Programmer(String name, String lang, int career){
		this.name=name;
		this.language=lang;
		this.career=career;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public int  getCareer() {
		return career;
	}
	
	public void setCareer(int career) {
		this.career = career;
	}
	
	public void work() {
		System.out.println("프로그래밍을 합니다");
	}
}

public class Example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 개발언어, 개발경력을 입력하세요");
		String n = sc.next();
		String l = sc.next();
		int c = sc.nextInt();
		
		Programmer p = new Programmer();
		p.setName(n);
		p.setLanguage(l);
		p.setCareer(c);
		
		
		System.out.println("이름 :"+p.getName());
		System.out.println("개발언어 :"+p.getLanguage());
		System.out.println("개발경력  :"+p.getCareer()+"년");
		p.work();
		
	}

}
