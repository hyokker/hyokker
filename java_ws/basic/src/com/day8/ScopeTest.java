package com.day8;

import java.util.Scanner;

public class ScopeTest {

	public static void main(String[] args) {
		/*
		 지역변수
		 -메서드나 {} 블럭에서 선언된 변수
		 
		 [1]메서드에서 선언된 경우
		 해당 메서드가 시작될 때 생성
		 해당 메서드를 빠져나갈 때 사라짐
		 
		 [2]{}블럭에서 선언된 경우
		 {}블럭이 시작될 때 생성
		 {}블럭을 빠져나갈 때 사라짐 
		 */
		//[1]
		int res=getSum(100);
		
		//[2]
		int n=50;
		res=getSum(n);
		
		//[3]
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");		
		int count = sc.nextInt();
		n=getSum(count);
		
		System.out.println("합 ="+res);
	}//main 메서드

	
	public static int getSum(int cnt) { //cnt => 매개변수 : getSum()이 종료되면 소멸
		int sum=0; //지역변수 : getSum()이 종료되면 소멸
		
		for(int i=1;i<cnt;i++) {	//i=> 지역변수 - 블럭변수 for문을 벗어나면 소멸
			sum+=i;
		}
		
		return sum;
	}
}
