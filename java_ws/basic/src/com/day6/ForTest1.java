package com.day6;

public class ForTest1 {

	public static void main(String[] args) {
		for(int i=97;i<123;i++) {
			if(i<122) {
			System.out.print((char)i+", ");
		}else 
			System.out.println((char)i);
		}
		//중복을 최소화하게 코딩하는게 좋음
		
		for (int i=97;i<=122 ; i++ ){
			System.out.print((char)i);
			if(i !=122)
				System.out.print(", ");				
		}
		System.out.println();

		for(char ch='a';ch<='z'; ch++){
			System.out.print(ch);
			if(ch !='z')
				System.out.print(", ");		
		}
		System.out.println();

		char lowerCase = 'a';
		for (int i=1;i<=26 ; i++ ){
			System.out.print(lowerCase++);
			if(i<26)
				System.out.print(", ");			
		}
		System.out.println();
		
		for(char ch='a';ch<='z'; ch++){
			if(ch !='a') System.out.print(", ");	
			System.out.print(ch);
		}
	}
}
