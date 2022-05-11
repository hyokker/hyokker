package com.day7;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		/*
		 무한루프
		 
		 while(true){
		 	반복명령;
		 	
		 	if(조건) break;
		 }
		 */
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("정수 입력!(끝낼때는 0입력)");
			int n = sc.nextInt();
			
			if(n==0) break;
			//처음 입력받은 값을 가지고 빠질때는 break를 제일 먼저 쓰는게 좋음.
			
			String result = "";
			if(n>0) {
				result = "양수";
			}else {
				result = "음수";
			}
			
			System.out.println(result+"\n");
		}//while
	}

}
