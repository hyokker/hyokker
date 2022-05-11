package com.day7;

public class ContinueTest1 {

	public static void main(String[] args) {
		/*
		  break - 반복문이나 switch 문의 case를 벗어날 때 사용
		  continue - 반복문의 나머지 뒷 부분을 무시하고, 반복문의 선두로 점프하여 다음 루트를 실행
		  			- 다음 반복위치로 이동.
		  			- 반복문의 반복을 한번 건너뛰고 다음 반복을 실행할 때 사용
		  			- 반복문 안에서만 사용 가능
		  return	- 메서드의 실행을 종료하고 호출원으로 복귀함
		 */
		
		for(int i=1;i<=10;i++) {
			if(i==5) continue;
			
			System.out.println("i = "+ i);
		}
		
		System.out.println("\n=============");
		
		for(int i=1; i<=10; i++) {
			if(i==5) break;
			
			System.out.println("i =" + i );
		}
		System.out.println("\n========중첩 for =======");
		
		for(int i=0; i<3 ;i++) {
			for(int j=0;j<3;j++) {
				if(j==1) break;
				System.out.println("i ="+ i + ", j ="+ j);
			}
		}
		System.out.println("\n=====================");
		
		for(int i=0; i<3 ;i++) {
			for(int j=0;j<3;j++) {
				if(j==1) continue;
				System.out.println("i ="+ i + ", j ="+ j);
			}
		}
	}		
}
