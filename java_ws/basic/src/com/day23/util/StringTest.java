package com.day23.util;

public class StringTest {

	public static void main(String[] args) {
		//String Ŭ������ �޼���
		/*
		 indexOf() - Ư�� ���ڰ� �ִ� ��ġ�� ã�� �޼���
		 			 �ش� ���ڰ� ������ -1�� ����!!!!
		 substring() - ���ڿ��� �Ϻθ� ������ �� ���
		 */			//012345678901234567890123456789
		String str = "Hello Java, Hi Java!";
		char ch=str.charAt(4); // o
		System.out.println("ch= " + ch);
		
		int idx=str.indexOf("Java"); // 6
		System.out.println("�� Java�� ��ġ : " + idx); 
		System.out.println("�� Java�� ��ġ : " + str.lastIndexOf("Java")); //15
		
		String sub = str.substring(6,10);// 6<=x<10, Java
		System.out.println("sub = "+ sub);
		System.out.println(str.substring(15));//Java!, 15���� ������
		
		String s = "www.nate.com";
		if(s.startsWith("www")) {
			System.out.println("www�� ������");
		}if(s.endsWith(".com")){
			System.out.println(".com���� ����");
			
		}
		
					//01234567890123456789
		String email="hong@gmail.com";
		if(email.indexOf("@")!= -1 && email.indexOf(".")!= -1
				&& email.indexOf("@")< email.indexOf(".")) {
			System.out.println("�̸��� ��Ģ�� �ùٸ���");
		}else {
		System.out.println("�̸��� ��Ģ�� �ù٤Ӹ��� �ʴ�");
		}
		
		//hong�� ���� , kim
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
		String s2=s.trim(); //�� �� ���� ����
		System.out.println("s2=["+s2+"]");
		System.out.println("s2������ ���� :" + s2.length());
		
		int x=10, y=30;
		String val = String.valueOf(x);
		System.out.println(val+y);
		System.out.println(Integer.toString(x)+y);
	}

}
