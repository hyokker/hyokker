package com.day21;

import java.util.Scanner;

public class Page31 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ֹι�ȣ�� �Է��ϼ���!!");
		try {
			String perNo=sc.nextLine();
			if(perNo.length()!=13) {
				throw new Exception("�ֹι�ȣ�� 13�ڸ����� �մϴ�!");
			}
			System.out.println("�ֹι�ȣ :" + perNo);
		}catch(Exception e) {
			System.out.println("���� : " + e.getMessage());
			System.out.println(e.getMessage()+e);
		}
		System.out.println("���α׷��� ���������� ����Ǿ����ϴ�!");
		
		
		
		
		
		
		System.out.println("\n���ڸ� �ΰ� �Է��ϼ���");
		try {
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			if(n2==0) {
				throw new Exception("������ 0�� �Ǹ� �ȵ˴ϴ�!");				
			}
			int res=n1%n2;
			System.out.println(n1+"%"+n2+"="+res);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}
