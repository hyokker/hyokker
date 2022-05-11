package com.day23.util;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest1 {

	public static void main(String[] args) {
		//Calendar cal = new Calendar(); //error
		Calendar cal =Calendar.getInstance();
		Calendar cal2 = new GregorianCalendar();
		
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH); //0~11
		int date=cal.get(Calendar.DATE);
		int h=cal.get(Calendar.HOUR);//12�ð�
		int h2=cal.get(Calendar.HOUR_OF_DAY);//24�ð�
		int m=cal.get(Calendar.MINUTE);
		int s=cal.get(Calendar.SECOND);
		int week=cal.get(Calendar.DAY_OF_WEEK);
	
		System.out.println(year+"-"+(month+1)+"-"+date);
		System.out.println(h2+":"+m+":"+s);
		System.out.println(h+"��, "+cal.get(Calendar.AM));
		System.out.println("���� : " + week ); //1:�Ͽ���
		
		long gap = cal.getTimeInMillis()/1000;
		gap=gap/(24*60*60);
		System.out.println("70/01/01 ���� ����� �ð� (��) :" + gap);
					//  0	1 	2	 3	 4	 5	  6	  7	
		String[] arr = {"","��","��","ȭ","��","��","��","��"};
		
		System.out.println("���� :" + arr[week] );
		
		
		
	}

}
