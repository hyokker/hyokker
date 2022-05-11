package com.day8;

import java.util.Scanner;

public class MethodExample3 {

	public static String toLeapYear(int i) {
		String result = "";	
		if((i%400 == 0 || (i%4 == 0&&i%400!=0))) {
			result = "윤년 입니다.";
		}else{
			result = "평년 입니다.";
		} 
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력하세요");
		int year = sc.nextInt();
		
		String i =toLeapYear(year);
		
		System.out.println("입력하신 년도는 : "+ i);
	
	}

}
