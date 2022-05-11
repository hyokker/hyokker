package com.day20.sample;

import java.util.Scanner;

public class PdBuyerMain {

	public static void main(String[] args) {
		Buyer b =new Buyer(1000);
		
		//������ 200�� TV����
		b.buy(new TV(200));
		
		b.showInfo();
		//������ 150�� computer����
		Product p = new Computer(150);
		b.buy(p);
	
		b.summary();
		
		Buyer b2= new Buyer(1000);
		Scanner sc = new Scanner(System.in);
		PdManager manager = new PdManager();
		while(true) {
			System.out.println("1. ��ǰ ���� 2. ���ų��� ��ȸ 3.����");
			int type=sc.nextInt();
			
			switch(type) {
			case 1 :
				manager.inputPd(b2);
				break;
			case 2 :
				manager.showPd(b2);
				break;
			case 3 :
				System.out.println("�����մϴ�");
				System.exit(0);
			default :
				System.out.println("�߸� �Է�!\n");
				continue;
			}
			
		}
	}
}

class PdManager{
	Scanner sc = new Scanner(System.in);
	public void inputPd(Buyer b) {
		System.out.println("������ ��ǰ ���� 1.TV 2.Computer");
		int kind=sc.nextInt();
		
		if(kind!=1 && kind!=2) {
			System.out.println("������ ��ǰ�� �ٽ� �����ϼ���");
			return;
		}
		System.out.println("��ǰ ���� �Է�!");
		int price= sc.nextInt();
		
		Product p = null;
		if(kind==1) {
			p=new TV(price);
		}else if(kind==2) {
			p=new Computer(price);
		}
		b.buy(p);
		b.showInfo();
	}

	public void showPd(Buyer b) {
		b.summary();
	}
}

//System.out.println("1. ��ǰ ���� 2. ���ų��� ��ȸ 3.����");
//int num=sc.nextInt();
//if(num==1) {
//	System.out.println("������ ��ǰ�� �����ϼ��� <1.TV 2.Computer>");
//	int type=sc.nextInt();
//	if(type==1) {
//	System.out.println("��ǰ ������ �Է��ϼ���");
//	int price=sc.nextInt();
//	Product p2 = new TV(price);
//	b2.buy(p);
//	b2.showInfo();
//	}else if(type==2) {
//		System.out.println("��ǰ ������ �Է��ϼ���");
//	int price=sc.nextInt();
//	Product p2 = new Computer(price);
//	b.buy(p);
//	b.showInfo();
//	}
//	
//}else if(num==2) {
//	b.summary();
//	
//}else if(num==3) {
//	System.out.println("���� �մϴ�");
//	return;
//}
//
//}
