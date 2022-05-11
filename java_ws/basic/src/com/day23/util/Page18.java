package com.day23.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Page18 {
	public static String showDate(Calendar cal) {
		return	cal.get(Calendar.YEAR)+"��"+ (cal.get(Calendar.MONTH)+1)+"�� "
					+ cal.get(Calendar.DATE) + "��";
		}
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance(); // ���ó�¥
		Calendar cal2 = Calendar.getInstance();// ���ϳ�¥
		
		cal2.set(1993, 2, 25);
		//���� ���� �����//
		long gap = (cal.getTimeInMillis()-cal2.getTimeInMillis())/1000;
		gap=gap/(24*60*60);
		System.out.println("���� <1993-03-25> ���� ����� ��");
		System.out.println(gap+"��");

		//�����ϱ��� ���� ��¥//
		Date d = new Date(); //���ó�¥
		Date d2 = new Date(2022-1900,6,19); //������
		
		
		gap = (d2.getTime()-d.getTime())/1000;
		gap = gap/(24*60*60);
		System.out.println("�����ϱ��� ���� �� ��");
		System.out.println(gap);
		
		//���ú��� 10���� ��¥//
		Calendar cal3 = Calendar.getInstance();
		
		cal3.add(Calendar.YEAR, -10);
		System.out.println(showDate(cal3));
	}

}
