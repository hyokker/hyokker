package com.day7;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		/*
		 do ~ while 문
		  - do에 있는 명령문을 선 실행 후 while 조건 비교
		  - 조건보다 명령이 먼저 온다.
		  -	조건이 거짓이더라도, 실행 구문을 최소한 한번은 수행
		  
		  do{
		  	명령문;
		  }while(조건식);
		  
		 */
//		int k=0;
//		do {
//			System.out.println(k);
//			
//			k++;
//		}while(k<3);
//		
//		k=1;
//		do {
//			System.out.println("k="+k);
//			
//			k++;
//		}while(k>5);
		
		//사용자로부터 입력받은 수의 합을 구하되, 0이 입력되면 실행을 중지
		//[1]do~while 이용
		Scanner sc = new Scanner(System.in);
		
		int num=0;
		int sum=0;
		
		do {
			System.out.println("숫자를 입력하세요. 0이되면 중지");
			num=sc.nextInt();
			sum+=num;
		}while(num!=0); //{}없으면 세미콜론 ; 으로 닫아야함
		System.out.println("\ndo~while 이용 입력된 숫자의 합"+ sum);
		
		//[2]무한루프이용
		 num=0;
		 sum=0;
		while(true) {
			System.out.println("숫자를 입력하세요. 0이되면 중지");
			num =sc.nextInt();
			if(num==0) break;
			
			sum+=num;
		}
			System.out.println("\nsum ="+ sum);
			//sc.close();
	}
}