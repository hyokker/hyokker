package com.day8;

import java.util.Scanner;

public class TTTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("������ �Է��ϼ���. �������� 0");
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a==0 && b==0) break;
			if (b==0) {
				System.out.println("������ 0 �̹Ƿ� �����մϴ�");
				continue;
			}
			System.out.println("�� : " + a/b +", ������:"+a%b);
		}

	}

}
