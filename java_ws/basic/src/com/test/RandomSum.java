package com.test;

import java.util.Scanner;

public class RandomSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("난수의 갯수를 입력하세요");
		int ran=sc.nextInt();
		int sum=0;
		for(int i=0;i<ran;i++) {
			sum+=(int)((Math.random()*45)+1);
		}
		System.out.println("난수의 개수 :" + ran);
		System.out.println("1~45 사이의 난수"+ran+"개의 합계" +sum);
	}

}
