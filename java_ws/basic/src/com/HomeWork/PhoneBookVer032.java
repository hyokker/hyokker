package com.HomeWork;

/*
 * ��ȭ��ȣ ���� ���α׷�
 * Version 0.3
 */

import java.util.Scanner;

class PhoneBookVer032{
	private static Scanner sc=new Scanner(System.in);
	private static PhoneInfo[] infoStorage = new PhoneInfo[100];
	private static int curCnt;

	public static void showMenu(){
		System.out.println("�����ϼ���...");
		System.out.println("1. ������ �Է�(����)");
		System.out.println("2. ��ü ������ ��ȸ");
		System.out.println("3. ������ �˻�");
		System.out.println("4. ������ ����");
		System.out.println("5. ���α׷� ����");
		System.out.print("����: ");
	}
	
	public static void inputData(){
		if (curCnt==100){
			System.out.println("\n�� �̻� �����͸� �Է��� �� �����ϴ�!!\n");
			return;
		}

		System.out.println("\n������ �Է��� �����մϴ�");
		System.out.print("�̸�: ");
		String name=sc.nextLine();
		System.out.print("��ȭ��ȣ: ");
		String phone=sc.nextLine();
		System.out.print("�������: ");
		String birth=sc.nextLine();
		
		PhoneInfo info=new PhoneInfo(name, phone, birth);
		infoStorage[curCnt++]=info;

		System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�\n");
	}
	
	public static void printAllData(){
		if (curCnt==0)	{
			System.out.println("�����Ͱ� �������� �ʽ��ϴ�.\n\n");
			return;
		}

		System.out.println("\n--------------��ü ������ ��ȸ------------------");
		for (int i=0;i<curCnt ;i++ ){
			infoStorage[i].showPhoneInfo();
		}

		System.out.println("-------------------------------------------------\n");
	}

	public static void searchData(){
		System.out.println("\n������ �˻��� �����մϴ�");
		System.out.print("�̸�: ");
		String name=sc.nextLine();
		
		boolean isExist=false;
		for (int i=0;i<curCnt ;i++ ){
			PhoneInfo curInfo=infoStorage[i];
			if(name.equals(curInfo.getName())){
				isExist=true;
				curInfo.showPhoneInfo();
				//infoStorage[i].showPhoneInfo();
				System.out.println("������ �˻��� �Ϸ�Ǿ����ϴ�\n");
				break;
			}
		}//for

		if (!isExist){
			System.out.println("�ش� �����ʹ� �������� �ʽ��ϴ�\n");
		}
	}

	public static void deleteData(){
		System.out.println("\n������ ������ �����մϴ�");
		System.out.print("�̸�: ");
		String name=sc.nextLine();
				
		int idx=-1;
		for (int i=0;i<curCnt ;i++ ){
			PhoneInfo curInfo=infoStorage[i];
			if(name.equals(curInfo.getName())){
				idx=i;
				for (int j=idx;j<curCnt-1 ;j++ ){
					infoStorage[j]=infoStorage[j+1];
				}//for			
				curCnt--;

				System.out.println("������ ������ �Ϸ�Ǿ����ϴ�\n");
			}
		}//for
			
		if (idx<0){
			System.out.println("�ش� �����ʹ� �������� �ʽ��ϴ�\n");
		}

	}

	public static void main(String[] args){
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
					printAllData();
					break;
				case 3:
					searchData();
					break;
				case 4:
					deleteData();
					break;
				case 5:
					System.out.println("���α׷��� �����մϴ�.");
					return;
				default:
					System.out.println("�߸� �����Ͽ����ϴ�. �ٽ� �����ϼ���\n");
					continue;
			}
		}//while
	}
}