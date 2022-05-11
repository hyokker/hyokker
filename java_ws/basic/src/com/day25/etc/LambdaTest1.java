package com.day25.etc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class LambdaTest1 {
	/*
	 	1.
	 	(a,b)->a>b?a:b
	 	2.
	 	(name,i)->System.out.println(name+"="+i);
	 	3.
	 	x-> return x*x
	 	4.
	 	()->(int)(Math.random()*6);
	 
	 */
	
	public static void main(String[] args) {
	      List<Integer> list = new ArrayList<Integer>();
	      list.add(1);
	      list.add(2);
	      list.add(3);
	      list.add(4);
	      list.add(5);
	      
	      list.forEach(i->System.out.print(i+","));  // list의 모든 요소를 출력
	      
	      list.removeIf(x-> x%2==0 || x%3==0);       // 2 또는 3의 배수를 제거
	      System.out.println("\n");
	      list.forEach(i->System.out.println(i));
	      
	      System.out.println();
	      list.replaceAll(i->i*10);                  // 모든 요소에 10을 곱한다.
	      
	      //list.forEach(i->System.out.println(i));
	      list.forEach(new Consumer<Integer>(){
	    	  
	    	  @Override
	    	  public void accept(Integer i) {
	    		  System.out.println(i);
	    	  }
	      });
	      
	      Map<Integer, String> map = new HashMap<Integer, String>();
	      map.put(1, "java");
	      map.put(2, "spring");
	      map.put(3, "oracle");
	      
	      System.out.println("\n==============");
	      // map의 모든 요소를 {k,v}의 형식으로 출력
	      map.forEach((k,v)-> System.out.print("{"+k+","+v+"},"));  


	   }
}
