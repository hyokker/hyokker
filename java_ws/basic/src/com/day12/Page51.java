package com.day12;

import java.util.Scanner;

class nameCard{
	//1.멤버변수
	String name;
	String phoneNum;
	String address;
	String rank;
	
	//2.생성자
	nameCard(String p_name, String p_phoneNum, String p_address, String p_rank){
		name = p_name;
		phoneNum = p_phoneNum;
		address = p_address;
		rank = p_rank;
	}
	//3.메서드
		public void printNameCard() {
			System.out.println("이름 :" + name);
			System.out.println("전화번호 : "+ phoneNum);
			System.out.println("주소 : " + address);
			System.out.println("직급 : " + rank);
		}
}
public class Page51 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 전화번호, 주소, 직급을 입력하세요");
		String name = sc.nextLine();
		String phoneNum = sc.next();
		String address = sc.next();
		String rank = sc.next();
		
		nameCard nc= new nameCard(name, phoneNum, address, rank);
		
		nc.printNameCard();
		
	}

}
