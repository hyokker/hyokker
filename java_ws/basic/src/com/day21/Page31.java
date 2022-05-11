package com.day21;

import java.util.Scanner;

public class Page31 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호를 입력하세요!!");
		try {
			String perNo=sc.nextLine();
			if(perNo.length()!=13) {
				throw new Exception("주민번호는 13자리여야 합니다!");
			}
			System.out.println("주민번호 :" + perNo);
		}catch(Exception e) {
			System.out.println("예외 : " + e.getMessage());
			System.out.println(e.getMessage()+e);
		}
		System.out.println("프로그램이 정상적으로 종료되었습니다!");
		
		
		
		
		
		
		System.out.println("\n숫자를 두개 입력하세요");
		try {
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			if(n2==0) {
				throw new Exception("제수가 0이 되면 안됩니다!");				
			}
			int res=n1%n2;
			System.out.println(n1+"%"+n2+"="+res);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}
