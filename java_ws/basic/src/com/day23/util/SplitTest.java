package com.day23.util;

public class SplitTest {

	public static void main(String[] args) {
		String str="123456789";
		
		//String replace(char oldChar, char newChar)
		String s = str.replace('7', 'ĥ');
		String s2 = str.replace("8", "����");
		System.out.println("str="+str);
		System.out.println("s="+s+", s2= "+s2+"\n");
		
		
		//Ư�� ���ڵ��� ���� �Ͽ� ���ڿ��� ���� ���� �丷���� �и�
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
