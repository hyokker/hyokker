package com.day25;
	/*
	 내부 클래스 - 클래스 내에 선언된 클래스
	  		  - GUI 어플리케이션의 이벤트 처리에 사용
	  		  - private, protected 접근 제어자도 사용 가능
	 변수의 선언 위치에 따른 종류와 같다
	 [1] 인스턴스 클래스
	 [2] static 클래스
	 [3] 지역 클래스
	 [4] 익명 클래스
	 */

////error : 내부 클래스 중 static 클래스만 static 멤버를 가질수 있다.
public class InnerTest1 {
	class InstanceInner{
		int iv=100;
		//static int cv=1000; 
		//error : 내부 클래스 중 static 클래스만 static 멤버를 가질수 있다.
		final static int CONST=100; //static final은 상수이므로 허용
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 200;//static 클래스만 ststic멤버 정의할 수 있다
		
		void method() {
			class LocalInner{
				int iv=300;
				//static int cv =300; //error
				final static int CONST=300;
			}
		}
	}
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);

	}

}
