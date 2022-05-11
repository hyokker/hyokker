package com.day23.util;

import java.util.Scanner;

public class Exam9 {

	public static void main(String[] args) {
		String str = "text.txt";
		int idx = str.lastIndexOf(".");
		String text = str.substring(0, idx);
		String txt = str.substring(idx+1);
		System.out.println("파일명 :" +text +", 확장자 :" + txt);
		
		
		String str2 = "안녕하세요\r\n 저는 홍길동입니다.";
		String s = str2.replace("\r\n", "<br>");
		System.out.println(s);
		
		String str3 = "c:\\show\\upload\\test.txt";
		idx = str3.lastIndexOf(".");
		int idx2 = str3.lastIndexOf("\\");
		
		String folder = str3.substring(0, idx2);
		String name = str3.substring(idx2+1, idx);
		String file = str3.substring(idx+1);
		System.out.println("폴더 : " + folder);
		System.out.println("파일명 : " + name);
		System.out.println("확장자 : " + file);
		
		System.out.println("\n===============");
		System.out.println("URL주소를 입력하세요");
		Scanner sc = new Scanner(System.in);
		String url=sc.nextLine();
		
		if(url.indexOf("http://www.mall.com")!= -1) {
			System.out.println("해당 url 주소 : " + url);
		}else {
			System.out.println("url 주소가 적합하지 않습니다");
		}
		
		
		//
	      System.out.println("주민등록번호를 입력하세요(하이픈없이 입력)");
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
	         System.out.println("잘못입력!!");
	         return;
	      }
	      
	      mm =ssnNo.substring(2,4);
	      dd = ssnNo.substring(4,6);
	      if(gender.equals("1") ||gender.equals("3")){
	         gender2 = "남";
	      }else if(gender.equals("2") ||gender.equals("4")){
	         gender2 = "여";
	      }else{
	         System.out.println("잘못입력!!");
	         return;
	      }

	      System.out.println(yy +"년 " + mm +  "월 " +dd +"일"+ ", "+ gender2);
	   }
}

	


