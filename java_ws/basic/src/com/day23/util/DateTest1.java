package com.day23.util;

import java.util.Date;

public class DateTest1 {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.toLocaleString());
		
		int year=d.getYear();
		System.out.println((year+1900)+"��");
		System.out.println((d.getMonth()+1)+"��"+ d.getDate()+"��");
		//=>���� 0~11 ����
		System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
		System.out.println("���� : " + d.getDay()); // 0:�Ͽ���
		
		//1970-01-01 0�� 0�� 0�ʸ� �������� ����� �ð��� �и��ʷ� ����
		long gap = d.getTime()/1000; //�� (1�ʴ� 1000�и���)
		System.out.println("1970-01-01���� ���ñ��� ����� �ð�(��):" + gap);
		
		gap=gap/(24*60*60); //��
		System.out.println("����� �ϼ� : "+ gap + "��");
		}

}
