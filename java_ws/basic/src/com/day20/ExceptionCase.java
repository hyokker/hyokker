package com.day20;

public class ExceptionCase {

	public static void main(String[] args) {
		try {
			int[] arr = new int[3];
			arr[3]=30;
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 발생 : " + e.getMessage());
			
		}
	
		try {
			Object obj = new int[2];
			String str=(String)obj;
			
			//Circle c = (Circle)new Shape();
		}catch (ClassCastException e) {
			System.out.println("예외 :" + e);
		}
		
		try {
			int[] arr=new int[-4];
		}catch (NegativeArraySizeException e) {
			System.out.println("exception!!");
			e.printStackTrace();
		}
		
		try {
			String str = null;
			int len=str.length();
		}catch (NullPointerException e) {
			System.out.println("예외 : "+e.getMessage());
		}
	}

}
