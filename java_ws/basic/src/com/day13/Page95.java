package com.day13;

import java.util.Scanner;

class PhoneInfo2{
	String name;
	String phone;
	String birth;
	
	PhoneInfo2(String name,String phone, String birth){
		this.name=name;
		this.phone=phone;
		this.birth=birth;
	}
	PhoneInfo2(String name,String phone){
		this.name=name;
		this.phone=phone;
	}
	
	public void showInfo() {
		System.out.println("name : " + name);
		System.out.println("phone : " + phone);
		if(birth != null)System.out.println("birth : " + birth);
	}
}
public class Page95 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("선택하세요..");
			System.out.println("1.데이터 입력");
			System.out.println("2.프로그램 종료");
			int num = sc.nextInt();
			if(num==2) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			System.out.println("선택 : " + num);
			System.out.print("이름 :");
			String name = sc.next();
			System.out.print("전화번호 : ");
			String phone = sc.next();
			System.out.print("생년월일 : ");
			String birth = sc.next();
			
			System.out.println("\n=====입력된 정보 출력=====");
			
			PhoneInfo2 p2 = new PhoneInfo2(name, phone, birth);
			
			p2.showInfo();
			
			
			
		}
		
	}

}
