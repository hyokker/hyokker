package com.day6;

public class ForGugudan {

	public static void main(String[] args) {
		// ��ø for
		for(int dan=2;dan<10;dan++) {
			for(int j=1;j<=9;j++) {
				System.out.println(dan + " * " + j + " = "+ dan*j);
			}//���� for
			System.out.println("\n");
		}//�ٱ� for
		
		for(int i=1;i<=9;i++) {
			for(int dan=2;dan<=9;dan++) {
				System.out.print(dan + " * " + i + " = " + dan*i+ "\t");
			}
			System.out.println("\t");
		}

	}
	
}
