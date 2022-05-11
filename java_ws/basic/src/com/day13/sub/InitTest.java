package com.day13.sub;

/*
 멤버변수의 초기화 시기와 순서
 [1]클래스변수(static변수)의 초기화 시점
 - 해당 클래스가 메모리에 로딩될 때 단 한번 초기화됨
 
 
 [2]인스턴스 변수의 초기화 시점
 - 인스턴스가 생성될 때마다 각 인스턴스별로 초기화가 이루어짐
 
 클래스 변수의 초기화 순서
 -default값 => 명시적 초기화 => static 초기화 블럭
 
 인스턴스 변수의 초기화 순서
 -default값 => 명시적 초기화 => 생성자
 
 */

//static변수는 항상 인스턴스 변수보다 먼저 생성되고 초기화됨!!

class AAA{	
	static int cv=1; // 명시적 초기화
	int iv =1; // 명시적 초기화
	
	//static 초기화 블럭
	static {
		cv=2;
		System.out.println("static 초기화 블럭 호출 !" );
	}

	//생성자
	AAA(){
		iv=3;
		System.out.println("생성자 호출!!");
	}

}

//cv : 0 => 1 => 2
//iv : 0 => 1 => 3
public class InitTest {

	public static void main(String[] args) {
		System.out.println("AAA.cv=" + AAA.cv);
	
	
	AAA obj = new AAA();
	System.out.println("obj.iv = " + obj.iv);
	
	}

}
