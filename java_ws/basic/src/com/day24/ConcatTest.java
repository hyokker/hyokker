package com.day24;

public class ConcatTest {

	public static void main(String[] args) {
		//concat() - 두 문자열 결합
		//String concat(String str)
		String str1 = "Happy";
		String str2 = " and ";
		String str3 = "Smile";
		String str4 = str1.concat(str2).concat(str3);
		//str4=str1+str2+str3
		//추가로 생성된 인스턴스의 수가 2개
		System.out.println(str4);
		
		if(str1.compareTo(str3)<0) {
			System.out.println("str1이 앞선다(더 작다)");
		}else {
			System.out.println("str3이 앞선다");	
		}
		
	}

}
