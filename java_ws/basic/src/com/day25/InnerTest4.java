package com.day25;

class Outer2{
	int value = 10;
	
	class Inner{
		int value = 20;
		
		void method() {
			int value =  30;
			
			System.out.println("value =" + value); //30
			System.out.println("this.value =" + this.value); //20
			System.out.println("Outer.this.value =" + Outer2.this
					.value); //10
		} 
	}//³»ºÎ class
}
public class InnerTest4 {

	public static void main(String[] args) {
		Outer2 oc = new Outer2();
		Outer2.Inner inner = oc.new Inner();
		inner.method();
	}

}
