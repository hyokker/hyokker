package com.day8;

import java.util.Scanner;

public class ScopeTest {

	public static void main(String[] args) {
		/*
		 ��������
		 -�޼��峪 {} ������ ����� ����
		 
		 [1]�޼��忡�� ����� ���
		 �ش� �޼��尡 ���۵� �� ����
		 �ش� �޼��带 �������� �� �����
		 
		 [2]{}������ ����� ���
		 {}���� ���۵� �� ����
		 {}���� �������� �� ����� 
		 */
		//[1]
		int res=getSum(100);
		
		//[2]
		int n=50;
		res=getSum(n);
		
		//[3]
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�");		
		int count = sc.nextInt();
		n=getSum(count);
		
		System.out.println("�� ="+res);
	}//main �޼���

	
	public static int getSum(int cnt) { //cnt => �Ű����� : getSum()�� ����Ǹ� �Ҹ�
		int sum=0; //�������� : getSum()�� ����Ǹ� �Ҹ�
		
		for(int i=1;i<cnt;i++) {	//i=> �������� - ������ for���� ����� �Ҹ�
			sum+=i;
		}
		
		return sum;
	}
}
