package com.day17;

import java.util.Scanner;



 class Manager {
	private final int MAX_COUNT=100; //final (���)
	private Scanner sc = new Scanner(System.in);
	
	private Shape2[] shArr = new Shape2[MAX_COUNT];// ������ �迭
	private int idx = 0; // �迭�� �ε���

	
	public  void menu() { //����ڿ��� �Է¹��� ����
		System.out.println("1.�� 2.�簢�� 3.����� ������ ��ȸ 4.����");
	}
	
	public  void findRadiusArea() { // ���� ����
		if(idx==MAX_COUNT) {
			System.out.println("�����͸� ������ �� �����ϴ�");
			return;
		}
		
		System.out.println("�������Է�");
		int r=sc.nextInt();
		
		shArr[idx++] = new Circle2(r);
	}
	
	public  void findRectArea() { // �簢���� ����
		if(idx==MAX_COUNT) {
			System.out.println("�����͸� ������ �� �����ϴ�"); return;
		}
		System.out.println("����,���� �Է�");
		int w=sc.nextInt();
		int h=sc.nextInt();
		
		shArr[idx++] = new Rect(w,h);
	}
	public  void showTotal() { // ������ ������ ��ȸ
		if(idx==0) {
			System.out.println("��ȸ�� �����Ͱ� �����ϴ�"); 
			return;
		} 
		System.out.println("----����----");
		
		for(int i=0;i<idx;i++) {
			double area=shArr[i].findArea();
			System.out.println(shArr[i].kind()+"���� : " + area);
		}
		System.out.println();
		
	}
}

public class ManagerTest {
	public static void main(String[] args) {
		Manager m = new Manager();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			m.menu();
			int type=sc.nextInt();
			
			switch(type) {
				case 1:
					m.findRadiusArea();
					break;
				case 2:
					m.findRectArea();
					
					break;
				case 3:
					m.showTotal();
					break;
				case 4:
					System.out.println("������!");
					return;
				default:
						System.out.println("�߸��Է�\n");
						continue;
			}
		
		}//while
		
	}

}


