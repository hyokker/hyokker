package com.HomeWork;

import java.util.ArrayList;

/*
 * ��ȭ��ȣ ���� ���α׷�
 * Version 0.3
 * PhoneBookManager Ŭ���� �̿�
 */

import java.util.Scanner;

class PhoneBookManager{	
	private Scanner sc=new Scanner(System.in);
	ArrayList<PhoneInfo> list = new ArrayList<PhoneInfo>();
	
	
	public void inputData()	{
		System.out.println("\n������ �Է��� �����մϴ�..");
		System.out.println("1.�Ϲ�, 2.����, 3.ȸ��");
		System.out.print("����>>");
		int a = sc.nextInt();
		
		if(a==1) {
		sc.nextLine();
		System.out.print("�̸�: ");
		String name=sc.nextLine();
		System.out.print("��ȭ��ȣ: ");
		String phone=sc.nextLine();
	
		list.add(readFreindInfo(name,phone));
		System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�. \n");		
		
		}else if(a==2) {
			sc.nextLine();
			System.out.print("�̸�: ");
			String name=sc.nextLine();
			System.out.print("��ȭ��ȣ: ");
			String phone=sc.nextLine();
			System.out.print("���� :");
			String major=sc.nextLine();
			System.out.print("�й�<����> : ");
			int year= sc.nextInt();
		
			list.add(readUnivFreindInfo(name, phone, major, year));
			System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�. \n");	
		}else if(a==3) {
			sc.nextLine();
			System.out.print("�̸�: ");
			String name=sc.nextLine();
			System.out.print("��ȭ��ȣ: ");
			String phone=sc.nextLine();
			System.out.print("ȸ�� :");
			String company=sc.nextLine();
			list.add(readCompanyFreindInfo(name, phone, company));
			System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�. \n");
		}else {
			System.out.println("�߸��Է�");
		}
	}
	
	public void searchData(){
		System.out.println("\n������ �˻��� �����մϴ�..");
		
		System.out.print("�̸�: ");
		String name=sc.nextLine();
		if(list.isEmpty()) {
			System.out.println("�����Ͱ� �����ϴ�.");
			return;
		}
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equals(name)) {
				list.get(i).showPhoneInfo();
			}
		}//for
		System.out.println("������ �˻��� �Ϸ�Ǿ����ϴ�. \n");
	}
	
	public void deleteData(){
		System.out.println("\n������ ������ �����մϴ�..");
		
		System.out.print("�̸�: ");
		String name=sc.nextLine();
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equals(name)){
				list.remove(i);
			}
			System.out.println("������ ������ �Ϸ�Ǿ����ϴ�. \n");
		}
	}
	//��� ���
	public void queryAllData(){
		if (list.isEmpty()){
			System.out.println("�����Ͱ� �������� �ʽ��ϴ�.\n\n");
			return;
		}

		System.out.println("----------��ü ������ ��ȸ----------");
		for(int i=0; i<list.size(); i++)	{
			list.get(i).showPhoneInfo();
		}//for
		System.out.println("------------------------------------- \n");
	}

	public void showMenu(){
		System.out.println("�����ϼ���...");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ��ü ������ ��ȸ");
		System.out.println("3. ������ �˻�");
		System.out.println("4. ������ ����");
		System.out.println("5. ���α׷� ����");
		System.out.print("����: ");
	}
	public   PhoneInfo readFreindInfo(String name, String phoneNumber) {
		PhoneInfo pi = new PhoneInfo(name, phoneNumber);
		return pi;
	}
	public  PhoneInfo readUnivFreindInfo(String name, String phoneNumber,String major, int year) {
		PhoneInfo pi = new PhoneUnivInfo(name, phoneNumber, major, year);
		return pi;
	}
	public   PhoneInfo readCompanyFreindInfo(String name, String phoneNumber, String company) {
		PhoneInfo pi = new PhoneCompanyInfo(name, phoneNumber,company);
		return pi;
	}
}

class PhoneBookVer03{	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		PhoneBookManager manager=new PhoneBookManager();
		int choice=0;
		
		while(true)	{
			manager.showMenu();
			choice=sc.nextInt();
			sc.nextLine();	
			
			switch(choice){
				case 1:
					manager.inputData();
					break;
				case 2:
					manager.queryAllData();
					break;
				case 3:
					manager.searchData();
					break;
				case 4:
					manager.deleteData();
					break;				
				case 5:
					System.out.println("���α׷��� �����մϴ�.");
					return;
				default:
					System.out.println("�߸� �����Ͽ����ϴ�. �ٽ� �����ϼ���\n");
					continue;
			}
		}//while
	}//main
}