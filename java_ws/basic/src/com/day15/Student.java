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
		System.out.println("이름 : " + name);
		System.out.println("학번 : " + idNo);
	}
	
}
  class StudentLoop {
	private static Scanner sc = new Scanner(System.in);
	 private static Student[] s = new Student[100];
	 private static int index = 0;
	 
	 public static void showMenu() {
	 System.out.println("1.저장 2.전체학생 조회 3.종료 선택");
	 }
	 
	 public static void inputData() {
		 
		 
		 System.out.println("이름, 학번을 입력하세요");
		 sc.nextLine();
		 String name = sc.nextLine();
		 String idNo = sc.nextLine();
		 s[index++]=new Student(name, idNo);
		 
	 }
	 
	 public static void showData() {
		 System.out.println("전체학생 조회");
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
				System.out.println("종료합니다"); break;
			}else {
				System.out.println("잘못입력"); continue;
			}
				
			}
			
		}
		
	}
