package com.day21;

import java.util.Scanner;

public class FlanallyTest {
	public static void main(String[] args) {
	/*
	 finally
	  	-���� �߻����ο� ������� �ݵ�� ����Ǿ�� �ϴ� ������ �Է��ϴ� ��
	 	-���ܰ� �߻��ص� ȣ��Ǹ�, �׷��� �ʾƵ� ȣ���
	 	-���� �߻����ο� ������� ���������� �ؾ� �� ���� �����ϴ� ��
	 	-����ߴ� �ڿ��� ����
	 try{
	 
	 }catch(Exception e){
	 
	 }finally{
	 
	 }
	 
	 
	 */
		
	Scanner sc = new Scanner(System.in);
	try {
		System.out.println("���� �Է�!");
		int n=sc.nextInt();
		int res=100/n;
		System.out.println(res);
	}catch(Exception e) {
		System.out.println("���� :" + e.getMessage());
	}finally {
		System.out.println("�ݵ�� �����!!!");
	}
	
	System.out.println("\n====next!=====");
	}
}

