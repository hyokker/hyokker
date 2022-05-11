package com.day14;

import java.util.Scanner;

class PhoneInfo{
		String name;
		String phone;
		String birth;
		


		PhoneInfo(String name,String phone, String birth){
			this.name=name;
			this.phone=phone;
			this.birth=birth;
		}
		PhoneInfo(String name,String phone){
			this.name=name;
			this.phone=phone;
		}
		PhoneInfo(String name) {
			this.name=name;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name=name;
		}
		public void showInfo() {
			System.out.println("name : " + name);
			if(phone != null&&!phone.isEmpty())System.out.println("phone : " + phone);
			if(birth != null&&!birth.isEmpty())System.out.println("birth : " + birth);
		}
}
