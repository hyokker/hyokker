package com.day21;

import java.util.Scanner;



class idNoException extends Exception{
	idNoException(){
		super("�ֹι�ȣ �߸��Է�!");
	}
}

public class Page57 {
	
	public static String readIdNo() throws idNoException {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹι�ȣ�� �Է��ϼ���!");
		String idNo=sc.nextLine();
		if(idNo.length()!=14) {
			throw new idNoException();
		}
		return idNo;
	}

	public static void main(String[] args) {
		try {
			String idNo=readIdNo();
			System.out.println("�ֹι�ȣ :" + idNo);
		}catch(idNoException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("���α׷��� �����մϴ�!!");
		}
		
	}

}
