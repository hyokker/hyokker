package com.day7;

public class Practice {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=20; i++) {
			if(i%2!=0 && i%3!=0) {
				sum+=i;
				System.out.println("i = "+ i);
			}
		}
		System.out.println("2�� ����� �ƴϰ� 3�� ����� �ƴ� ���� �� :"+ sum);
		
		
		System.out.println("\n===========");
		sum = 0;
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				sum+=j;
//				System.out.print(j);
			}
		}
		System.out.println("sum :"+ sum);
		
		
		sum = 0;
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
			if(i+j==6) {
				System.out.println(i+ " + " + j + " = "+ sum);	
			}
			}
		}	
	}
}
