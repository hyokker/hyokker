package com.day23.util;

import java.util.Scanner;

public class Exam9 {

	public static void main(String[] args) {
		String str = "text.txt";
		int idx = str.lastIndexOf(".");
		String text = str.substring(0, idx);
		String txt = str.substring(idx+1);
		System.out.println("���ϸ� :" +text +", Ȯ���� :" + txt);
		
		
		String str2 = "�ȳ��ϼ���\r\n ���� ȫ�浿�Դϴ�.";
		String s = str2.replace("\r\n", "<br>");
		System.out.println(s);
		
		String str3 = "c:\\show\\upload\\test.txt";
		idx = str3.lastIndexOf(".");
		int idx2 = str3.lastIndexOf("\\");
		
		String folder = str3.substring(0, idx2);
		String name = str3.substring(idx2+1, idx);
		String file = str3.substring(idx+1);
		System.out.println("���� : " + folder);
		System.out.println("���ϸ� : " + name);
		System.out.println("Ȯ���� : " + file);
		
		System.out.println("\n===============");
		System.out.println("URL�ּҸ� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		String url=sc.nextLine();
		
		if(url.indexOf("http://www.mall.com")!= -1) {
			System.out.println("�ش� url �ּ� : " + url);
		}else {
			System.out.println("url �ּҰ� �������� �ʽ��ϴ�");
		}
		
		
		//
	      System.out.println("�ֹε�Ϲ�ȣ�� �Է��ϼ���(�����¾��� �Է�)");
	      String ssnNo = sc.nextLine();
	      //01234567890123
	      //9010121112222
	      String gender = ssnNo.substring(6,7);
	      String yy="", mm, dd, gender2="";
	      String year = ssnNo.substring(0,2);
	      
	      if(gender.equals("1") ||gender.equals("2")){
	         yy =  "19" + year;
	      }else if(gender.equals("3") ||gender.equals("4")){
	         yy = "20" + year;
	      }else{
	         System.out.println("�߸��Է�!!");
	         return;
	      }
	      
	      mm =ssnNo.substring(2,4);
	      dd = ssnNo.substring(4,6);
	      if(gender.equals("1") ||gender.equals("3")){
	         gender2 = "��";
	      }else if(gender.equals("2") ||gender.equals("4")){
	         gender2 = "��";
	      }else{
	         System.out.println("�߸��Է�!!");
	         return;
	      }

	      System.out.println(yy +"�� " + mm +  "�� " +dd +"��"+ ", "+ gender2);
	   }
}

	


