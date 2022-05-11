package com.day6;

import java.util.*;

public class Page117 {
	public static void main(String[] args) {
		System.out.println("값을 입력하세요");
		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();
		
		boolean check = true;
		//int sum = 0;
		for(int i=0;i<str.length();i++){
			System.out.print(str.charAt(i));
			if(Character.isDigit(str.charAt(i))){
			}else{
				check = false;
			}
		}
			if(check){
				System.out.println("은 숫자입니다");
			}else{
				System.out.println("숫자가아니다이");
			}
	}
}
/*
package com.day7;

import java.util.Scanner;

public class HwFor {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++)	{
			for(int j=1; j<=3; j++)	{
				System.out.print("*");
			}
			System.out.println();
		}//for

		System.out.println();
		
		for(int i=1; i<=5; i++)	{
			for(int j=1; j<=i; j++)	{
				System.out.print("*");
			}
			System.out.println();
		}//for
		
		System.out.println();

		for(int i=5; i>=1; i--){
			for(int j=1; j<=i; j++)	{
				System.out.print("*");
			}
			System.out.println();
		}//for

		System.out.println();
		System.out.println("1부터 10까지의 합");
		for(int i=1; i<=10; i++){
			for(int j=1; j<=i; j++)	{
				System.out.print(j);
				if(j<i)	System.out.print("+");
			}
			System.out.println();
		}//for

		// 
		Scanner sc = new Scanner(System.in);
		System.out.println("\n4자리 이상의 숫자를 입력하세요");
		String str =  sc.nextLine();
		//String str = "12345";
		int sum = 0;
		for(int i=0; i < str.length(); i++) {
			sum += str.charAt(i) - '0';  //'1' => 49-48 =1
		}
		System.out.println("sum="+sum+"\n");

		System.out.println("4자리 이상의 숫자를 입력하세요");
		int num =  sc.nextInt();
		//int num = 12345;
		sum = 0;
		while(num > 0) {
			sum += num%10; //5+4+3+2+1
			num /= 10;//1234, 13,12,1
		}
		System.out.println("sum="+sum);

		System.out.println("\n값을 입력하세요");
		sc.nextLine();
		String value =  sc.nextLine();
		//String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		// 반복문과 charAt(int i)를 이용해서 문자열의 문자를 하나씩 읽어서 검사한다.

		for(int i=0; i < value.length() ;i++) {
			ch = value.charAt(i);
			if(!(ch>='0' && ch<='9')) {
				isNumber = false;
				break;
			}
		}
		
		if (isNumber) {
			System.out.println(value+"는 숫자입니다.");
		} else {
			System.out.println(value+"는 숫자가 아닙니다.");
		}


	}

}
*/