package com.HomeWork;

import java.util.ArrayList;

/*
 * 전화번호 관리 프로그램
 * Version 0.3
 * PhoneBookManager 클래스 이용
 */

import java.util.Scanner;

class PhoneBookManager{	
	private Scanner sc=new Scanner(System.in);
	ArrayList<PhoneInfo> list = new ArrayList<PhoneInfo>();
	
	
	public void inputData()	{
		System.out.println("\n데이터 입력을 시작합니다..");
		System.out.println("1.일반, 2.대학, 3.회사");
		System.out.print("선택>>");
		int a = sc.nextInt();
		
		if(a==1) {
		sc.nextLine();
		System.out.print("이름: ");
		String name=sc.nextLine();
		System.out.print("전화번호: ");
		String phone=sc.nextLine();
	
		list.add(readFreindInfo(name,phone));
		System.out.println("데이터 입력이 완료되었습니다. \n");		
		
		}else if(a==2) {
			sc.nextLine();
			System.out.print("이름: ");
			String name=sc.nextLine();
			System.out.print("전화번호: ");
			String phone=sc.nextLine();
			System.out.print("전공 :");
			String major=sc.nextLine();
			System.out.print("학번<연도> : ");
			int year= sc.nextInt();
		
			list.add(readUnivFreindInfo(name, phone, major, year));
			System.out.println("데이터 입력이 완료되었습니다. \n");	
		}else if(a==3) {
			sc.nextLine();
			System.out.print("이름: ");
			String name=sc.nextLine();
			System.out.print("전화번호: ");
			String phone=sc.nextLine();
			System.out.print("회사 :");
			String company=sc.nextLine();
			list.add(readCompanyFreindInfo(name, phone, company));
			System.out.println("데이터 입력이 완료되었습니다. \n");
		}else {
			System.out.println("잘못입력");
		}
	}
	
	public void searchData(){
		System.out.println("\n데이터 검색을 시작합니다..");
		
		System.out.print("이름: ");
		String name=sc.nextLine();
		if(list.isEmpty()) {
			System.out.println("데이터가 없습니다.");
			return;
		}
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equals(name)) {
				list.get(i).showPhoneInfo();
			}
		}//for
		System.out.println("데이터 검색이 완료되었습니다. \n");
	}
	
	public void deleteData(){
		System.out.println("\n데이터 삭제를 시작합니다..");
		
		System.out.print("이름: ");
		String name=sc.nextLine();
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equals(name)){
				list.remove(i);
			}
			System.out.println("데이터 삭제가 완료되었습니다. \n");
		}
	}
	//모두 출력
	public void queryAllData(){
		if (list.isEmpty()){
			System.out.println("데이터가 존재하지 않습니다.\n\n");
			return;
		}

		System.out.println("----------전체 데이터 조회----------");
		for(int i=0; i<list.size(); i++)	{
			list.get(i).showPhoneInfo();
		}//for
		System.out.println("------------------------------------- \n");
	}

	public void showMenu(){
		System.out.println("선택하세요...");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 전체 데이터 조회");
		System.out.println("3. 데이터 검색");
		System.out.println("4. 데이터 삭제");
		System.out.println("5. 프로그램 종료");
		System.out.print("선택: ");
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
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못 선택하였습니다. 다시 선택하세요\n");
					continue;
			}
		}//while
	}//main
}