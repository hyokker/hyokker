package com.day7;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		/*
		 ���ѷ���
		 
		 while(true){
		 	�ݺ����;
		 	
		 	if(����) break;
		 }
		 */
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("���� �Է�!(�������� 0�Է�)");
			int n = sc.nextInt();
			
			if(n==0) break;
			//ó�� �Է¹��� ���� ������ �������� break�� ���� ���� ���°� ����.
			
			String result = "";
			if(n>0) {
				result = "���";
			}else {
				result = "����";
			}
			
			System.out.println(result+"\n");
		}//while
	}

}
