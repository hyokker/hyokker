package com.day21;

import java.util.ArrayList;

class Member{
	private String id;
	private String name;
	
	Member(String id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return "Member[id="+id+", name="+name+"]";
	}
}
public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList<Member> list = new ArrayList<Member>();
		
		list.add(new Member("hong", "ȫ�浿"));
		list.add(new Member("kim", "��浿"));
		list.add(new Member("lee", "�̱浿"));
		
		
		Member m = new Member("jung", "���浿");
		list.add(m);
		
		for(int i=0;i<list.size();i++) {
		Member mem=list.get(i);
		System.out.println(mem);
		}
		System.out.println("\n===========");
		
		for(Member mem : list) {
			System.out.println(mem);
		}
	}

}
