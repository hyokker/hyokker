package com.day24;

public class ConvertTest {

	public static void main(String[] args) {
		//[1] String�� StringBuilder��
		String str= "java";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		
		
		//[2] StringBuilder �� String ����
		StringBuilder sb2 = new StringBuilder("�ȳ��ϼ���");
		String s = sb2.toString();
		System.out.println(s);

	}

}
