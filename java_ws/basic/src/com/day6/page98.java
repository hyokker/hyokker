package com.day6;

public class page98 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) { 
				System.out.print("*");
			}
			System.out.println("");
		}
System.out.println("===========");
		
			for(int i=1;i<6;i++) {
			for(int j=6;j>i;j--) {
				System.out.print("*");
			}
			System.out.println("");
		
		}
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i ; j++) {
				System.out.print(j);
				if(i>j)System.out.print("+");
			}	
			System.out.println("");
		}
	}

}
