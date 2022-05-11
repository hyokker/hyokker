package com.day10;

public class Page49 {

	public static void main(String[] args) {
		int[][] num= new int[3][3];
		
		/*
		 	0	0	0
		 	1	1	1	
		 	2	2	2
		 	
		 
		 
		 */  
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				if(i==j) {
					num[i][j]=1;
				}
			System.out.print(num[i][j]+"\t");
			
			
			}System.out.println("");
		}
	}

}
