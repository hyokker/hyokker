package com.day8;

import java.util.Scanner;

public class TTTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("정수를 입력하세요. 끝낼때는 0");
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a==0 && b==0) break;
			if (b==0) {
				System.out.println("제수가 0 이므로 생략합니다");
				continue;
			}
			System.out.println("몫 : " + a/b +", 나머지:"+a%b);
		}

	}

}
