package com.day25;

//static 클래스는 외부 클래스의 static 멤버만 접근할 수 있다.
//외부클래스으 지역변수는 final이 붙은 변수(상수)만 접근가능하다.JDK8.0부터는 지역변수도 접근가능
public class InnerTest2 {
	private int outerIv=0;
	static int outerCv=0;
	
	class InstanceInner{
		int iiv=outerIv;
		int iiv2=outerCv;
	}
	
	static class StaticInner{
		//int siv=outerIv; //error :static 클래스는 외부 클래스의 static 멤버만 접근할 수 있다.
		static int scv=outerCv;
	}
	
	public void method() {
		int lv=0;
		final int LV=0;
		
		class LocalInner{
			int liv=outerIv;
			int liv2=outerCv;
			
			int liv3=lv; //JDK8.0부터는 지역변수도 접근가능
			int liv4=LV;
		}
	}
	public static void main(String[] args) {

	}

}
