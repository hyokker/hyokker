package com.day12;

import java.util.Scanner;

class Triangle3{
	//1. �������
	private int width;
	private int height;
	
	//2. ������
	Triangle3(int p_width, int p_height){
		width=p_width;
		height=p_height;
	}
	
	//3.getter/setter
	public int getWidth() {
		return width;
	}
	public void setWidth(int w) {
		width=w;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int h) {
		height = h;
	}
	//4. �޼���
	public double findArea() {
		return width * height/2.0;
	}
}
public class TriangleTest5 {

	public static void main(String[] args) {
		//[4] Ŭ���� �����, �޼��� ���� ȣ��(�������, ������ �����)
		Scanner sc = new Scanner(System.in);
		System.out.println("�غ�, ���� �Է�!");
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		//(1) �����ڸ� �̿��� ������� �ʱ�ȭ
		Triangle3 tr = new Triangle3(w, h); // �����ڸ� �̿��� ������� �ʱ�ȭ
		double area = tr.findArea();
		
		System.out.println("\n���� : " + area);
		
		//(2) setter�� �̿��� ��������� �� ����
		tr.setWidth(30);
		tr.setHeight(40);
		
		System.out.println("\n\n������ �غ� : " + tr.getWidth());
		System.out.println("���� :" + tr.getHeight());
		System.out.println("�ﰢ�� ���� : " + tr.findArea());
	}	

}
