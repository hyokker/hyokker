package com.day21;

import java.util.Scanner;

public class FlanallyTest2 {
	public static boolean divider(int n1,int n2) {
		try {
			int result=n1/n2;
			System.out.println("������" + result);
			return true; //�߰��� return�� �ϴ��� finally������ ����ǰ���
							//�޼��带 ���������Ե�
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			return false;
		}finally {
			System.out.println("finally ���� ����!");
		}
	}
	public static void main(String[] args) {
	boolean divOk=divider(7,3);
	if(divOk) {
		System.out.println("���� ����\n");
	}else {
		System.out.println("���� ���� \n");
	}
	
	divOk=divider(7,0);
	if(divOk) {
		System.out.println("���� ����\n");
	}else {
		System.out.println("���� ���� \n");
	}
	}
}

