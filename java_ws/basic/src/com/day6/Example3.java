package com.day6;

public class Example3 {

	public static void main(String[] args) {
		
		for(int i=1;i<100;i++) {
			if(i%7==0 || i%9==0) {
				if((i>=7 || i>=9)&&(i<=42)) {
					System.out.print(i+"\t");
				}
			}
	 /*		System.out.println("\n7의 배수이거나 9의 배수");		
		int cnt = 0;
		for(int i=1;i<100;i++){
			if(i%7==0 || i%9==0){
				System.out.print(i+"\t");
				cnt++; //1  2  3  4  5
				if (cnt % 5==0)	{
					System.out.println();						
				}
			}			
		}

		System.out.println("\n==============================\n");

		cnt = 0;
		for(int i=1;i<100;i++){
			if(i%7==0 || i%9==0){
				System.out.print(i+"\t");
				if(++cnt % 5 ==0) System.out.println();
			}
		}//for

*/
	}
	}
}
