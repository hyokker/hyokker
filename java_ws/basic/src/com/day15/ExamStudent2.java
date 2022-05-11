package com.day15;

import java.util.Scanner;

public class ExamStudent2 {
	private static Scanner sc = new Scanner(System.in);
	private static Student[] stArr = new Student[100];
	private static int index=0;
	
	public static void showMenu() {
		System.out.println("1.저장 2.전체학생 조회 3.종료  선택!");
	}
	
	public static void inputData() {
		System.out.println("이름, 학번을 입력하세요");
		sc.nextLine();
		String name = sc.nextLine();
		String idNo = sc.nextLine();

		stArr[index++]=new Student(name, idNo);
		
		System.out.println();
	}
	
	public static void showData() {
		System.out.println("\n=====학생 리스트=======");
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
					System.out.println("프로그램을 종료합니다!");
					//return;
					System.exit(0);	
				default:
					System.out.println("잘못 입력했어요!\n");
					continue;
			}//switch

		}//while

		/*
		 Student배열 만들고, 2개 요소 넣고
		 모든 학생의 출력메서드 호출 (for, 확장 for)
		 */
		
	}

}













