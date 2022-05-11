package com.day20;

import java.util.Scanner;

public class TryTest1 {

	public static void main(String[] args) {
		/*
		 ���� - ���α׷��� ���൵�߿� �߻��ϴ� ����ġ ���� ����
		 		ó������ ���� ���ܴ� ���α׷��� ������ �ߴܽ�Ű�� ����
		 		
		 
		 ����
		 	[1]	������ ����(compile error)
		 	[2]	���� ����(Runtime error) - ���α׷��� ������� ����ϴ� ���߿� �߻��Ǵ� ����
		 		1)����(error)
		 			- �޸� ����, ���ÿ����÷ο� ���� �ϴ� �߻��ϸ� 
		 			  ������ �� ���� �ɰ��� ����
		 		2)����(Exception)
		 			- �߻��ϴ��� ������ �� �ִ� ���� �� �ɰ��� ����

		 
		 ���� ó��
		 - ������ �߻��� ����� �ڵ带 �ۼ��ϴ� ��
		 - ���α׷� ���൵�� �߻��� ������ ó��, ������ ���ؼ� ������������ ���α׷���
		 ����Ǵ� ���� ������
		 
		 ����
		 - ������ ���Ḧ ����, �������� ������¸� ������ �� �ֵ��� �ϴ� ��

		 ����ó�� ����
		 try{
		 	���ܰ� �߻��� ���� �ڵ���� ��ġ
		 }catch(Exception e){
		 	���ܸ� ��� ���п� ���� ó���� �ϴ� �ڵ�
		 }
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("�� ���� ���� �Է�!");
			int n1=sc.nextInt(); //10
			int n2=sc.nextInt(); //0
			
			int result = n1/n2; //
			System.out.println("�� :" + result );
			System.out.println("������ :" + n1%n2);
		}catch(Exception e) {
			System.out.println("���� �߻���! : " + e.getMessage());
		}
		System.out.println("\n-----next!-----");
	}

}
