package com.day12;

import java.util.Scanner;

class nameCard{
	//1.�������
	String name;
	String phoneNum;
	String address;
	String rank;
	
	//2.������
	nameCard(String p_name, String p_phoneNum, String p_address, String p_rank){
		name = p_name;
		phoneNum = p_phoneNum;
		address = p_address;
		rank = p_rank;
	}
	//3.�޼���
		public void printNameCard() {
			System.out.println("�̸� :" + name);
			System.out.println("��ȭ��ȣ : "+ phoneNum);
			System.out.println("�ּ� : " + address);
			System.out.println("���� : " + rank);
		}
}
public class Page51 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�, ��ȭ��ȣ, �ּ�, ������ �Է��ϼ���");
		String name = sc.nextLine();
		String phoneNum = sc.next();
		String address = sc.next();
		String rank = sc.next();
		
		nameCard nc= new nameCard(name, phoneNum, address, rank);
		
		nc.printNameCard();
		
	}

}
