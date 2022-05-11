package com.day24;

class Man{
	
}
public class HashCodeTest {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
	
		String str3 = "abc";
		String str4 = "abc";

		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		//str1, str2는 문자열의 내용이 같으므로 동일한 해시코드 값을 얻는다
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		//객체의 주소값 리턴 => str1, str2는 다른 해시코드 값을 얻는다

	
		/*
		 • String 클래스는 문자열의 내용이 같으면, 동일한 해시코드를 반환하도록
		   hashCode 메서드를 오버라이딩하였다
		 • System.identityHashCode(Object x) - Object 클래스의 hashCode 메서드처럼
		   객체의 주소값으로 해시코드를 생성
		   => 모든 객체에 대해 항상 다른 해시코드값을 반환함
		  
		 */
		
		Integer n1=10, n2=30;
		System.out.println("\n========Integer==========");
		System.out.println(n1.hashCode());
		System.out.println(n2.hashCode());
		System.out.println(System.identityHashCode(n1));
		System.out.println(System.identityHashCode(n2));
		
		Man m1=new Man();
		Man m2=new Man();
		System.out.println("\n========Man==========");
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(System.identityHashCode(m1));
		System.out.println(System.identityHashCode(m2));
		
	}
	

}
