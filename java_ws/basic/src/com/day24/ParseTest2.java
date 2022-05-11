package com.day24;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ParseTest2 {

	public static void main(String[] args) {
		// public Date parse(String source) throws ParseException
		// - 문자열을 날짜로 변환
		
		//사용자가 입력한 날짜와 오늘 날짜 사이의 간격 구하기
		//=> 사용자가 입력한 문자열 형식의 날짜를 Date로 변환해야 함
		
		Scanner sc=new Scanner(System.in);
		System.out.println("날짜를 입력하세요(2022-01-02)");
		String str = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		long diff=0;
		Date date;
		try {
			date = sdf.parse(str);
			Date today = new Date();
			//Date today2 = null;
			if(date.getTime() >today.getTime()) { //미래날짜 입력한 경우
				//오늘날짜에서도 시간을 제거한다
				String s = sdf.format(today);
				System.out.println("today s = " + s);
				
				today=sdf.parse(s);
				diff=(date.getTime()-today.getTime())/1000;
			}else { // 과거 날짜 입력한 경우
				diff = (today.getTime()- date.getTime())/1000;
			}
			
			System.out.println("입력한 날짜 : " + date.toLocaleString());
			System.out.println("오늘 날짜  : " + today.toLocaleString());

			diff = diff/(24*60*60);
			System.out.println("두 날짜 사이의 간격 :"+ diff);	
		} catch (ParseException e) {
		
			e.printStackTrace();
		}
	}

}
