package com.day21;

import java.util.ArrayList;

public class Page18 {

	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>(3);
		
		list.add(3.14); 
		list.add(5.87); 
		list.add(2.476);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("\n======확장 for======");
		for(double d : list) {
			System.out.println(d);
		}

		ArrayList<String> list2 = new ArrayList<String>(5);

		System.out.println("\n======");
		for(int i=0;i<5;i++) {
			list2.add(i+1+":"+"Hello java");
		}
		
		
		for(int i=0;i<list2.size();i++) {
			System.out.println(list2.get(i));
		}
		
		System.out.println("\n=====확장 for=====");
		for(String s : list2) {
			System.out.println(s);
		}
	}
}
