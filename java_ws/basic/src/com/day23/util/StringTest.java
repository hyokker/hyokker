package com.day23.util;

public class StringTest {

	public static void main(String[] args) {
		//String 클래스의 메서드
		/*
		 indexOf() - 특정 문자가 있는 위치를 찾는 메서드
		 			 해당 문자가 없으면 -1을 리턴!!!!
		 substring() - 문자열의 일부를 추출할 때 사용
		 */			//012345678901234567890123456789
		String str = "Hello Java, Hi Java!";
		char ch=str.charAt(4); // o
		System.out.println("ch= " + ch);
		
		int idx=str.indexOf("Java"); // 6
		System.out.println("앞 Java의 위치 : " + idx); 
		System.out.println("뒤 Java의 위치 : " + str.lastIndexOf("Java")); //15
		
		String sub = str.substring(6,10);// 6<=x<10, Java
		System.out.println("sub = "+ sub);
		System.out.println(str.substring(15));//Java!, 15부터 끝까지
		
		String s = "www.nate.com";
		if(s.startsWith("www")) {
			System.out.println("www로 시작함");
		}if(s.endsWith(".com")){
			System.out.println(".com으로 끝남");
			
		}
		
					//01234567890123456789
		String email="hong@gmail.com";
		if(email.indexOf("@")!= -1 && email.indexOf(".")!= -1
				&& email.indexOf("@")< email.indexOf(".")) {
			System.out.println("이메일 규칙이 올바르다");
		}else {
		System.out.println("이메일 규칙이 올바ㅣ르지 않다");
		}
		
		//hong만 추출 , kim
		int idx1=email.indexOf("@");
		int idx2=email.indexOf(".");
		String email1=email.substring(0,idx1);
		
		//com , kr
		String email2=email.substring(idx1+1,idx2);
		
		//gmail , ez
		String email3=email.substring(idx2+1);

		System.out.println(email1);
		System.out.println(email2);
		System.out.println(email3);
		
		s = "     java spring!!     ";
		String s2=s.trim(); //앞 뒤 공백 제거
		System.out.println("s2=["+s2+"]");
		System.out.println("s2변수의 길이 :" + s2.length());
		
		int x=10, y=30;
		String val = String.valueOf(x);
		System.out.println(val+y);
		System.out.println(Integer.toString(x)+y);
	}

}
