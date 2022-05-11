package com.day10;

import java.util.Scanner;

public class Page48 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[5];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("잔고를 입력하세요");
			arr[i] = sc.nextDouble();
		}
		
		System.out.println("이자율을 입력하세요");
		double e = sc.nextDouble();
		double money = 0.0;
		for(int i=0;i<arr.length;i++) {
		//이자반영 = 원금 * 이자율(2.5% => 0.025)
			money=arr[i]+(arr[i]*(e/100));
			System.out.println("이자가 반영된 잔고 조회 :" + Math.round(money));
		}
	}

}
