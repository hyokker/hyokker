package com.day15;

import java.util.Scanner;

class ManagerStudent{
	private Scanner sc = new Scanner(System.in);
	private Student[] stArr = new Student[2];
	private int index=0;
	
	public void showMenu() {
		System.out.println("1.저장 2.전체학생 조회 3.종료  선택!");
	}
	
	public void inputData() {
		if(index==2) {
			System.out.println("데이터를 더 이상 저장할 수 없습니다.");
			return;
		}
		System.out.println("이름, 학번을 입력하세요");
		String name = sc.nextLine();
		String idNo = sc.nextLine();

		stArr[index++]=new Student(name, idNo);
		
		System.out.println();
	}
	
	public void showData() {
		if(index==0) {
			System.out.println("데이터가 없습니다");
			return;
		}
		System.out.println("\n=====학생 리스트=======");
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













