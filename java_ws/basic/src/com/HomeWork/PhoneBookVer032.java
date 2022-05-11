package com.HomeWork;

/*
 * 전화번호 관리 프로그램
 * Version 0.3
 */

import java.util.Scanner;

class PhoneBookVer032{
	private static Scanner sc=new Scanner(System.in);
	private static PhoneInfo[] infoStorage = new PhoneInfo[100];
	private static int curCnt;

	public static void showMenu(){
		System.out.println("선택하세요...");
		System.out.println("1. 데이터 입력(저장)");
		System.out.println("2. 전체 데이터 조회");
		System.out.println("3. 데이터 검색");
		System.out.println("4. 데이터 삭제");
		System.out.println("5. 프로그램 종료");
		System.out.print("선택: ");
	}
	
	public static void inputData(){
		if (curCnt==100){
			System.out.println("\n더 이상 데이터를 입력할 수 없습니다!!\n");
			return;
		}

		System.out.println("\n데이터 입력을 시작합니다");
		System.out.print("이름: ");
		String name=sc.nextLine();
		System.out.print("전화번호: ");
		String phone=sc.nextLine();
		System.out.print("생년월일: ");
		String birth=sc.nextLine();
		
		PhoneInfo info=new PhoneInfo(name, phone, birth);
		infoStorage[curCnt++]=info;

		System.out.println("데이터 입력이 완료되었습니다\n");
	}
	
	public static void printAllData(){
		if (curCnt==0)	{
			System.out.println("데이터가 존재하지 않습니다.\n\n");
			return;
		}

		System.out.println("\n--------------전체 데이터 조회------------------");
		for (int i=0;i<curCnt ;i++ ){
			infoStorage[i].showPhoneInfo();
		}

		System.out.println("-------------------------------------------------\n");
	}

	public static void searchData(){
		System.out.println("\n데이터 검색을 시작합니다");
		System.out.print("이름: ");
		String name=sc.nextLine();
		
		boolean isExist=false;
		for (int i=0;i<curCnt ;i++ ){
			PhoneInfo curInfo=infoStorage[i];
			if(name.equals(curInfo.getName())){
				isExist=true;
				curInfo.showPhoneInfo();
				//infoStorage[i].showPhoneInfo();
				System.out.println("데이터 검색이 완료되었습니다\n");
				break;
			}
		}//for

		if (!isExist){
			System.out.println("해당 데이터는 존재하지 않습니다\n");
		}
	}

	public static void deleteData(){
		System.out.println("\n데이터 삭제를 시작합니다");
		System.out.print("이름: ");
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

				System.out.println("데이터 삭제가 완료되었습니다\n");
			}
		}//for
			
		if (idx<0){
			System.out.println("해당 데이터는 존재하지 않습니다\n");
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
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못 선택하였습니다. 다시 선택하세요\n");
					continue;
			}
		}//while
	}
}