package com.day23.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalenderTest2 {
	public static String showDate(Calendar cal) {
	return	cal.get(Calendar.YEAR)+"년"+ (cal.get(Calendar.MONTH)+1)+"월 "
				+ cal.get(Calendar.DATE) + "일";
	}
	public static void main(String[] args) {
		//[1] 100일 후, 3개월 전, 7년 후
		Calendar today = Calendar.getInstance();
		
		//2022-01-01
		//Calendar cal = new GregorianCalendar(22, 0, 1);
		
		System.out.println("현재일자 : "+showDate(today));
	
		System.out.println("\n======100일 후=======");
		today.add(Calendar.DATE, 100);
		System.out.println("100일 후 일자 : " + showDate(today));
		
		today.add(Calendar.MONTH, -3);
		System.out.println("\n3개월전 날짜 :" + showDate(today));
		
		today.add(Calendar.YEAR, 7);
		System.out.println("\n7년후 날짜 :" + showDate(today));
		
		//[2] 두 날짜 사이의 간격
		//크리스마스까지 며칠 남았는지
		Date d = new Date();
		Date d2 = new Date(2022-1900, 11, 25);
		
		long gap = (d2.getTime() - d.getTime())/1000; //초
		gap=gap/(24*60*60); //일
		
		System.out.println("\n"+d.toLocaleString());
		System.out.println(d2.toLocaleString());
		System.out.println("두 날짜 사이의 간격 : " + gap + "일");
	
	}

}
