package com.day24;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ParseTest2 {

	public static void main(String[] args) {
		// public Date parse(String source) throws ParseException
		// - ���ڿ��� ��¥�� ��ȯ
		
		//����ڰ� �Է��� ��¥�� ���� ��¥ ������ ���� ���ϱ�
		//=> ����ڰ� �Է��� ���ڿ� ������ ��¥�� Date�� ��ȯ�ؾ� ��
		
		Scanner sc=new Scanner(System.in);
		System.out.println("��¥�� �Է��ϼ���(2022-01-02)");
		String str = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		long diff=0;
		Date date;
		try {
			date = sdf.parse(str);
			Date today = new Date();
			//Date today2 = null;
			if(date.getTime() >today.getTime()) { //�̷���¥ �Է��� ���
				//���ó�¥������ �ð��� �����Ѵ�
				String s = sdf.format(today);
				System.out.println("today s = " + s);
				
				today=sdf.parse(s);
				diff=(date.getTime()-today.getTime())/1000;
			}else { // ���� ��¥ �Է��� ���
				diff = (today.getTime()- date.getTime())/1000;
			}
			
			System.out.println("�Է��� ��¥ : " + date.toLocaleString());
			System.out.println("���� ��¥  : " + today.toLocaleString());

			diff = diff/(24*60*60);
			System.out.println("�� ��¥ ������ ���� :"+ diff);	
		} catch (ParseException e) {
		
			e.printStackTrace();
		}
	}

}
