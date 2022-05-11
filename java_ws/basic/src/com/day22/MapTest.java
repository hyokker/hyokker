package com.day22;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		/*
		 HashMap
		 - Ű�� ���� �ѽ����� �ؼ� �����ϴ� �ڷᱸ��
		 - ���� ���� ���� �ʴ´�.
		 - Ű�� �ߺ���� �ȵǰ�, ���� �ߺ� ���
		 */
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(7, "ȫ�浿");
		map.put(9, "��浿");
		map.put(15, "�̱浿");
		
		String s = map.get(7);
		System.out.println("7�� Ű�� �� : " + s);

		map.remove(9); // 9�� Ű�� ������ ����
		
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
		
		System.out.println("\n������ ���� : " + map.size());
	}

}
