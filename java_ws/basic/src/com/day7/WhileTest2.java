package com.day7;

public class WhileTest2 {

	public static void main(String[] args) {
		/*
		 while(조건식){
		 	명령문;
		 }
		 
		 초기값; 
		 while(조건식){
		 	명령문;
		 	증감식;
		 }
		 
		 for(초기값;조건식;증감식){
		 	명령문;
		 }
		 */
		
		for(int i=0;i<3;i++) {
			System.out.println(i);
		}
		System.out.println("\n====while이용=====");
		
		int k=0;//초기식
		while (k<3) {//조건식은 주로 메소드를 이용한다.
			System.out.println("k ="+ k);//명령
			
			k++;//증감식
		}//while
		
		/*
		 4
		 3
		 2
		 1
		 */
		for(int i=4;i>0;i--) {
			System.out.println(i);
		}//for
		for(int i=1;i<10;i+=2) {
			System.out.println(i);
		}//for
		
		int j=4;
		while(j>0) {
			System.out.println("j = " +j);
			j--;
		}//while
		
		k=1;
		while(k<10) {
			System.out.println("k = "+ k);
			k+=2;
		}
	}

}
