package com.day20;

import java.util.Scanner;

public class ThrowTest {

	public static void main(String[] args) {
		/*
		 throw
		 - �����ڰ� ���Ƿ� ���ܸ� ���� �߻���ų �� �ִ�
		 - �ڹ� ����ӽſ� ���� �νĵ� �� �ִ� ���ܻ�Ȳ�� �ƴ�����,
		   ���α׷��� ���ݿ� ���� �����ڰ� ������ ���ܻ�Ȳ�� ��� throw�� ���
		   
		 throw new Exception("���� �޽���");
		 
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("���� �Է�");
			int age=sc.nextInt();
			if(age<0 || age>150) {
				throw new Exception("���̴� ������� �ϰ�, 150���� �۾ƾ� �մϴ�!");
			}
			
			System.out.println("���� : " + age);
		}catch (Exception e) {
			System.out.println("���� : " + e.getMessage());
		}
		System.out.println("\n ��������~");
	}

}
