package com.day15;

import java.util.Scanner;

class ManagerStudent{
	private Scanner sc = new Scanner(System.in);
	private Student[] stArr = new Student[2];
	private int index=0;
	
	public void showMenu() {
		System.out.println("1.���� 2.��ü�л� ��ȸ 3.����  ����!");
	}
	
	public void inputData() {
		if(index==2) {
			System.out.println("�����͸� �� �̻� ������ �� �����ϴ�.");
			return;
		}
		System.out.println("�̸�, �й��� �Է��ϼ���");
		String name = sc.nextLine();
		String idNo = sc.nextLine();

		stArr[index++]=new Student(name, idNo);
		
		System.out.println();
	}
	
	public void showData() {
		if(index==0) {
			System.out.println("�����Ͱ� �����ϴ�");
			return;
		}
		System.out.println("\n=====�л� ����Ʈ=======");
		for(int i=0;i<index;i++) {
			stArr[i].showInfo();
		}	
	}
}

public class ExamStudent3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		ManagerStudent manager = new ManagerStudent();
		
		while(true) {
			manager.showMenu();
			int type=sc.nextInt();

			switch(type) {
				case 1:
					manager.inputData();
					break;
				case 2:
					manager.showData();	
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













