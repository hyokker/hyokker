package com.day21;


class Person2{
	private String name;
	private int age;
	
	
	//Object�� toString() �޼��带 �������̵�
	public String toString() {
		return "Person2[name="+name+", age="+age+"]";
	}
}
public class ToStringTest2 {

	public static void main(String[] args) {
		Person2 p = new Person2();
		System.out.println(p);
		System.out.println(p.toString());
	}

}
