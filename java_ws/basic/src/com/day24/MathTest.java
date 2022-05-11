package com.day24;

public class MathTest {

	public static void main(String[] args) {
		
		System.out.println("abs(-27.5) : "+ Math.abs(-27.5));
		System.out.println("abs(27.5) : "+ Math.abs(27.5));
		System.out.println("ceil(-27.3):"+ Math.ceil(-27.3));
		System.out.println("ceil(27.3):"+ Math.ceil(27.3));
		
		/*
		 -28, -27.6, -27.3 , -27, -26, 0 ,26, 27, 27.3, 27.6, 28
		 */
		System.out.println("floor(-27.6):"+ Math.floor(-27.6));
		System.out.println("floor(27.6):"+ Math.floor(27.6));
		System.out.println("round(34.5374):"+ Math.round(34.5374)); //반올림(소수1째 자리에서)
		System.out.println("Math.E: "+ Math.E); 
		System.out.println("Math.PI: "+ Math.PI );
		}
		

	}

