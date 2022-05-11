package com.day15;

import java.util.Scanner;

public class Student{
	private String name;
	private String idNo;
	
	Student(String name, String idNo) {
		this.name=name;
		this.idNo=idNo;
	}
	
	
	public void showInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("�й� : " + idNo);
	}
	
}
  class StudentLoop {
	private static Scanner sc = new Scanner(System.in);
	 private static Student[] s = new Student[100];
	 private static int index = 0;
	 
	 public static void showMenu() {
	 System.out.println("1.���� 2.��ü�л� ��ȸ 3.���� ����");
	 }
	 
	 public static void inputData() {
		 
		 
		 System.out.println("�̸�, �й��� �Է��ϼ���");
		 sc.nextLine();
		 String name = sc.nextLine();
		 String idNo = sc.nextLine();
		 s[index++]=new Student(name, idNo);
		 
	 }
	 
	 public static void showData() {
		 System.out.println("��ü�л� ��ȸ");
			for(int i=0;i<index;i++) s[i].showInfo();
	 }
	public static void main(String[] args) {
		
		for(;;) {
			showMenu();
			String n= sc.nextLine();
			
			if(n.equals("1")) {
				inputData();
				
			}else if(n.equals("2")) {
				showData();
			
			}else if(n.equals("3")) {
				System.out.println("�����մϴ�"); break;
			}else {
				System.out.println("�߸��Է�"); continue;
			}
				
			}
			
		}
		
	}
