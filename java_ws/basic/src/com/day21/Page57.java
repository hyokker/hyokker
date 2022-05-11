package com.day21;

import java.util.Scanner;



class idNoException extends Exception{
	idNoException(){
		super("주민번호 잘못입력!");
	}
}

public class Page57 {
	
	public static String readIdNo() throws idNoException {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요!");
		String idNo=sc.nextLine();
		if(idNo.length()!=14) {
			throw new idNoException();
		}
		return idNo;
	}

	public static void main(String[] args) {
		try {
			String idNo=readIdNo();
			System.out.println("주민번호 :" + idNo);
		}catch(idNoException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("프로그램을 종료합니다!!");
		}
		
	}

}
