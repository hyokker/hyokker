package com.day21;

import java.util.Scanner;

/*
 ����� ���� ���� Ŭ���� �����
 Exception�� ��ӹް�, super(message) �̿��Ͽ� Exception �����ڿ� �޼����� �Ѱ��ָ� �ȴ�
 
 public Exception(String message)
 */

class AgeInputException extends Exception{
	AgeInputException() {
		super("��ȿ���� ���� �����Դϴ�!");
	}
}
public class UserExTest {
	public static int readAge() throws AgeInputException{
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�!");
		int age=sc.nextInt();
		if(age<0|| age>150) {
			throw new AgeInputException();
		}
		
		return age;
	}
	public static void main(String[] args) {
		try {
			int age=readAge();
			System.out.println("���̴� " + age + "��");
		}catch(AgeInputException e) {
			System.out.println(e.getMessage());
		}
	}

}
