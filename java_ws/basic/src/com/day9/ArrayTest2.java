package com.day9;

public class ArrayTest2 {

	public static void main(String[] args) {
		int[] score = {90,78,59,99,100,81,63,96};
		
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]);
		}

		
		System.out.println("\n========5점 가산 후 =======");
		int a=80;
		//a변수의 값에 5점 가산
		a+=5;
//		System.out.println(a);
		
		for(int i=0; i<score.length;i++ ) {
//			score[i]+=5;
//			if(score[i]>=100) {
//				score[i] = 100;
//		}
			if(score[i]<95) {
				score[i]+=5;
			}else {
				score[i]=100;
			}
			System.out.println(score[i]);
	}
	}
}
