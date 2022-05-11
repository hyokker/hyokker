package com.day23.util;

public class SplitTest {

	public static void main(String[] args) {
		String str="123456789";
		
		//String replace(char oldChar, char newChar)
		String s = str.replace('7', '칠');
		String s2 = str.replace("8", "여덟");
		System.out.println("str="+str);
		System.out.println("s="+s+", s2= "+s2+"\n");
		
		
		//특정 문자들을 경계로 하여 문자열을 여러 개의 토막으로 분리
		//String[] split(String regex)
		str="java,oracle,jsp,spring";
		String[] arr =str.split(",");
		for(String s3 : arr) {
			System.out.println(s3);
		}
		System.out.println("\n===============");
		str="html.css.js.jquery";
		//String[] split(String regex, int limit)
		String[] arr2=str.split("\\.", 3);
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
	
	}

}
