package com.day12;

import java.util.Scanner;

class time{
	int hour;
	int minute;
	int second;

	time(int p_hour,int p_minute,int p_second){
		hour = p_hour;
		minute = p_minute;
		second = p_second;
	}
	
	time(int p_hour,int p_minute){
		hour = p_hour;
		minute = p_minute;
	}
	time(int p_hour){
		hour = p_hour;
	}
	
	public void print() {
		System.out.println(hour + "��\t" + minute + "��\t" + second + "��");	
	}
	
	public int convertToSecond() {
		return hour*60*60 + minute*60 + second;
	}
//	public int convertToSecond(int hour, int minute) {
//		int toSeconde = hour*60*60 + minute*60;
//		return toSeconde;
//	}
//	public int convertToSecond(int hour) {
//		int toSeconde = hour*60*60;
//		return toSeconde;
//	}
}
public class Page52 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��, ��, �ʸ� �Է��ϼ���");
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int second = sc.nextInt();
		System.out.println("================");
		
		time t = new time(hour, minute, second);
		t.print();	
		int sec = t.convertToSecond();
		System.out.println("�ʷ� ȯ���ϸ� :" + sec + "��");
		
		time t2 = new time(hour, minute);
		t2.print();
		int sec2 = t2.convertToSecond();
		System.out.println("�ʷ� ȯ���ϸ� :" + sec2 + "��");
		
		time t3 = new time(hour);
		t3.print();	
		int sec3 = t3.convertToSecond();
		System.out.println("�ʷ� ȯ���ϸ� :" + sec3 + "��");
		
	}

}
