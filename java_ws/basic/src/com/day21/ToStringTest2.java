package com.day21;


class Person2{
	private String name;
	private int age;
	
	
	//Object의 toString() 메서드를 오버라이딩
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
