package com.day8;

import java.util.Scanner;

public class MethodExample4 {

	public static String personNum(int a) {
		String result = "";
		if( a==1 || a==3) {
			result ="남자입니다";
		}else {
			result ="여자입니다";
		}
		return result;
	}
	
	public static boolean isOdd(int a) {
		boolean check = true;
		if(a%2==0) {
			check = true;
		}else {
			check = false;
		}
		return check;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호의 성별 자리를 입력하세요. (1~4)");
		int str = sc.nextInt();
		String num = personNum(str);
		System.out.println("당신의 성별은"+ num);
		
		System.out.println("\n숫자를 입력하세요.");
		int a = sc.nextInt();
		
		boolean b = isOdd(a);
		String result ="";
		if(b==true) {
				result = "짝수입니다.";
			}else {
				result = "홀수입니다.";
			}
		
		System.out.println(result);
	}

}
