package com.day24;

import java.text.DecimalFormat;

public class DecimalTest {

	public static void main(String[] args) {
		//DecimalFormat - 숫자를 형식화 하는데 사용됨
		//public final String format(double number) : 숫자 => 형식화된 문자열로 
		
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
