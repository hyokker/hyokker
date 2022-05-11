package com.day14;

public class ArrayClassTest {

	public static void main(String[] args) {
		/*
		 1. int 배열에 정수 3개 넣고 출력(for, 확장 for) - 다 따로  
		 
		 2.String 배열에 점심메뉴 4개 넣고, 출력 
		 */
		int[] arr;
		arr = new int [3];
		arr[0]=1;
		arr[1]=10;
		arr[2]=100;
		
		System.out.println("기본 for문 사용");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("\n확장 for 문 사용");
		
		for(int n : arr) {
			System.out.println(n);
		}
		
		
		System.out.println("\n기본 for문 사용");
		String[] str;
		str = new String[4];
		str[0]="김치찌개";
		str[1]="된장찌개";
		str[2]="순두부찌개";
		str[3]="부대찌개";
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		System.out.println("\n확장 for 문 사용");
		for(String n : str) {
			System.out.println(n);
		}
		
		//
		
		//변수 - 데이터 한 개를 저장하기 위한 저장소(메모리 공간)
		//배열 - 데이터 여러 개를 저장하기 위한 저장소
		int a = 10;
		String s = "java";
		Account acc = new Account("001-100-1000",10000); //객체 생성
		Account acc2;
		acc2 = new Account("003-200-5000", 20000);
		
		acc.display(); //참조변수.메서드()호출
		//배열에 값 넣기
		Account[] accArr = new Account[3];
		accArr[0]= new Account("001-100-2001", 100000);
		accArr[1]= new Account("001-100-3001", 200000);
		Account acc3 = new Account("001-100-4001", 300000);
		accArr[2]= acc3; //acc3 : 참조변수, accArr[2]라는 배열요소도 참조변수(주소가 들어감)
	
		/*	int 배열에는 int 를 넣는다
	  		String 배열에는 String을 넣는다
	  		
	  		[1]Account 배열에는 Account를 넣는다
			=> ? new 로 객체생성해서 넣는다
		 	[2] for문안에서 참조변수.메서드() 호출
		 */ 

		/*
		accArr[0].display();
		accArr[1].display();
		accArr[2].display();
		*/
		System.out.println("===================");
		for(int i=0;i<accArr.length;i++) {
			accArr[i].display();//참조변수.메서드() 호출
		}
		
		System.out.println("===================");
		System.out.println("\n확장 for문 사용");
		for(Account acc4 : accArr) {
			acc4.display();;
		}
	}	

}
