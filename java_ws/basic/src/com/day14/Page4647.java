package com.day14;


import java.util.Scanner;

class view{
		public void showMenu() {
		System.out.println("�����ϼ���");
		System.out.println("1.������ �Է�");
		System.out.println("2.��ü ������ ��ȸ");
		System.out.println("3.������ �˻�");
		System.out.println("4.������ ����");
		System.out.println("5.���α׷� ����");
		System.out.print("���� : ");
	}
	

}
public class Page4647 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		view v = new view();
		PhoneInfo[] pArr= new PhoneInfo[100];
		int index = 0;
		for(;;) {
			//�޴� �޼��� ȣ��
			v.showMenu();
			int select=sc.nextInt();
			sc.nextLine();
			if(select==5){
				System.out.println("���α׷��� �����մϴ�"); 
				break;
			}else if(select==1) {				
				System.out.println("������ �Է��� �����մϴ�..");
				System.out.print("�̸� :");
				String name = sc.nextLine();
				System.out.print("��ȭ��ȣ :");
				String number=sc.nextLine();
				System.out.print("������� :");
				String address=sc.nextLine();
				pArr[index++]= new PhoneInfo(name, number, address);
				System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�.");
			
			}else if(select==2) {
				System.out.println("------��ü ������ ��ȸ------");
				for(int i=0;i<index;i++) {
					pArr[i].showInfo();
				
				}
	
			}else if(select==3) {//����...
				System.out.println("������ �˻��� �����մϴ�..");
				System.out.print("�̸� : ");
				String name=sc.nextLine();
				for(int i=0;i<index;i++) {
					if(name.equals(pArr[i].getName())) {
						pArr[i].showInfo();
					}
					System.out.println("������ �˻��� �����մϴ� \n");
				}
				
			}else if(select==4) {//����....
				System.out.println("������ ������ �����մϴ�");
				System.out.print("�̸� :");
				String name=sc.nextLine();
				for(int i=0;i<index;i++) {
					if(name.equals(pArr[i].getName())) {
						for(int j=i+1;j<index;j++) {
						pArr[j-1]=pArr[j];  //
					}	
						//�����ϰ������ ��ȿ(index 2= i)
						// j= 2+1; j<7
						// j= 3+1; j<7
						// j= 4+1; j<7
						// j= 5+1; j<7
						//��ȿ�� ȿ�� ��ȿ ���� �ҹ� �ҹ̾��� �Ҹ� ��� 
						// 0 1 2 3 4 5 6 7 8 9 
						//       3 4 5 6 7 8
						//       
						--index;
				}
			}
				System.out.println("������ ������ �Ϸ�Ǿ����ϴ�");
		
			}//if
		}//for
	}
}

		
