package com.day13;

class Time{
	//1.�������
	private int hour;
	private int min;
	private int sec;
	//2.������
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
			System.out.println("�ð��� �߸� �Է��߾��!");
			return;
		}
		
		hour=h;
		
	}
	
	
	public int getMin() {
		return min;
	}
	
	public void setMin(int m) {
		if(m<0||m>59) {
			System.out.println("���� �߸� �Է��߾��!");
			return;
		}
		
		min=m;
	}
	
	public int getSec() {
		return sec;
	}
	
	public void setSec(int s) {
		if(s<0||s>59) {
			System.out.println("�ʸ� �߸� �Է��߾��");
			return;
		}
		
		sec=s;
	}
	//4.�޼���
	public void showInfo() {
		System.out.println(hour +"��"+min+"��"+sec+"��");
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
