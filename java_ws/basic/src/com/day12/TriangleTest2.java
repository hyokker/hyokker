package com.day12;

import java.util.Scanner;

public class TriangleTest2 {
	public static double findArea(int w, int h) {
		double area = w*h/2.0;
		return area;
	}
	public static void main(String[] args) {
		//[2] �޼��常 ���� ȣ���Ͽ� ���� ���ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�غ�, ���� �Է�!");
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		double area = findArea(w, h);
		
		System.out.println("\n���� : "+ area);
	}

}
