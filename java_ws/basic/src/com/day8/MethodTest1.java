package com.day8;

public class MethodTest1 {

	public static void main(String[] args) {
		/*
		 * 메서드 - 특정기능을 수행하는 최소 실행단위
		 * - 자주 반복하여 사용하는 내용에 대해 특정 이름으로 정의한 묶음
		 * - 필요할때마다 호출하여 원하는 작업을 시킬수 있다.
		 * 
		 * 불필요한 반복 제거 코드의 재사용성을 높이는 역할
		 * 
		  메서드 종류 
		  [1]기본적으로 제공되는 메서드 (내장 메서드) println(), parseInt(), toUpperCase() 등
		  [2]사용자 정의 메서드
		 * 
		  메서드 형식
		  접근 제한자 반환형 메서드이름(매개변수) {
		  	기능구현; return 반환값[=결과값];
		   }
		 * 
		 * 입력값 - 매개변수, parameter, 인수, 인자 결과값의 형태 - 반환형, 반환타입, return type
		 */

		// 메서드 호출
		// 반환타입 자료형 결과값 받는 변수 = 메서드명(매개변수값);
		double d = calcInterest(1000000);
		/*
		  메서드 호출 순서
		  1) 메서드명을 쓰고 ()을 붙인다. calcInterest();
		  
		  2) () 안에 매개변수 값을 넣는다 (매개변수 자료형에 해당하는 값) calcInterest(1000000);
		  
		  3) 결과값을 받는다 - 반환 타입에 해당하는 자료형의 변수에 결과값을 받는다 double d=calcInterest(1000000);
		 */

		/*
		 * [1] 같은 클래스 안에 있는 메서드 호출 메서드명();
		 * 
		 * [2] 다른 클래스 안에 있는 메서드 호출 클래스명.메서드명();
		 * 
		 */
		System.out.println("이자 :" + d);
	}// main

	// 메서드정의 // 위치는 클래스 내부에 어디에든 있어도 상관없음. 단, 메인메소드 안에서는 안됨
	// 이자 계산하는 기능의 메서드 //매개변수의 자료형이 중요!!!!!!
	public static double calcInterest(int money) {
		// 1. 입력값 결정 - 매개변수 지정

		// 2. 매개변수를 이용하여 기능 구현
		double interest = money * 0.016;
		// 3. 결과값 return
		return interest;
		// 4. 반환타입 결정 : return 해주는 결과값(변수)의 자료형을 메서드 이름 앞에 써준다
	}

}

/*
 * return 
  	[1]메서드의 실행을 종료하고 호출원 으로 복귀(자신을 호출한 곳으로 감) 
  	[2]메서드의 처리결과를 호출원으로 돌려주는 기능도 * 함
  	반환값이 없는 메서드 : 반환타입에 void를 쓴다
  	한개의값만 반환해줌
  	return a;
  	return a,b //error
 */
