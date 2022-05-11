package com.day6;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//무한루프 : 반복문안에서 break를 써서 반복문을 탈출
		/*for(;;) {
			반복할 내용
			
			if(조건식)
				break;
		}
		*/
		
		for(;;) {
			System.out.println("게임 중~~~");
			
			System.out.println("계속하시겠습니까?(Y/N)");
			String quit = sc.nextLine();
			
			if(quit.equalsIgnoreCase("N")){
				break;
			}//if
		}//for
		System.out.println("N을 선택하셨습니다");
	}
}