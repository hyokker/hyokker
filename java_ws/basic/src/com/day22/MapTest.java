package com.day22;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		/*
		 HashMap
		 - 키와 값을 한쌍으로 해서 저장하는 자료구조
		 - 순서 유지 되지 않는다.
		 - 키는 중복허용 안되고, 값은 중복 허용
		 */
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(7, "홍길동");
		map.put(9, "김길동");
		map.put(15, "이길동");
		
		String s = map.get(7);
		System.out.println("7번 키의 값 : " + s);

		map.remove(9); // 9번 키의 데이터 삭제
		
		//Set<K> keySet()
		/*
		Set<Integer>set =map.keySet();
		Iterator<Integer> iter1=set.iterator();
		*/
		
		Iterator<Integer> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			int key = iter.next();
			String val = map.get(key);
			System.out.println("key=" + key +", value ="+ val);
		}
		
		System.out.println("\n데이터 개수 : " + map.size());
	}

}
