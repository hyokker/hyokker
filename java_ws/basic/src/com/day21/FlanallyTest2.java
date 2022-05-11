package com.day21;

import java.util.Scanner;

public class FlanallyTest2 {
	public static boolean divider(int n1,int n2) {
		try {
			int result=n1/n2;
			System.out.println("나눗셈" + result);
			return true; //중간에 return을 하더라도 finally영역은 실행되고나서
							//메서드를 빠져나가게됨
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			return false;
		}finally {
			System.out.println("finally 영역 실행!");
		}
	}
	public static void main(String[] args) {
	boolean divOk=divider(7,3);
	if(divOk) {
		System.out.println("연산 성공\n");
	}else {
		System.out.println("연산 실패 \n");
	}
	
	divOk=divider(7,0);
	if(divOk) {
		System.out.println("연산 성공\n");
	}else {
		System.out.println("연산 실패 \n");
	}
	}
}

