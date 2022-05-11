package com.day24;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateTest {

	public static void main(String[] args) {
		// SimpleDateFormat\
		// public final String format(Date date) : 날짜 -> 형식화된 문자열

		Date today = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd E요일");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS a");
		//HH(0~23), hh(1~12)
		String str = sdf.format(today);
		System.out.println(str);
		
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
	}

}
