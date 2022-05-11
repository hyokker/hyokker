package com.day15;

import java.util.Scanner;

public class ExamStudent2 {
	private static Scanner sc = new Scanner(System.in);
	private static Student[] stArr = new Student[100];
	private static int index=0;
	
	public static void showMenu() {
		System.out.println("1.���� 2.��ü�л� ��ȸ 3.����  ����!");
	}
	
	public static void inputData() {
		System.out.println("�̸�, �й��� �Է��ϼ���");
		sc.nextLine();
		String name = sc.nextLine();
		String idNo = sc.nextLine();

		stArr[index++]=new Student(name, idNo);
		
		System.out.println();
	}
	
	public static void showData() {
		System.out.println("\n=====�л� ����Ʈ=======");
		for(int i=0;i<index;i++) {
			stArr[i].showInfo();
		}	
	}
	
	public static void main(String[] args) {
		while(true) {
			showMenu();
			int type=sc.nextInt();

			switch(type) {
				case 1:
					inputData();
					break;
				case 2:
					showData();	
					break;
				case 3:
					System.out.println("���α׷��� �����մϴ�!");
					//return;
					System.exit(0);	
				default:
					System.out.println("�߸� �Է��߾��!\n");
					continue;
			}//switch

		}//while

		/*
		 Student�迭 �����, 2�� ��� �ְ�
		 ��� �л��� ��¸޼��� ȣ�� (for, Ȯ�� for)
		 */
		
	}

}













