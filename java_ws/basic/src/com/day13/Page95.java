package com.day13;

import java.util.Scanner;

class PhoneInfo2{
	String name;
	String phone;
	String birth;
	
	PhoneInfo2(String name,String phone, String birth){
		this.name=name;
		this.phone=phone;
		this.birth=birth;
	}
	PhoneInfo2(String name,String phone){
		this.name=name;
		this.phone=phone;
	}
	
	public void showInfo() {
		System.out.println("name : " + name);
		System.out.println("phone : " + phone);
		if(birth != null)System.out.println("birth : " + birth);
	}
}
public class Page95 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("�����ϼ���..");
			System.out.println("1.������ �Է�");
			System.out.println("2.���α׷� ����");
			int num = sc.nextInt();
			if(num==2) {
				System.out.println("���α׷��� �����մϴ�");
				break;
			}
			System.out.println("���� : " + num);
			System.out.print("�̸� :");
			String name = sc.next();
			System.out.print("��ȭ��ȣ : ");
			String phone = sc.next();
			System.out.print("������� : ");
			String birth = sc.next();
			
			System.out.println("\n=====�Էµ� ���� ���=====");
			
			PhoneInfo2 p2 = new PhoneInfo2(name, phone, birth);
			
			p2.showInfo();
			
			
			
		}
		
	}

}
