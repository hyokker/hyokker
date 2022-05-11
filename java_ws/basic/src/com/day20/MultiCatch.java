package com.day20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {

	public static void main(String[] args) {
		/*
		 ���� catch��
		 - try������ ���� ���� ���ܰ� �߻��� �� ���� ����
		 �߻������� ��� ���ܿ� ���� �������� catch���� �����ϰ�
		 �߻��� ���ܿ� ���� ���� �ٸ��� ó����

		 
		 catch�� - �ڽĿ��� �θ� ������ �;���
		 */
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("�����Է�!");
			int num=sc.nextInt();
			int res = 100/num;
			System.out.println(res);
		}catch(ArithmeticException e) {
			System.out.println("0���� ������ ������!"+e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println("�������� �Է��ϼ���!"+e );
		}catch(Exception e ) {
			e.printStackTrace();
		}
		
	}

}
