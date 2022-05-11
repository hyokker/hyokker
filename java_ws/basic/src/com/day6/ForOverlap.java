package com.day6;

public class ForOverlap {

	public static void main(String[] args) {
		//중첩 for => 바쁜 for 는 안쪽 for, 안바쁜 for는 바깥쪽 for
		
		for(int i=0;i<3;i++) {
			System.out.println("=========현재 i : "+ i);
			
			for(int j=0;j<2;j++) {
				System.out.println("현재 j : "+ j);
			}//안쪽 for
		}//바깥쪽 for 
	 //중첩 for문에서는 바쁜 것이 안쪽 for임.
	}

}
