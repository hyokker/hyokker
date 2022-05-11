package com.day23.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Page18 {
	public static String showDate(Calendar cal) {
		return	cal.get(Calendar.YEAR)+"년"+ (cal.get(Calendar.MONTH)+1)+"월 "
					+ cal.get(Calendar.DATE) + "일";
		}
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance(); // 오늘날짜
		Calendar cal2 = Calendar.getInstance();// 생일날짜
		
		cal2.set(1993, 2, 25);
		//생일 이후 경과일//
		long gap = (cal.getTimeInMillis()-cal2.getTimeInMillis())/1000;
		gap=gap/(24*60*60);
		System.out.println("생일 <1993-03-25> 이후 경과일 수");
		System.out.println(gap+"일");

		//수료일까지 남은 날짜//
		Date d = new Date(); //오늘날짜
		Date d2 = new Date(2022-1900,6,19); //수료일
		
		
		gap = (d2.getTime()-d.getTime())/1000;
		gap = gap/(24*60*60);
		System.out.println("수료일까지 남은 일 수");
		System.out.println(gap);
		
		//오늘부터 10년전 날짜//
		Calendar cal3 = Calendar.getInstance();
		
		cal3.add(Calendar.YEAR, -10);
		System.out.println(showDate(cal3));
	}

}
