package com.day24;

class Person{
	public void showInfo() {
		System.out.println("this="+this);
	}
}
public class ObjectTest1 {

	public static void main(String[] args) {
		Person p = new Person();
		Person p2 = new Person();
		
		System.out.println(p.equals(p2));
		System.out.println(p.getClass());
		System.out.println(p.hashCode());
		System.out.println(p.toString());
		System.out.println(p);
		System.out.println(Integer.toHexString(p.hashCode()));
		
		System.out.println(p.getClass().getName());
		p.showInfo();
		
		p2=p;
		if(p.equals(p2)) {
			System.out.println("p와 p2의 주소는 같다");
			
		}else {
			System.out.println("p와 p2의 주소가 다르다");
		}
		
		/*
		 toString() 메서드의 결과
		 클래스명@16진수 해시코드
		 getClass().getName() + "@" + Integer.toHexString(hashCode)
		 */
	}

}
