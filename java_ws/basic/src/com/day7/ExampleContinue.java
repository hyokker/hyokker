package com.day7;

import java.util.*;
public class ExampleContinue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		for(;;) {
			System.out.println("두개의 정수를 입력하세요 (피제수/제수 순으로 입력)");
			int a = sc.nextInt();
			int b = sc.nextInt();{
				if(a==0 && b==0) break;
				if(b==0) {
					System.out.println("제수가 0이므로 연산을 생략합니다");
					continue;
				}
			}
			
			int num = a%b;
			int num2 = a/b;
			System.out.println("몫 : "+ num2 + " 나머지 : "+ num);
		}
	
	}

}
