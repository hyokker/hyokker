package com.day24;

class Test{
	private int value;
	
	Test(int value){
		this.value=value;
	}
}
public class ObjectTest3 {

	public static void main(String[] args) {
		/*
		 연산자 ==
		 [1] 기본형에서는 값이 같은지 비교
		 [2] 참조형에서는 주소값을 비교
		 
		 String의 equals() 메서드
		 -문자열 값이 같은지 비교
		 -Object의 equals()를 오버라이딩 한 것
		 
		 Object의 equals()
		 -주소값을 비교
		 */
		
		Test t1= new Test(10);
		Test t2= new Test(10);
		
		if(t1==t2) {
			System.out.println("t1,t2의 주소가 같다");
		}else {
			System.out.println("t1,t2의 주소가 다르다");
		}
		if(t1.equals(t2)) {
			System.out.println("t1,t2의 주소가 같다");
		}else {
			System.out.println("t1,t2의 주소가 다르다");
		}
		
		t2=t1;
		if(t1.equals(t2)) {
			System.out.println("t1,t2의 주소가 같다");
		}else {
			System.out.println("t1,t2의 주소가 다르다");
		}
		
	}

}
