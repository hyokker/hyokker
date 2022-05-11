package com.day13.sub;

class StaticBlock{
	static int[] arr = new int [10];//명시적 초기화 = 을 사용하는것
	
	//static 초기화 블럭
	static {
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10+1);
		}//for
	}
	
	/*
	 static 초기화 블럭(클래스 초기화 블럭)
	 -static변수의 복잡한 초기화에 사용됨
	 -해당 클래스가 메모리에 로딩될 때 한번만 수행됨
	  (해당 클래스가 메모리에 로딩될 때 static변수들이 메모리에 만들어지고, 바로 static 초기화 블럭이 
	  수행되서 static변수들을 초기화하게 됨)
	  
	  static{
	  
	  }
	  
	 */
}

public class StaticBlockTest {
	public static void main(String[] args) {
		for(int i=0;i<StaticBlock.arr.length;i++) {
			System.out.println(StaticBlock.arr[i]);
		}
	}

}
