package com.day23;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest1 {

	public static void main(String[] args) {
		/*
		 TreeSet
		 - 데이터를 정렬된 상태로 유지함
		 
		 */
		
		TreeSet<Integer> tset = new TreeSet<Integer>();
		tset.add(10);
		tset.add(4);
		tset.add(2);
		tset.add(7);
		tset.add(2);
		tset.add(1); // 저장 될 때마다 데이터가 정렬됨
		System.out.println("저장된 데이터 수 :" + tset.size());
		
		Iterator<Integer> iter = tset.iterator();
		while(iter.hasNext()) {
			int n = iter.next();
			System.out.println(n);
		}
		
		Set<Integer> set = new TreeSet<Integer>();
		
		while(set.size()<6) {
			int n = (int)(Math.random()*45+1);
			set.add(n);
		}
		
		System.out.println("\n==========로또 값===========");
		System.out.println(set);
		
		TreeSet<String> tset2 = new TreeSet<String>();
		tset2.add("홍길동");
		tset2.add("박길동");
		tset2.add("김길동");
		tset2.add("홍길동");
		tset2.add("oracle");
		tset2.add("mz");
		tset2.add("abcd");
		tset2.add("JAVA");
		tset2.add("ABC");
		tset2.add("XYZ");
		tset2.add("987");
		tset2.add("123");
	
		
		Iterator<String> iter2=tset2.iterator();
		while(iter2.hasNext()) {
			String s = iter2.next();
			System.out.println(s);
		}
	}
	

}
