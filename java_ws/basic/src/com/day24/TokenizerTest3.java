package com.day24;

import java.util.StringTokenizer;

public class TokenizerTest3 {

	public static void main(String[] args) {
		/*
		 • split() 는 빈 문자열도 토큰으로 인식하는 반면
		 • StringTokenizer 는 빈 문자열을 토큰으로 인식하지 않기 때문에 인식하는 토큰의
		 	개수가 서로 다름

		 */
		String str="100,,,200,300";
		
		String[] arr=str.split(",");
		int n=0;
		for(String s : arr) {
			System.out.print(s+"| ");
			n++;
		}
	
		System.out.println("개수 :" + n + "\n\n");
		
		StringTokenizer st = new StringTokenizer(str,",");
		n=0;
		while(st.hasMoreTokens()) {
			String s =st.nextToken();
			System.out.println(s+"|");
			n++;
		}
		System.out.println("개수 :" + n + "\n\n");
	}

}
