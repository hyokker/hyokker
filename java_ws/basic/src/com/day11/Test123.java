package com.day11;

public class Test123 {

	public static void main(String[] args) {
		delimeter = "----";
		printA();
		printA();
		printB();
		printB();
		
		delimeter = "****";
		printA();
		printA();
		printB();
		printB();
	}
	public static String delimeter ="----";
	private static void printA() {
		System.out.println(delimeter);
		System.out.println("A");
		System.out.println("A");
	}
	private static void printB() {
		System.out.println(delimeter);
		System.out.println("B");
		System.out.println("B");
	}


}
