package com.day9;

import java.util.Scanner;

public class RandomTest1 {

	public static void main(String[] args) {
		//public static double random()
		//0.0 <= x < 1.0 범위의 임의의 실수를 리턴하는 메서드
		/*
		 1~100 사이의 임의의 정수 구하기
		[1] Math.random()*100
		100.0<= x <100.0
		[2] +1 (Math.randon()*100) + 1
		1.0 <= x < 101.0
		[3](int) => (int)(Math.random()*100+1)
		1<= x < 101
		
		규칙
		1) 발생시키려는 수의 개수를 각 변에 곱한다
		2) 시작값을 더한다
		3) int로 형변환한다.
		 
		 a ~ z 사이의 임의의 문자 구하기 (97 ~ 122)
		 => (char)(Math.random() * 26 + 'a')
		 */
		//1. 정답 구하기  - 1~ 100 사이의 임의의 정수 구한다.
		int answer = getAnswer();
		
		//2. 4번 반복 처리 for(int i=0,i<4;i++) 이용
		Scanner sc = new Scanner(System.in);
		System.out.println(answer);
		for(int i=0;i<4;i++) {
		//3. 사용자로부터 1~100사이의 숫자받기
			System.out.println("1~100사이의 숫자를 입력하세요");
			int num = sc.nextInt();
		//4. 정답과 비교해서 정답인지 큰지, 작은지 알려준다 (if 쓰기)
			String result = "";
			if(num==answer) {
				System.out.println("정답입니다.");
				break;
			}
			
			if(i==3) {
				result = "꽝! 다음기회에";
			}else {
				if(num>answer) {
				result = "너무 큽니다. 작은수를 입력하세요";
				}else {
				result = "조금 더 큰수를 입력하세요";
				}
			}
			System.out.println(result);
			}
		}//main
	
	public static int getAnswer() {
		int answer=(int)(Math.random()*100+1);
		return answer;
	}
}

