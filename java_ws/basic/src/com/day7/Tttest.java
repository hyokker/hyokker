package com.day7;

import java.util.*;

public class Tttest {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		//FOR�� �ȿ��� ����

		for(int i=3; i<10; i+=2){
			for(int j=1; j<=i; j++){
				System.out.println( i + " * " + j + " = " + i*j );						
			}
			System.out.println();
		} 
		
		Scanner sc = new Scanner(System.in);
		for(;;){
			System.out.println(" �ΰ��� ������ �Է��ϼ���");
			int a = sc.nextInt( );
			int b = sc.nextInt( );{
				if(a==0 && b==0 )	 break;
				if(b==0) {
				System.out.println("������ 0 �̹Ƿ� ������ �����մϴ�");
				continue;
				}
			}
			int num = a/b;
			int num2 = a%b;
			System.out.println( "�� :"+ num + ", ������ :" + num2 );
		}
		}
}

	


