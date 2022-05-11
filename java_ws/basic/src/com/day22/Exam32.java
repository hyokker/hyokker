package com.day22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Exam32 {

	public static void main(String[] args) {
		System.out.println("==========ArrayList �̿�=========");
		ArrayList<Double> list = new ArrayList<Double>();
		for(int i=0;i<4;i++) {
			list.add(i+1.5);
		}
		for(int i=0;i<list.size();i++) {
			double a = list.get(i);
			System.out.println(a);
		}
		System.out.println("\n====Ȯ�� for �̿�====");
		for(Double a : list) {
			System.out.println(a);
		}
		
		
		System.out.println("=====�迭 �̿�=====");
		double[] dArr = new double[4];
		dArr[0]=1.5;
		dArr[1]=2.5;
		dArr[2]=3.5;
		dArr[3]=4.5;
		
		for(int i=0;i<dArr.length;i++) {
			System.out.println(dArr[i]);
		}
		System.out.println("\n=====Ȯ�� for======");
		for(double dd : dArr) {
			System.out.println(dd);
		}
		
		System.out.println("======HashSet iterator �̿�=======");
		HashSet<Double> hSet = new HashSet<Double>(10);
		for(int i=0;i<4;i++) {
			hSet.add(i+1.5);
		}
		
		Iterator<Double> iter = hSet.iterator();
		while(iter.hasNext()) {
			double d =iter.next();
			System.out.println(d);
		}
	}

}
