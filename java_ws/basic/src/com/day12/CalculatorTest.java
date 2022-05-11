package com.day12;

import java.util.Scanner;

class Calculator{
	
	public double sum(double aa, double bb) {
		double sum = aa+bb;
		return sum;
	}
	public double mi(double aa, double bb) {
		double mi = aa-bb;
		return mi;
	}
	public double na(double aa, double bb) {
		double na= aa/bb;
		return na;
	}
	public double g(double aa, double bb) {
		double g = aa*bb;
		return g;
		
	}
}

public class CalculatorTest{
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 실수를 입력하세요");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		Calculator cl = new Calculator();
		
		System.out.println("a+b=>"+cl.sum(a, b));
		System.out.println("a-b=>"+cl.mi(a, b));
		System.out.println("a*b=>"+cl.g(a, b));
		System.out.println("a/b=>"+cl.na(a, b));
		

		
	}

}
