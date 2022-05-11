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
		System.out.println("판매 수량과 판매 금액을 입력하세요");
		int cnt = sc.nextInt();
		int money = sc.nextInt();

		double price = Price(cnt, money);

		System.out.println("성과급 :" + price);

		System.out.println("=============\n");
	
		System.out.println("값을 입력하세요");
		
		String str = sc.next();
		System.out.println(str);
		
		String result = "";
		boolean check = type(str);
		if(check) {
			result = "숫자입니다";
		}else {
			result = "숫자가 아닙니다";
		}
		
		System.out.println(str+"는"+ result);

	}

}
