package com.day24;

import java.util.StringTokenizer;

public class TokenizerTest1 {

	public static void main(String[] args) {
		/*
		 StringTokenizer
		 - 긴 문자열을 지정된 구분자를 기준으로 토큰이라는 여러 개의 작은 문자열로 잘라내는 데 사용
		 - 구분자로 단 하나의 문자 밖에 사용하지 못함
		 - split() 과 유사
		 */
		
		String str = "100,200,300,400";
		StringTokenizer st = new StringTokenizer(str,",");
		
		while(st.hasMoreElements()) {
			String token =st.nextToken();
			System.out.println(token);
		}
		
		System.out.println("\n");
		String[] arr=str.split(",");
		for(String s : arr) {
			System.out.println(s);
		}
		
		str="x=100*(200+300)/2";
		StringTokenizer st2 = new StringTokenizer(str,"+-*/=()");
		//StringTokenizer st2 = new StringTokenizer(str,"+-*/=()", true);
		//단 한 문자의 구분자만 사용할 수 있기 때문에 +-*/=() 전체가 하나의 구분자가 아니라
		//각각의 문자가 모두 구분자임
		
		//=> true : 구분자도 토큰으로 간주
		System.out.println("\n==============");
		while(st2.hasMoreElements()) {
			String token=st2.nextToken();
			System.out.println(token);
		}
		
	}

}
