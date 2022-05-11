package com.day16;

class Father{
	protected String name;
	
	Father(String name) {
		this.name=name;
	}

	public void showInfo() {
		System.out.println("이름 : " + name);
	}
}
class Son extends Father{
	Son(String name){
		super(name);
	}
}
public class SuperTest2 {

	public static void main(String[] args) {
		Son s = new Son("아들");
		s.showInfo();

	}

}
