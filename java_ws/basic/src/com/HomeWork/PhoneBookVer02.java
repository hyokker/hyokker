package com.HomeWork;
/*
 * ��ȭ��ȣ ���� ���α׷�
 * Version 0.2
 */

import java.util.Scanner;

class PhoneBookVer02{
	//static Scanner sc=new Scanner(System.in);
	
	public static void showMenu(){
		System.out.println("�����ϼ���...");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ���α׷� ����");
		System.out.print("����: ");
	}
	
	public static void inputData(){
		Scanner sc=new Scanner(System.in);

		System.out.print("�̸�: ");
		String name=sc.nextLine();
		System.out.print("��ȭ��ȣ: ");
		String phone=sc.nextLine();
		System.out.print("�������: ");
		String birth=sc.nextLine();
		
		PhoneInfo info=new PhoneInfo(name, phone, birth);

		System.out.println("\n=======�Էµ� ���� ���========");
		info.showPhoneInfo();
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int choice=0;
		
		while(true)	{
			showMenu();
			choice=sc.nextInt();
			sc.nextLine();	
			
			switch(choice){
				case 1:
					inputData();
					break;
				case 2:
					System.out.println("���α׷��� �����մϴ�.");
					return;
				default:
					System.out.println("�߸� �����Ͽ����ϴ�. �ٽ� �����ϼ���\n");
					continue;
			}
		}//while
	}
}