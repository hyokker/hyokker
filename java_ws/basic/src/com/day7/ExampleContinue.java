package com.day7;

import java.util.*;
public class ExampleContinue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		for(;;) {
			System.out.println("�ΰ��� ������ �Է��ϼ��� (������/���� ������ �Է�)");
			int a = sc.nextInt();
			int b = sc.nextInt();{
				if(a==0 && b==0) break;
				if(b==0) {
					System.out.println("������ 0�̹Ƿ� ������ �����մϴ�");
					continue;
				}
			}
			
			int num = a%b;
			int num2 = a/b;
			System.out.println("�� : "+ num2 + " ������ : "+ num);
		}
	
	}

}
