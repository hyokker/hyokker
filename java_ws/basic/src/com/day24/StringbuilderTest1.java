package com.day24;

public class StringbuilderTest1 {

	public static void main(String[] args) {

		/*
		 [1]String 
		 	-변경이 불가능한 문자열의 표현을 위한 클래스
		 	-문자열을 더하거나 변경하면 새로운 String 객체가 생성되고,
		 	 기존 객체는 버려짐
		 [2]StringBuffer / StringBuilder
		 	-변경이 가능한 문자열의 표현을 위한 클래스
		 	
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
