package com.day24;

public class StringTest {

	public static void main(String[] args) {
		/*
		 StringŬ������ �ν��Ͻ��� ��� ������ �ν��Ͻ�
		 
		 ���ڿ��� ������ ��쿡�� �ϳ��� String �ν��Ͻ��� �����ؼ� �����Ѵ�.
		 */
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Java";
		
		if(str1==str2) { //������������ ==�� �ּҺ�
			System.out.println("str1, str2�� ���� �ּ� => ���� �ν��Ͻ� ����");
		}else {
			System.out.println("str1, str2�� �ٸ� �ν��Ͻ� ����");
		}
		
		if(str2==str3) { //������������ ==�� �ּҺ�
			System.out.println("str2, str3�� ���� �ּ� => ���� �ν��Ͻ� ����");
		}else {
			System.out.println("str2, str3�� �ٸ� �ν��Ͻ� ����");
		}
		
		String str4 = new String("Hello");
		String str5 = new String("Hello");
	
		if(str4==str5) {
			System.out.println("str4, str5 �� ���� �ν��Ͻ� ����");
		}else {
			System.out.println("str4, str5 �� �ٸ� �ν��Ͻ� ����");
		}
	
		if(str1==str5) {
			System.out.println("str1, str5 �� ���� �ν��Ͻ� ����");
		}else {
			System.out.println("str1, str5 �� �ٸ� �ν��Ͻ� ����");
		}
	}
}
