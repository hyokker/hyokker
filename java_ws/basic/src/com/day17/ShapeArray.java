package com.day17;

import java.util.Scanner;

class Shape2{
	public double findArea() {
		return 0;
	}
	public String kind() {
		return "������ ����";
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
		return "����";
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
		return "�簢����";
	}
}
public class ShapeArray {
	public static void main(String[] args) {
		final int MAX_COUNT=100;
		Shape2[] shArr = new Shape2[MAX_COUNT];
		int idx=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1.�� 2.�簢�� 3.���� 4.���� ==>");
			int type=sc.nextInt();
			if(type==1 || type==2) {
				if(idx==MAX_COUNT) {
					System.out.println("�� �̻� �����͸� �����Ҽ� �����ϴ�");
					continue;
				}
			}
			switch(type) {
				case 1:
					System.out.println("�������Է�");
					int r=sc.nextInt();
					
					shArr[idx++] = new Circle2(r);
					break;
				case 2:
					System.out.println("����,���� �Է�");
					int w=sc.nextInt();
					int h=sc.nextInt();
					shArr[idx++] = new Rect(w,h);
					
					break;
				case 3:
					if(idx==0) {
						System.out.println("��ȸ�� �����Ͱ� �����ϴ�");
						//break;
						continue;
					}
					System.out.println("----����----");
					for(int i=0;i<idx;i++) {
						double area=shArr[i].findArea();
						System.out.println(shArr[i].kind()+"���� : " + area);
					}
					System.out.println();
					break;
				case 4:
					System.out.println("������!");
					return;
				default:
						System.out.println("�߸��Է�\n");
						continue;
			}
		
		}//while
		
	}

}
