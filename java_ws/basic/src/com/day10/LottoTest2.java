package com.day10;

import java.util.Arrays;
import java.util.Scanner;

public class LottoTest2 {
	public static int[] getLotto() {
		//1. 요소가 6개인 배열 만들기
		int[] arr= new int[6];
		//2. 6번 반복처리
		for(int i=0;i<arr.length;i++) {
			
			//3. 1~45사이의 임의의 정수 구해서 배열에 넣기
			int temp=(int)(Math.random()*45+1);
			arr[i]=temp;
			
			//4.중복제거
			for(int k=0; k<i;k++) {
				if(arr[k]==arr[i]) {
					i--;
					break;
				}
			}//안쪽 for
		}//바깥 for
		
			//5.정렬
			Arrays.sort(arr);
			
			return arr;
	}
	public static void main(String[] args) {
		// int Lotto=(int)Math.random()*45 + 1
		// Arrays.Sort(int[] a)
		//1. 배열 만들기 2.6번 반복 3. random값 뽑아서 배열에 넣기 4.중복확인. 5.정렬 6.출력	
		Scanner sc = new Scanner(System.in);
			while(true) {		
				int[] arr	=getLotto();
				
				//6. 출력
				for(int n : arr) {
					System.out.print(n+" ");
				}//for
		
				System.out.println("\n"
						+ "그만 하려면 Q");
				String quit=sc.nextLine();
				if(quit.equalsIgnoreCase("Q"))
					break;
		}//while
	}

}
