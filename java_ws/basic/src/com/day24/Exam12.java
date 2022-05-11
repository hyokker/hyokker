package com.day24;

public class Exam12 {

	public static void main(String[] args) {
	    // 1.String 인스턴스를 하나 생성한 후 역순으로 다시 출력하기
	    //public StringBuilder reverse()
		
		String str="ABCDEFG";
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println(sb);
		
		
		String str2="990107-1112222";
		StringBuilder sb2 = new StringBuilder(str2);
		int a=sb2.lastIndexOf("-");
		
		if(a!= -1) {
			sb2.deleteCharAt(a);
		}
		System.out.println(sb2);
		
		System.out.println("\n========for문 사용=======");
		for(int i=0;i<sb2.length();i++) {
			if(sb2.charAt(i)==a) {
				sb2.deleteCharAt(i);
			}
		}
		System.out.println(sb2);
				
	}

}
