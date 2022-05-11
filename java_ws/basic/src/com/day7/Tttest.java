package com.day7;

import java.util.*;

public class Tttest {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		//FOR문 안에서 실행

		for(int i=3; i<10; i+=2){
			for(int j=1; j<=i; j++){
				System.out.println( i + " * " + j + " = " + i*j );						
			}
			System.out.println();
		} 
		
		Scanner sc = new Scanner(System.in);
		for(;;){
			System.out.println(" 두개의 정수를 입력하세요");
			int a = sc.nextInt( );
			int b = sc.nextInt( );{
				if(a==0 && b==0 )	 break;
				if(b==0) {
				System.out.println("제수가 0 이므로 연산을 생략합니다");
				continue;
				}
			}
			int num = a/b;
			int num2 = a%b;
			System.out.println( "몫 :"+ num + ", 나머지 :" + num2 );
		}
		}
}

	


