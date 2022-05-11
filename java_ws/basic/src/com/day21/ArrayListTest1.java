package com.day21;

import java.util.ArrayList;

public class ArrayListTest1 {

	public static void main(String[] args) {
		/*
		 제네릭스(Generics)
		 - jdk 5.0에 추가된 기능
		 - 컬렉션에 저장할 객체의 타입을 지정
		 - 꺼낼때는 자동으로 형변환 해줌
		 컬렉션클래스<저장할 객체의 타입> 변수명 = new 컬렉션 클래스<저장할 객체의 타입>();
		 
		 */
		/*
		• Boxing - 스택에 저장된 기본자료형 데이터를 힙영역의 참조형으로 변환하는것
			박싱을 해주는 클래스가 Wrapper 클래스이다
		• Unboxing - 참조형의 데이터를 기본형으로 변환
		
		 
		 */
		
		
		//Generics
		ArrayList<Integer> list = new ArrayList<Integer>(3);
		
		//데이터 저장
		list.add(10); //autoboxing : int => Integer
		list.add(30);
		list.add(77);
		System.out.println("size : " + list.size());
	
		//데이터 읽어오기
		for(int i=0;i<list.size();i++) {
			int n=list.get(i); // unboxing : Integer => int
			System.out.println(n);
		}
		
		//데이터 삭제
		list.remove(0);
		
		System.out.println("\n삭제 후");
		for(int n : list) {
			System.out.println(n);
		}//for
		
		
		//for문 안에서 초기화
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		for(int i=0;i<4;i++) {
			list2.add(i*2);
		}
		
		System.out.println("\n===============");
		for(int i=0;i<list2.size();i++) {
			int num= list2.get(i);
			System.out.println(num);
		}
	}

}
