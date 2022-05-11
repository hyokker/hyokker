package com.day17;

import java.util.Scanner;

class Shape2{
	public double findArea() {
		return 0;
	}
	public String kind() {
		return "도형의 종류";
	}

}

class Circle2 extends Shape2{
	private int r;
	final double PI = 3.1415;
	
	Circle2(int r){
		this.r=r;
	}
	public double findArea() {
		return PI*r*r;
	}
	
	public String kind() {
		return "원의";
	}
}

class Rect extends Shape2{
	private int w,h;
	
	Rect(int w, int h){
		this.w=w;
		this.h=h;
	}
	public double findArea() {
		return w*h;
	}
	public String kind() {
		return "사각형의";
	}
}
public class ShapeArray {
	public static void main(String[] args) {
		final int MAX_COUNT=100;
		Shape2[] shArr = new Shape2[MAX_COUNT];
		int idx=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1.원 2.사각형 3.보기 4.종료 ==>");
			int type=sc.nextInt();
			if(type==1 || type==2) {
				if(idx==MAX_COUNT) {
					System.out.println("더 이상 데이터를 저장할수 없습니다");
					continue;
				}
			}
			switch(type) {
				case 1:
					System.out.println("반지름입력");
					int r=sc.nextInt();
					
					shArr[idx++] = new Circle2(r);
					break;
				case 2:
					System.out.println("가로,세로 입력");
					int w=sc.nextInt();
					int h=sc.nextInt();
					shArr[idx++] = new Rect(w,h);
					
					break;
				case 3:
					if(idx==0) {
						System.out.println("조회할 데이터가 없습니다");
						//break;
						continue;
					}
					System.out.println("----보기----");
					for(int i=0;i<idx;i++) {
						double area=shArr[i].findArea();
						System.out.println(shArr[i].kind()+"면적 : " + area);
					}
					System.out.println();
					break;
				case 4:
					System.out.println("종료함!");
					return;
				default:
						System.out.println("잘못입력\n");
						continue;
			}
		
		}//while
		
	}

}
