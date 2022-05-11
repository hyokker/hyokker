package com.day22;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;



public class ListTest {

	public static void main(String[] args) {

		ArrayList<Member> list = new ArrayList<Member>();
		list.add(new Member("hong", "ȫ�浿"));
		list.add(new Member("kim", "��浿"));
		
		Iterator<Member> iter = list.iterator();
		while(iter.hasNext()) {
			Member m =iter.next();
			System.out.println(m);
		}
		
		Vector<Member> vec = new Vector<Member>();
		vec.add(new Member("lee" , "�̱浿"));
		vec.add(new Member("park" , "�ڱ浿"));

		System.out.println("\n===============");
		
		Enumeration<Member> en = vec.elements();
		while(en.hasMoreElements()) {
			Member m = en.nextElement();
			System.out.println(m);
		}
		
		System.out.println("\n");
		for(int i=0;i<vec.size();i++) {
			Member m=vec.get(i);
			System.out.println(m);
		}
		
		for(Member mm : vec) {
			System.out.println(mm);
		}
	}

}
