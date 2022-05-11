package com.day10;

import java.util.Scanner;

public class ArrayArgs {
	//배열을 매개변수로 받는 메서드
	//call by reference : 매개변수로 값이 넘어가는 것이 아니라, 주소가 넘어감
	//=> 같은 주소를 가리키므로, 같은 곳을 가리키게 됨
	//==> 메서드에서 매개변수의 값을 변경하면 main()에서도 변수의 값이 변경됨 (변경의 영향을 받음)
	public static double findAvg(int[] score) {
		//국,영,수 점수를 배열로 받아와서 평균 점수 출력하기
		int sum=0;
		for(int i=0;i<score.length;i++) {
			sum+=score[i]; //총점
		}
		
		double avg = (double)sum/score.length; 
		
		score[0]++; //
		
		return avg;
	}
	//call by value : 값을 매개변수로 넘김
	//메서드에서 매개변수의 값을 변경해도 main(메서드를 호출한곳)에서는 변경의 영향을 받지 않는다.
	public static int add(int a,int b) {
		int c=a+b;
		
		a++; // 11
		return c;
	}
	
	public static void main(String[] args) {
		int[] arr= {90,85,77};
		double avg=findAvg(arr);
		System.out.println("평균 : " + avg);

		int[] arr2 = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("국, 영, 수 점수 입력");
		
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		
		avg=findAvg(arr2);
		System.out.println("평균 :" + avg);
		
		//
		System.out.println("메서드에서 값 변경 후 arr2[0]"+arr2[0]);
		
		int n1=10, n2=30;
		int res = add(n1, n2);
		
		System.out.println("res =" + res +",메서드에서 값 변경 후 n1="+ n1);

	}

}
