package com.day12;

import java.util.Scanner;

class Rectangle2{
	int width;
	int height;
	
	public Rectangle2(int p_width,int p_height) {
		width = p_width;
		height = p_height;
	}
	public double findArea() {
		return  width*height*0.5;
	}
	public double findGirth() {
		return (width+height)+2;
	}
}
public class Page50 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가로, 세로 입력");
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		Rectangle2 rc = new Rectangle2(w, h);
		double area =rc.findArea();
		double girth =rc.findGirth();
		System.out.println(area);
		System.out.println(girth);
	}

}
