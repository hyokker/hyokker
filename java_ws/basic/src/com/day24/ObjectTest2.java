package com.day24;

class Person2{
	private String name;
	private int age;
	
	public String toString() {
		return "Person[name="+name+", age=" + age + "]";
	}
}

public class ObjectTest2 {

	public static void main(String[] args) {
		Person2 p = new Person2();
		System.out.println(p.toString());
		System.out.println(p);
	}

}
