package com.day24;

import java.text.DecimalFormat;

public class DecimalTest {

	public static void main(String[] args) {
		//DecimalFormat - ���ڸ� ����ȭ �ϴµ� ����
		//public final String format(double number) : ���� => ����ȭ�� ���ڿ��� 
		
		double num = 1234567.89512;
		DecimalFormat df = new DecimalFormat("#,###.##");
		String str = df.format(num);
		System.out.println("str = " + str); // 1,234,567.9
		
		DecimalFormat df2 = new DecimalFormat("#,###.00");
		str = df2.format(num);
		System.out.println("str =" + str); // 1,234,567.90

		num = 123456.723456;
		DecimalFormat df3 = new DecimalFormat("#,###");
		str = df3.format(num);
		System.out.println("str =" + str); //123,457
		
		
		
	}

}
