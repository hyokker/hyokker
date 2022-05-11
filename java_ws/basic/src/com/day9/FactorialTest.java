package com.day9;

public class FactorialTest {
	public static long factorial(int n) {
		//f(n) = n*f(n-1), 단 f(1)=1
		long result = 0;
		if(n==1) {
			result = 1;
		}else {
			result = n * factorial(n-1);
			/*
			 3*f(2)
			 	2*f(1)
			 	 1
			 */
		}
		return result;
	}
	public static int fib(int n) {
		int result = 0;
			if(n==0) {
				result = 0;
			}else if(n==1) {
				result = 1;
			}else {
				result = fib(n-2) + fib(n-1);
			}
			return result;
		}

	
	
	public static void main(String[] args) {
		/*
		 재귀 호출(Recursive call)
		 -메서드 내부에서 메서드 자기 자신을 다시 호출하는 것
		
		 */
		
		long f=factorial(3);
		System.out.println(f);
		
		
		for(int i=0;i<10;i++) {
			int fib = fib(i);
//			if(fib==0) {
//				System.out.print(fib);
//			}else{
//				System.out.print(","+fib );
			System.out.print(fib);
			
			if(i!=9) System.out.print(",");
			}
		}
	}


