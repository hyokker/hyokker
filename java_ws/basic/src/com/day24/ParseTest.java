package com.day24;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ParseTest {

	public static void main(String[] args) {
		// public Date parse(String source) throws ParseException
		// - 문자열을 날짜로 변환
		
		//사용자가 입력한 날짜와 오늘 날짜 사이의 간격 구하기
		//=> 사용자가 입력한 문자열 형식의 날짜를 Date로 변환해야 함
		
		Scanner sc=new Scanner(System.in);
		System.out.println("오늘 이전 날짜를 입력하세요(2022-01-02)");
		String str = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date;
		try {
			date = sdf.parse(str);
			Date today = new Date();
			long diff = (today.getTime()- date.getTime())/1000;
			diff = diff/(24*60*60);
			System.out.println("두 날짜 사이의 간격 :"+ diff);	
		} catch (ParseException e) {
	
			e.printStackTrace();
		}
	}

}
