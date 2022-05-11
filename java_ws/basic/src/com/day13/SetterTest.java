package com.day13;

class Time{
	//1.멤버변수
	private int hour;
	private int min;
	private int sec;
	//2.생성자
	Time(int h, int m, int c){
		hour=h;
		min=m;
		sec=c;
	}
	
	//3.getter/setter
	public int getHour() {
		return hour;
	}
	
	public void setHour(int h) {
		if(h<0||h>23) {
			System.out.println("시간을 잘못 입력했어요!");
			return;
		}
		
		hour=h;
		
	}
	
	
	public int getMin() {
		return min;
	}
	
	public void setMin(int m) {
		if(m<0||m>59) {
			System.out.println("분을 잘못 입력했어요!");
			return;
		}
		
		min=m;
	}
	
	public int getSec() {
		return sec;
	}
	
	public void setSec(int s) {
		if(s<0||s>59) {
			System.out.println("초를 잘못 입력했어요");
			return;
		}
		
		sec=s;
	}
	//4.메서드
	public void showInfo() {
		System.out.println(hour +"시"+min+"분"+sec+"초");
	}
	
	
}
public class SetterTest {

	public static void main(String[] args) {
		Time t = new Time(10, 14, 50);
		t.showInfo();
		
		t.setHour(11);
		t.setMin(20);
		t.setSec(45);
		
		System.out.println(t.getHour()+" : "+ t.getMin() + " : " + t.getSec());
	
	
		t.setHour(24);
		t.setMin(60);
		t.setSec(60);
		
		t.showInfo();
	}

}
