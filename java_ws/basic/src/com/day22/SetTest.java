package com.day22;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		
		/*
		 HashSet
		 - 순서 유지하지 않는다.
		 - 중복 저장 허용하지 않는다.
		 */
		
		HashSet<String> hset = new HashSet<String>();
		
		hset.add("first");
		hset.add("second");
		hset.add("third");
		hset.add("first");
		
		
		System.out.println("저장된 데이터 수 : " + hset.size());
		
		Iterator<String> iter = hset.iterator();
		while(iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}
		/*
		Enumeration, Iterator
 		컬렉션에 저장된 요소를 접근하는데 사용되는 인터페이스
 		
		Collection 인터페이스에는 Iterator(Iterator를 구현한 클래스의
		인스턴스)를 반환하는 iterator()를 정의

		
		Iterator<E> iterator()
		
		boolean hasNext() 
		- 읽어 올 요소가 남아있는지 확인함. 있으면 true, 없으면 false
		
		Object next()
		- 다음 요소를 읽어옴
		 */
		
	}

}
