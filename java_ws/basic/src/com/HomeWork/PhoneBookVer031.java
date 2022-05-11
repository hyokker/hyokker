package com.HomeWork;

/*
 * ��ȭ��ȣ ���� ���α׷�
 * Version 0.3
 */

import java.util.Scanner;

class PhoneBookVer031{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	    PhoneInfo[] infoStorage = new PhoneInfo[100];
	    int curCnt=0;
		
		while(true)	{
			System.out.println("�����ϼ���...");
			System.out.println("1. ������ �Է�(����)");
			System.out.println("2. ��ü ������ ��ȸ");
			System.out.println("3. ������ �˻�");
			System.out.println("4. ������ ����");
			System.out.println("5. ���α׷� ����");
			System.out.print("����: ");

			int choice=sc.nextInt();
			sc.nextLine();	
			
			switch(choice)	{
				case 1:
					if (curCnt==100){
						System.out.println("\n�� �̻� �����͸� �Է��� �� �����ϴ�!!\n");
						break;
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

					break;
				case 2:
					if (curCnt==0){
						System.out.println("�����Ͱ� �������� �ʽ��ϴ�.\n\n");
						break;
					}

					System.out.println("\n--------------��ü ������ ��ȸ------------------");
					for (int i=0;i<curCnt ;i++ ){
						infoStorage[i].showPhoneInfo();
					}
					System.out.println("-------------------------------------------------\n");

					break;
				case 3:
					System.out.println("\n������ �˻��� �����մϴ�");
					System.out.print("�̸�: ");
					name=sc.nextLine();
					
					boolean isExist=false;
					for (int i=0;i<curCnt ;i++ ){
						PhoneInfo curInfo=infoStorage[i];
						if(name.equals(curInfo.getName())){
							isExist=true;
							infoStorage[i].showPhoneInfo();
							System.out.println("������ �˻��� �Ϸ�Ǿ����ϴ�\n");
							break;
						}
					}//for

					if (!isExist){
						System.out.println("�ش� �����ʹ� �������� �ʽ��ϴ�\n");
					}

					break;
				case 4:
					System.out.println("\n������ ������ �����մϴ�");
					System.out.print("�̸�: ");
					
					name=sc.nextLine();
							
					int idx=-1;
					for (int i=0;i<curCnt ;i++ ){
						PhoneInfo curInfo=infoStorage[i];
						if(name.equals(curInfo.getName())){
							idx=i;
							//curCnt=5
							//idx=2
							//2 3 4
							for (int j=idx;j<curCnt-1 ;j++ ){
								infoStorage[j]=infoStorage[j+1]; //j=2~3
							}//for			
							curCnt--; //4

							System.out.println("������ ������ �Ϸ�Ǿ����ϴ�\n");
						}
					}//for
						
					if (idx<0){
						System.out.println("�ش� �����ʹ� �������� �ʽ��ϴ�\n");
					}

					break;
				case 5:
					System.out.println("���α׷��� �����մϴ�.");
					return;
				default:
					System.out.println("�߸� �����Ͽ����ϴ�. �ٽ� �����ϼ���\n");
					continue;
			}//switch
		}//while

	}
}