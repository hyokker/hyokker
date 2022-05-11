package com.day7;

import java.util.Scanner;

public class ExampleWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("입력할 정수의 갯수를 입력하세요");
		int cnt = sc.nextInt();
		int sum = 0;
		for(int i=0;i<cnt;i++) {
			System.out.println("정수를 입력하세요");
			int num =sc.nextInt();
			sum+=num;
			
		}
		double avg =(double)sum/cnt;
		System.out.println("\n입력된 정수의 전체 평균 :" + avg);
		
		
		//public static long round(double a)
		double d = 3.641592;
		long k = Math.round(d);
		System.out.println("d="+d+",k= "+k);
		
		//소수이하 3자리만 남기도록 반올림(소수이하 4째자리에서 반올림)
		d= Math.round(d*1000)/1000.0;// 3641.593
		System.out.println("반올림 후 d="+d);
		
		avg = Math.round(avg*100)/100.0;
		System.out.println("입력된 정수의 전체 평균" + avg);
	}
}
