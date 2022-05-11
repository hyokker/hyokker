package com.day24;

public class StringbuilderTest1 {

	public static void main(String[] args) {

		/*
		 [1]String 
		 	-������ �Ұ����� ���ڿ��� ǥ���� ���� Ŭ����
		 	-���ڿ��� ���ϰų� �����ϸ� ���ο� String ��ü�� �����ǰ�,
		 	 ���� ��ü�� ������
		 [2]StringBuffer / StringBuilder
		 	-������ ������ ���ڿ��� ǥ���� ���� Ŭ����
		 	
		 */
		//public StringBuilder append(boolean b);
		
		StringBuilder sb = new StringBuilder("AB");
		sb.append(25);
		sb.append('Y').append(true);
		System.out.println(sb);
		
		sb.insert(2, false);
		sb.insert(sb.length(), 'Z');
		System.out.println(sb);
	}

}
