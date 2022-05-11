package com.HomeWork;
/*
 * 전화번호 관리 프로그램
 * Version 0.2
 */

import java.util.Scanner;

class PhoneBookVer02{
	//static Scanner sc=new Scanner(System.in);
	
	public static void showMenu(){
		System.out.println("선택하세요...");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 프로그램 종료");
		System.out.print("선택: ");
	}
	
	public static void inputData(){
		Scanner sc=new Scanner(System.in);

		System.out.print("이름: ");
		String name=sc.nextLine();
		System.out.print("전화번호: ");
		String phone=sc.nextLine();
		System.out.print("생년월일: ");
		String birth=sc.nextLine();
		
		PhoneInfo info=new PhoneInfo(name, phone, birth);

		System.out.println("\n=======입력된 정보 출력========");
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
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못 선택하였습니다. 다시 선택하세요\n");
					continue;
			}
		}//while
	}
}