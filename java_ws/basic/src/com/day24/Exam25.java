package com.day24;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Exam25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat money = new DecimalFormat("#,###");
		System.out.println("정수를 입력");
		long a = sc.nextInt();
		String moneyCast = money.format(a);
		System.out.println(moneyCast);
		
		
		Date today = new Date();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd E요일 HH:mm:ss a");
		String s = sdf2.format(today);
		System.out.println(s);
		
		
		System.out.println("\n======================");
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년MM월dd일 E");
		System.out.println("날짜를 입력하세요 <2013/09/30>");
		String str = sc.nextLine();
		
		
		try {
			 date = sdf.parse(str);
			System.out.println(sdf3.format(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
/*
package com.day24;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ExamFormat {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("정수 입력!");
      int n=sc.nextInt();
      
      DecimalFormat df = new DecimalFormat("#,###");
      System.out.println(df.format(n));
      
      System.out.println("\n날짜를 입력하세요(2022/09/30)");
      sc.nextLine();
      String str = sc.nextLine();

      DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
      DateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 E");

      try {
         Date day = sdf.parse(str);

         System.out.println(sdf2.format(day));
      } catch(Exception e) {
         e.printStackTrace();
      }

      Calendar cal = Calendar.getInstance();      
      Date day = cal.getTime();      

      SimpleDateFormat sdf3
         = new SimpleDateFormat("yyyy-MM-dd E요일 hh:mm:ss a");
      System.out.println("\n오늘날짜 : "+sdf3.format(day));
      

   }
}
*/