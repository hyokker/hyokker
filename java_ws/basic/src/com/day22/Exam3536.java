package com.day22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Exam3536 {

	public static void main(String[] args) {
		HashMap<String, String> hMap = new HashMap<String,String>();
		hMap.put("boy", "소년");
		hMap.put("girl", "소녀");
		hMap.put("school", "학교");
		
		Iterator<String> iter = hMap.keySet().iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			String val = hMap.get(key);
			System.out.println( key +" =>"+ val);
		}
		
		
		
		System.out.println("======ArrayList 이용======");
		ArrayList<Character> list = new ArrayList<Character>();
		for(int i=65;i<91;i++) {
			list.add((char) i);
		}
		
		for(int i=0;i<list.size();i++) {
			char ch  =list.get(i);
			System.out.print(ch+" ");
		}
		System.out.println("");
		for(Character c : list) {
			System.out.print(c.toString()+ " ");
		}
		
		
		
		System.out.println("\n=======HashMap 이용=======");
		
		HashMap<Integer ,Character> list2 = new HashMap<Integer, Character>();
		for(int i=65;i<91;i++) {
			list2.put(i, (char) i);
			}
		
		Iterator<Integer> iter2 = list2.keySet().iterator();
		while(iter2.hasNext()) {
			int a = iter2.next();
			char c = list2.get(a);
			
			System.out.print(c + " ");
		}
		System.out.println("");
		for(int i=0;i<list2.size();i++) {
			System.out.print(list2.get(i+65)+ " ");
		}
			
		
		System.out.println("\n======HashSet 이용======");
		HashSet<Character> set = new HashSet<Character>();
		for(int i=65;i<91;i++) {
			set.add((char)i);
		}
		
		Iterator<Character> iter3 = set.iterator();
		while(iter3.hasNext()){
			char c = iter3.next();
			System.out.print(c + " ");
		}
		
		
		
	}
			
}


/*
 package com.day22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ExamMap {
   public static void main(String[] args) {
      HashMap<String, String> map = new HashMap<String, String>();
      
      map.put("boy", "소년");
      map.put("girl", "소녀");
      map.put("school", "학교");
      
      Iterator<String> keyIter = map.keySet().iterator();
      while(keyIter.hasNext()) {
         String key=keyIter.next();
         String value=map.get(key);
         System.out.println(key+"=>"+ value);
      }
      
      //
      ArrayList<Character> list = new ArrayList<Character>();
      HashMap<Integer, Character> map2 = new HashMap<Integer,Character>();
      HashSet<Character> set = new HashSet<Character>();

      for (char i = 'A'; i <= 'Z'; i++){
         list.add(i);
         map2.put(i-65, i);//키가 0~25
         set.add(i);
      }

      System.out.println("\n-----ArrayList 이용-----");
      for(int i = 0; i < list.size(); i++){   
         char ch = list.get(i);
         System.out.print(ch +" ");
      }

      System.out.println();
      for(char ch:list){
         System.out.print(ch +" ");
      }
      
      System.out.println("\n\n-----HashMap 이용-----");
      for(int i = 0; i < map2.size(); i++){
         System.out.print(map2.get(i) +" ");
      }

      System.out.println("\n\n--------HashSet 이용--------");
      Iterator<Character> it=set.iterator();
      while(it.hasNext()){
         char d =it.next();
         System.out.print(d+" ");
      }
      
      System.out.println("\n\n--------HashMap iterator 이용--------");
      Iterator<Integer> itr=map2.keySet().iterator();
      while(itr.hasNext()){
         int key =itr.next();
         char ch = map2.get(key);
         System.out.print(ch +" ");
      }
   }
}
 */
