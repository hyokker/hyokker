package com.day23.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalenderTest2 {
	public static String showDate(Calendar cal) {
	return	cal.get(Calendar.YEAR)+"��"+ (cal.get(Calendar.MONTH)+1)+"�� "
				+ cal.get(Calendar.DATE) + "��";
	}
	public static void main(String[] args) {
		//[1] 100�� ��, 3���� ��, 7�� ��
		Calendar today = Calendar.getInstance();
		
		//2022-01-01
		//Calendar cal = new GregorianCalendar(22, 0, 1);
		
		System.out.println("�������� : "+showDate(today));
	
		System.out.println("\n======100�� ��=======");
		today.add(Calendar.DATE, 100);
		System.out.println("100�� �� ���� : " + showDate(today));
		
		today.add(Calendar.MONTH, -3);
		System.out.println("\n3������ ��¥ :" + showDate(today));
		
		today.add(Calendar.YEAR, 7);
		System.out.println("\n7���� ��¥ :" + showDate(today));
		
		//[2] �� ��¥ ������ ����
		//ũ������������ ��ĥ ���Ҵ���
		Date d = new Date();
		Date d2 = new Date(2022-1900, 11, 25);
		
		long gap = (d2.getTime() - d.getTime())/1000; //��
		gap=gap/(24*60*60); //��
		
		System.out.println("\n"+d.toLocaleString());
		System.out.println(d2.toLocaleString());
		System.out.println("�� ��¥ ������ ���� : " + gap + "��");
	
	}

}
