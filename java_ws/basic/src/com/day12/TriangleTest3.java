package com.day12;

import java.util.Scanner;

class Triangle1{
	public  double findArea(int w, int h) {
		double area = w*h/2.0;
		return area;
	}
}

public class TriangleTest3 {

	public static void main(String[] args) {
		//[3] class�� ���� �����, �޼��� ���� ȣ��(��������� ���� �޼���)
		Triangle1 tr = new Triangle1();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�غ� ���� �Է�!");
		int w = sc.nextInt();
		int h = sc.nextInt();
		double area = tr.findArea(w, h);
		System.out.println("���� : "+ area);
	
	}
}
