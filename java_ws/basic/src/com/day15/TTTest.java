package com.day15;

import java.util.Scanner;

class Rect{
	private int width;
	private int height;

	private int area;

	Rect(int width, int height){
	this.width=width;
	this.height=height;
	}

	public int getWidth(){
	return width;
	}
	public void setWidth(int width){
	this.width=width;
	}
	public int getHeight(){
	return height;
	}
	public void setHeight(int height){
	this.height=height;
	}
	public int getArea(){
	return area;
	}

	public void findArea(){
	this.area = width*height;
	
	}
}
public class TTTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rect[] r = new Rect[4];
		for(int i=0;i<r.length;i++){
		System.out.println("가로,세로를 입력");
		int w= sc.nextInt();
		int h= sc.nextInt();
		r[i] = new Rect(w,h);
		}
		for(int i=0;i<r.length;i++) {
			r[i].findArea();
			System.out.println(r[i].getArea());
		}
		

	}

}
