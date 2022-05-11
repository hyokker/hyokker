package com.day12;

import java.util.Scanner;

class RectangleClass {
	 int w;
	 int h;
 
	 public int area(int w, int h) {
		 int area = w*h;
		 return area;
	 }
	 public int girth(int w, int h) {
		 int girth = 2*w+2*h;
		 return girth;
	 }

}
 public class Rectangle{

		public static void main(String[] args) {
			
			System.out.println("사각형의 가로 세로를 입력");
			Scanner sc = new Scanner(System.in);
			RectangleClass rc = new RectangleClass();
			int w = sc.nextInt();
			int h = sc.nextInt();	
			
			rc.w= w;
			rc.h= h;
			
			int area = rc.area(w, h);
			int girth = rc.girth(w, h);
			
			System.out.println("사각형의 넓이 :"+area);
			System.out.println("사각형의 둘레 :"+girth);
			

			
		}

	}

