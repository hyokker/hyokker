package com.day6;

import java.util.*;

public class Page117 {
	public static void main(String[] args) {
		System.out.println("���� �Է��ϼ���");
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
				System.out.println("�� �����Դϴ�");
			}else{
				System.out.println("���ڰ��ƴϴ���");
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
		System.out.println("1���� 10������ ��");
		for(int i=1; i<=10; i++){
			for(int j=1; j<=i; j++)	{
				System.out.print(j);
				if(j<i)	System.out.print("+");
			}
			System.out.println();
		}//for

		// 
		Scanner sc = new Scanner(System.in);
		System.out.println("\n4�ڸ� �̻��� ���ڸ� �Է��ϼ���");
		String str =  sc.nextLine();
		//String str = "12345";
		int sum = 0;
		for(int i=0; i < str.length(); i++) {
			sum += str.charAt(i) - '0';  //'1' => 49-48 =1
		}
		System.out.println("sum="+sum+"\n");

		System.out.println("4�ڸ� �̻��� ���ڸ� �Է��ϼ���");
		int num =  sc.nextInt();
		//int num = 12345;
		sum = 0;
		while(num > 0) {
			sum += num%10; //5+4+3+2+1
			num /= 10;//1234, 13,12,1
		}
		System.out.println("sum="+sum);

		System.out.println("\n���� �Է��ϼ���");
		sc.nextLine();
		String value =  sc.nextLine();
		//String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		// �ݺ����� charAt(int i)�� �̿��ؼ� ���ڿ��� ���ڸ� �ϳ��� �о �˻��Ѵ�.

		for(int i=0; i < value.length() ;i++) {
			ch = value.charAt(i);
			if(!(ch>='0' && ch<='9')) {
				isNumber = false;
				break;
			}
		}
		
		if (isNumber) {
			System.out.println(value+"�� �����Դϴ�.");
		} else {
			System.out.println(value+"�� ���ڰ� �ƴմϴ�.");
		}


	}

}
*/