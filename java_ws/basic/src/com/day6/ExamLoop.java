package com.day6;

import java.util.Scanner;

public class ExamLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 사용자로부터 숫자를 입력받아서, 짝수인지 홀수인지 출력
		// 단 무한루프 안에서 처리, 그만할지 여부를 입력받아 그만하겠다고 하면 탈출
		
		for(;;) {
			System.out.println("숫자를 입력하세요");
			int num = sc.nextInt();
			
			String result = "";
			if(num%2==1) {
				result = "홀수입니다";
			}else if(num%2==0){
				result = "짝수 입니다.";
			}else {
				result = "잘못 입력!";
			}
			System.out.println(result);
			
			System.out.println("그만하려면 q/Q");
			sc.nextLine();
			String quit = sc.nextLine(); // enter 값으로 인해서 nextLine
			
			if(quit.equalsIgnoreCase("Q"))break;
		}
	}
}
