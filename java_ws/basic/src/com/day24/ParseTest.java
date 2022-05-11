package com.day24;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ParseTest {

	public static void main(String[] args) {
		// public Date parse(String source) throws ParseException
		// - ���ڿ��� ��¥�� ��ȯ
		
		//����ڰ� �Է��� ��¥�� ���� ��¥ ������ ���� ���ϱ�
		//=> ����ڰ� �Է��� ���ڿ� ������ ��¥�� Date�� ��ȯ�ؾ� ��
		
		Scanner sc=new Scanner(System.in);
		System.out.println("���� ���� ��¥�� �Է��ϼ���(2022-01-02)");
		String str = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date;
		try {
			date = sdf.parse(str);
			Date today = new Date();
			long diff = (today.getTime()- date.getTime())/1000;
			diff = diff/(24*60*60);
			System.out.println("�� ��¥ ������ ���� :"+ diff);	
		} catch (ParseException e) {
	
			e.printStackTrace();
		}
	}

}
