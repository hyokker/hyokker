package com.day21;

import java.util.Scanner;

public class FlanallyTest {
	public static void main(String[] args) {
	/*
	 finally
	  	-예외 발생여부와 상관없이 반드시 실행되어야 하는 구문을 입력하는 곳
	 	-예외가 발생해도 호출되며, 그렇지 않아도 호출됨
	 	-예외 발생여부에 상관없이 최종적으로 해야 할 일을 지정하는 곳
	 	-사용했던 자원을 해제
	 try{
	 
	 }catch(Exception e){
	 
	 }finally{
	 
	 }
	 
	 
	 */
		
	Scanner sc = new Scanner(System.in);
	try {
		System.out.println("숫자 입력!");
		int n=sc.nextInt();
		int res=100/n;
		System.out.println(res);
	}catch(Exception e) {
		System.out.println("예외 :" + e.getMessage());
	}finally {
		System.out.println("반드시 실행됨!!!");
	}
	
	System.out.println("\n====next!=====");
	}
}

