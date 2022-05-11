package com.day20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {

	public static void main(String[] args) {
		/*
		 다중 catch문
		 - try문에서 여러 개의 예외가 발생할 수 있을 때는
		 발생가능한 모든 예외에 대해 여러개의 catch문을 나열하고
		 발생한 예외에 따라 각각 다르게 처리함

		 
		 catch문 - 자식에서 부모 순으로 와야함
		 */
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("숫자입력!");
			int num=sc.nextInt();
			int res = 100/num;
			System.out.println(res);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누지 마세요!"+e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println("정수값만 입력하세요!"+e );
		}catch(Exception e ) {
			e.printStackTrace();
		}
		
	}

}
