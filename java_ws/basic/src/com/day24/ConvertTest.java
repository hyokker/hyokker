package com.day24;

public class ConvertTest {

	public static void main(String[] args) {
		//[1] String을 StringBuilder로
		String str= "java";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		
		
		//[2] StringBuilder 를 String 으로
		StringBuilder sb2 = new StringBuilder("안녕하세요");
		String s = sb2.toString();
		System.out.println(s);

	}

}
