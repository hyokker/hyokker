package com.day7;

import java.util.Scanner;

public class WhileTest1 {
	public static void main(String[]args) {
		/*
		  while 문	- 반복횟수가 가변적인 처리에 적합
		  			- 특정 조건을 주고 그 조건이 만족 될 때까지 계속해서 반복시키는것
		  
		  while(반복 조건){
		  		반복명령;
		  }
		  
		  => 조건이 참인동안 반복처리
		 */
		//public boolean hasNext()
		Scanner sc = new Scanner("\n\n가나다 하나 둘 \n\n라\n\n");
		String str="";
		while(sc.hasNext()) {
			str=sc.nextLine();
			System.out.println("출력 : " + str);
		}//while
		
		str=sc.nextLine();
		System.out.println("while문 탈출 후 1 :" + str);
		
//		str=sc.nextLine();
//		System.out.println("while문 탈출 후 1 :" + str);
		
		
		System.out.println("\n\n======next()======");
		Scanner sc2 = new Scanner("\n\n가나다 하나 둘 \n\n라\n\n");
		str = "";
		while(sc2.hasNext()) {
			str=sc2.next(); //공백을 써야한다면nextLine
			System.out.println("출력 : " + str);
		}
		str=sc2.nextLine(); // nextLine은 enter 기준으로 읽어옴.
		System.out.println("while 탈출 후 : 1"+ str);
		str=sc2.nextLine();
		System.out.println("while 탈출 후 : 2"+ str);
//		str=sc2.nextLine();
//		System.out.println("while 탈출 후 : 3"+ str);
		
		System.out.println("\n\n======nextInt()======");
		sc2 = new Scanner("\n\n123 45 6\n\n78\n\n");
		str = "";
		while(sc2.hasNext()) {
			str=sc2.next(); //공백을 써야한다면nextLine
			System.out.println("출력 : " + str);
		}
		str=sc2.nextLine(); // nextLine은 enter 기준으로 읽어옴.
		System.out.println("while 탈출 후 : 1"+ str);
		str=sc2.nextLine();
		System.out.println("while 탈출 후 : 2"+ str);
		str=sc2.nextLine();
		System.out.println("while 탈출 후 : 3"+ str);
		}
}
