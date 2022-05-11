package com.day13;

import java.util.Scanner;

class Programmer{
	private String name;
	private String language;
	private int career;
	
	/*
	 this
	 - �ڱ��ڽ��� ����Ű�� this (�ڽ��� ����� ����Ű�� this => this.�������)
	 - �ν��Ͻ� �ڽ��� ����Ű�� ��������
	 - �ν��Ͻ��� �ּҰ� �����
	 - Ŭ������ �������� �� ���, ��ü ���� �� ����ϴ� ���� �ƴ�
	 - ��ü�� �����ϱ� �� �ܰ��� �� �ּҸ� this�� �ϰ�, �Ҵ�Ǵ� ����
	   this���� �Ҵ�� �޸��� �ּҰ�(������)�� �Ѱ���
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
		System.out.println("���α׷����� �մϴ�");
	}
}

public class Example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�, ���߾��, ���߰���� �Է��ϼ���");
		String n = sc.next();
		String l = sc.next();
		int c = sc.nextInt();
		
		Programmer p = new Programmer();
		p.setName(n);
		p.setLanguage(l);
		p.setCareer(c);
		
		
		System.out.println("�̸� :"+p.getName());
		System.out.println("���߾�� :"+p.getLanguage());
		System.out.println("���߰��  :"+p.getCareer()+"��");
		p.work();
		
	}

}
