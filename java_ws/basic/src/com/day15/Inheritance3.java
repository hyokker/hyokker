package com.day15;

class GrandFather{
	GrandFather(){
		System.out.println("GrandFather ������");	
	}
	
	public void showGrand() {
		System.out.println("�޼��� - GrandFather!");
	}
}
	

class Father extends GrandFather{
	Father(){
		System.out.println("Father ������");
	}
	
	public void showFather() {
		System.out.println("�޼��� - Father!");
	}
}

class Child extends Father{
	Child(){
		System.out.println("Chile ������");
	}
	public void showChild() {
		System.out.println("�޼��� - Child!");
	}
	
}
public class Inheritance3 {
	public static void main(String[] args) {
		Child ch = new Child();
		/*
		 �ܰ躰 ���
		 - ���� ������ �����ڰ� ���ʴ�� ȣ��Ǿ�����,���� �������� �ڽ��� ���� ȣ���
		 - �޸𸮴� �ֻ��� Ŭ�������� ���ʴ�� ������
		 */
		
		System.out.println();
		ch.showChild();
		ch.showGrand();
		ch.showFather();
	}
}
