package com.day8;

import java.util.Scanner;

public class MethodExample3 {

	public static String toLeapYear(int i) {
		String result = "";	
		if((i%400 == 0 || (i%4 == 0&&i%400!=0))) {
			result = "���� �Դϴ�.";
		}else{
			result = "��� �Դϴ�.";
		} 
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�⵵�� �Է��ϼ���");
		int year = sc.nextInt();
		
		String i =toLeapYear(year);
		
		System.out.println("�Է��Ͻ� �⵵�� : "+ i);
	
	}

}
