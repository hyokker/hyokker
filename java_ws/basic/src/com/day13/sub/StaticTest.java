package com.day13.sub;

public class StaticTest {
	private int num1=10; // 인스턴스 변수
	private static int num2=20; //static 변수
	
	public int add() {	//인스턴스 메서드
		return num1+num2; //인스턴스 메서드에서는 static 변수에 접근가능
	}
	public static int multiply(int a, int b) { //static 메서드 - static만 접근 가능
		//int c = num1*num2; //error : Cannot make a static reference to the non-static field num1
		//static 에서는 static만 접근가능하므로 에러
		int c = a*b;
		return c;
	
	}
	public static void main(String[] args) {
		int result = multiply(5, 9);
		//static 메서드 호출 : 클래스명.메서드()
		//=> 같은 클래스 이므로 클래스명 생략하고 메서드()만으로 호출가능
		System.out.println("두 수의 곱 : "+ result );
		
		//add(); //static 메서드에서 인스턴스 메서드 호출 불가
		//static메서드는 static 데이터만 접근 가능
		//=> 인스턴스 데이터는 객체 생성 후 접근해야 함
		StaticTest obj = new StaticTest();
		result=obj.add();
		System.out.println("두 수의 합 : " + result );
				
		
		
	}

}
