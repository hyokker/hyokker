package com.day14;

import java.util.Scanner;

public class HyoTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		view v = new view();
		int index = 0;
		PhoneInfo[] ph= new PhoneInfo[100];
		for(;;) {
			v.showMenu();
			int num=sc.nextInt();
//			sc.nextLine();
			if(num==1) {
				System.out.println("데이터 입력을 시작합니다..");
				sc.nextLine();
				System.out.print("이름 : ");
				String name = sc.nextLine();
				System.out.print("전화번호 : ");
				String phone = sc.nextLine();
				System.out.print("생년월일 : ");
				String birth = sc.nextLine();
				System.out.println("데이터 입력이 완료되었습니다.");
				
				ph[index++] = new PhoneInfo(name, phone, birth);
					
			}else if(num==2){
				System.out.println("==========전체 데이터 조회===========");
				for(int i=0;i<index;i++) {
					ph[i].showInfo();
				}
			}else if(num==3) {
				System.out.println("데이터 검색을 시작합니다..");
				String name=sc.nextLine();
				for(int i=0;i<index;i++) {
					if(name.equals(ph[i].getName()));
					ph[i].showInfo();
				}
			}else if(num==4) {
				System.out.println("데이터 삭제를 시작합니다");
				sc.nextLine();
				System.out.print("이름 : ");
				String name=sc.nextLine();
				for(int i=0;i<index;i++) { //index 4
					if(name.equals(ph[i].getName())) {
						for(int j=i+1;j<index;j++) {
							ph[j-1]=ph[j];
						}
						--index;
					}
				}
				System.out.println(index);
			}else if(num==5){
				System.out.println("프로그램을 종료합니다"); break;
			}
			
		
		}
	}

}
