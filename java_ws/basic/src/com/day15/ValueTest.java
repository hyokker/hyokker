package com.day15;

/*
	Object 클래스 - 모든 클래스의 조상
				- 모든 클래스의 상속 계층도의 제일 위에 위치하는 조상 클래스
 */

/*
 기본형 매개변수(call by value)
 - 변수의 값을 읽기만 할 수 있다
 - 매개변수가 기본자료형, 값이 전달됨
 => 메서드에서 매개변수의 값을 변경해도 호출한 곳(main)에서는 변경의 영향을 받지 않는다
 참조형 매개변수(call by reference)
 - 변수의 값을 읽고 변경할 수 있다.
 - 매개변수가 참조형, 주소가 전달됨
 => 메서드에서 매개변수의 값을 변경하면 호출한 곳(main)에서도 변경의 영향을 받음
 */

class Data{
	int x;
}
public class ValueTest {
	public static void main(String[] args) {
		Data d = new Data();
		d.x=10;
		System.out.println("main() : x=" + d.x); //10
	
		change(d.x);
		System.out.println("메서드 호출 후 main() x=" + d.x);
		//
		d.x=20;
		System.out.println("\n----main() : x="+d.x);
		
		change2(d);
		System.out.println("change2() 호출 후 main():x="+d.x);
		//
		int[] arr = new int[2];
		arr[0]=30;
		arr[1]=40;
		
		System.out.println("\n========main(): arr[0]="+arr[0]);
		
		change3(arr);
		System.out.println("change3() 호출 후 main() : arr[0]="+arr[0]);
	}

	
	public static void change(int x) { //call by value
		x=1000;
		System.out.println("change() : x="+x);
	}
	
	public static void change2(Data d) { //call by reference
		d.x=2000;
		System.out.println("change2() : x="+ d.x);
	}
	
	public static void change3(int[] arr) { //call by reference
		arr[0]=3000;
		System.out.println("change3() : arr=[0]"+ arr[0]); //3000
	}
}
