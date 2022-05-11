package com.day13;

import java.util.Scanner;

class PhoneInfo3{
	String name;
	String phone;
	String birth;
	
	PhoneInfo3(String name,String phone, String birth){
		this.name=name;
		this.phone=phone;
		this.birth=birth;
	}
	PhoneInfo3(String name,String phone){
		this.name=name;
		this.phone=phone;
	}
	PhoneInfo3(String name) {
		this.name=name;
	}
	
	public void showInfo() {
		System.out.println("name : " + name);
		System.out.println("phone : " + phone);
		if(birth != null)System.out.println("birth : " + birth);
	}
}
public class Page94 {

	public static void main(String[] args) {
		PhoneInfo3 p = new PhoneInfo3("È«±æµ¿", "010-100-2000","92-01-17");
		
		PhoneInfo3 p2 = new PhoneInfo3("±è¿¬¾Æ", "010-300-4000");
		
		p.showInfo();
		
		p2.showInfo();
	}

}
