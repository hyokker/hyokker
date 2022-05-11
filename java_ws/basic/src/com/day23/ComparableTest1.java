package com.day23;

import java.util.Iterator;
import java.util.TreeSet;

//TreeSet에 저장하려면 Comparable<T> 인터페이스 구현을 통해 정렬기준을 개발자가 직접 정의해야 함
class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public String toString() {
		return "Person[name]="+name+", age="+ age + "]";
	}

	@Override
	public int compareTo(Person p) {
		//정렬기준을 나이로 정한자
		if(this.age>p.age) {
			return 1; //매개변수 p의 나이가 작다면 양수 반환
		}else if(this.age<p.age) {
			return -1; //음수
		}else {
			return 0; //0
		}
		
	}
	
}
public class ComparableTest1 {

	public static void main(String[] args) {
		TreeSet<Person> tset = new TreeSet<Person>();
		tset.add(new Person("홍길동", 20));//실행에러
		// ClassCastException: Person cannot be cast to class Comparable
		tset.add(new Person("박길동", 17));
		tset.add(new Person("김길동", 31));
		//TreeSet<E> 는 Person의 인스턴스가 저장될 때마다 기존에 저장된 인스턴스와의 비교를 위해서
		//compareTo() 메서드를 빈번히 호출하여, 이때 반환되는 값을 기반으로 정렬을 진행
		
		Iterator<Person> iter=tset.iterator();
		while(iter.hasNext()) {
			Person p = iter.next();
			System.out.println(p);
		}
	
	}

}
