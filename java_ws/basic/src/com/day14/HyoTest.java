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
				System.out.println("������ �Է��� �����մϴ�..");
				sc.nextLine();
				System.out.print("�̸� : ");
				String name = sc.nextLine();
				System.out.print("��ȭ��ȣ : ");
				String phone = sc.nextLine();
				System.out.print("������� : ");
				String birth = sc.nextLine();
				System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�.");
				
				ph[index++] = new PhoneInfo(name, phone, birth);
					
			}else if(num==2){
				System.out.println("==========��ü ������ ��ȸ===========");
				for(int i=0;i<index;i++) {
					ph[i].showInfo();
				}
			}else if(num==3) {
				System.out.println("������ �˻��� �����մϴ�..");
				String name=sc.nextLine();
				for(int i=0;i<index;i++) {
					if(name.equals(ph[i].getName()));
					ph[i].showInfo();
				}
			}else if(num==4) {
				System.out.println("������ ������ �����մϴ�");
				sc.nextLine();
				System.out.print("�̸� : ");
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
				System.out.println("���α׷��� �����մϴ�"); break;
			}
			
		
		}
	}

}
