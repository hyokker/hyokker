package com.day8;

import java.util.Scanner;

public class Page30 {

	public static double Price(int a, int b) {
		double cost = 0.0;
		if (a >= 200) {
			cost = (double) b * 0.3;
		} else if (a >= 100) {
			cost = (double) b * 0.2;
		} else {
			cost = (double) b * 0.1;
		}
		return cost;
	}

	public static boolean type(String str) {//1234
		boolean check = true;
		
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				check = false;
			}
		}
	
		return check;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�Ǹ� ������ �Ǹ� �ݾ��� �Է��ϼ���");
		int cnt = sc.nextInt();
		int money = sc.nextInt();

		double price = Price(cnt, money);

		System.out.println("������ :" + price);

		System.out.println("=============\n");
	
		System.out.println("���� �Է��ϼ���");
		
		String str = sc.next();
		System.out.println(str);
		
		String result = "";
		boolean check = type(str);
		if(check) {
			result = "�����Դϴ�";
		}else {
			result = "���ڰ� �ƴմϴ�";
		}
		
		System.out.println(str+"��"+ result);

	}

}
