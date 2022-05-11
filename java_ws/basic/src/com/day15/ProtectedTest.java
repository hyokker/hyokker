package com.day15;

import com.day14.MyParent;

class MyChild extends MyParent{
	public void putData() {
		//num1=10;//private, error
		num2=20;//protected
		//num3=30;//default, error
		num4=40; //public
	}
	
}
public class ProtectedTest {

	public static void main(String[] args) {
		MyChild ch = new MyChild();
		//ch.num1=30; //num1 is not visible, private, error
		//ch.num2=40; //num2 is not visible, protected, error
		//ch.num3=600;  //num3 is not visible, default, error
		ch.num4=600; //public
	
		/*
		 protected
		 -같은 패키지는 물론이고, 다른 패키지에 있더라도 상속관계에서는 접근을 허용
		 -외부에 자신의 멤버를 감추고 자식 클래스에게만 멤버를 노출
		 -실행타임에는 default, 클래스 디자인 타임에 자식에게는 public
		 */
	}

}
