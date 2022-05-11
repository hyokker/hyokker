package com.day21;

import java.util.ArrayList;

public class ArrayListTest0 {

	public static void main(String[] args) {
		/*
		 컬렉션 - 데이터의 저장을 위해 정의된 클래스
		 컬렉션 프레임워크 - 데이터 그룹을 저장하는 클래스들을 표준화한 설계
		 				모든 컬렉션 클래스를 표준화된 방식으로 다룰 수 있도록 체계화됨
		 
		 메모리의 사이즈를 동적으로 확장할 수 있다.
		 핵심 인터페이스
		 [1] List
		 	순서가 유지되며, 데이터의 중복을 허용함
		 	구현 클래스 - ArrayList, Vector
		 
		 [2] Set
		 	순서가 유지되지 않으며, 데이터의 중복을 허용하지 않음
		 	구현 클래스 - HashSet
		 
		 [3] Map
		 	키와 값(value)의 쌍으로 이루어진 데이터 집합
		 	순서는 유지되지 않으며, 키는 중복허용 하지않고, 값은 중복 허용
		 	구현 클래스 - HashMap, Hashtable, Properties
		 	
		 	
		 List, Set 의 부모 - Collection
		 
		 Vector,ArrayList - Object 배열을 이용해서 데이터를 순차적으로 저장함
		 */
		
		ArrayList list = new ArrayList(3);
		System.out.println("ArrayList 크키 :" + list.size()+ "\n"); //0
		
		//데이터 저장
		list.add(new Integer(10)); // Jdk 5.0 이전 - 컬렉션에 값을 저장할 때 객체로 
								   //저장해야 하므로 Wrapper 클래스 사용
		list.add(new Integer(20));
		list.add(40); // Jdk 5.0 autoboxing: 기본 자료형이 컴파일러에 의 해자동으로
					  //Wrapper 클래스로 변환되어 저장
		
		System.out.println("ArrayList 크키 :" + list.size()+ "\n"); //3
		
		//데이터 참조
		for(int i=0;i<list.size();i++) {
			Object obj = list.get(i);
			Integer n = (Integer)obj;
			int num=n.intValue();
			/*
			int Integer.intValue()
			Returns the value of this Integer as an int.
			 */
			System.out.println(num);
		}//for
	
		list.add(new Double(3.14));
		list.add("Java");
		
		Double d = (double)list.get(3);
		System.out.println("\n"+d);
		
		
	}
	

}
