package com.day23.util;

import java.util.Date;

public class DateTest1 {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.toLocaleString());
		
		int year=d.getYear();
		System.out.println((year+1900)+"년");
		System.out.println((d.getMonth()+1)+"월"+ d.getDate()+"일");
		//=>월은 0~11 리턴
		System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
		System.out.println("요일 : " + d.getDay()); // 0:일요일
		
		//1970-01-01 0시 0분 0초를 기준으로 경과된 시간을 밀리초로 리턴
		long gap = d.getTime()/1000; //초 (1초는 1000밀리초)
		System.out.println("1970-01-01부터 오늘까지 경과한 시간(초):" + gap);
		
		gap=gap/(24*60*60); //일
		System.out.println("경과된 일수 : "+ gap + "일");
		}

}
