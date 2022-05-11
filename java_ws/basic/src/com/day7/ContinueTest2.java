package com.day7;

public class ContinueTest2 {

	public static void main(String[] args) {
		/*
		 이름 붙은 반복문
		 -여러 반복문이 중첩되어 있을 때
		  반복문 앞에 이름(Label)을 붙이고,
		  break문과 continue문에 이름(Label)을 지정해 줌으로써 하나 이상의 반복문을
		  벗어나거나 반복을 건너 뛸 수 있다.
		 */
		//바깥 for 문에 Loop1 이라는 이름을 붙였다
		Loop1: for(int i=2; i<=9; i++) {
			for(int j=1; j<=9 ; j++) {
				if(j==5) {
					break Loop1;
					//continue Loop1;
					//break;
					//continue;
				}
				
				System.out.println(i+"*"+j+"="+i*j);
		
			}//안쪽 for
			
			System.out.println();
		}//바깥 for
		

	}

}
