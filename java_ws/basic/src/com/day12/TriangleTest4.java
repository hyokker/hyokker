package com.day12;

import java.util.Scanner;

class Triangle2{
	//1. �������
	int width;
	int height;
	
	//2. ������
	Triangle2(int p_width, int p_height){
		width=p_width;
		height=p_height;
	}
	//3. �޼���
	public double findArea() {
		return width * height/2.0;
	}
}
public class TriangleTest4 {

	public static void main(String[] args) {
		//[4] Ŭ���� �����, �޼��� ���� ȣ��(�������, ������ �����)
		Scanner sc = new Scanner(System.in);
		System.out.println("�غ�, ���� �Է�!");
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		
		Triangle2 tr = new Triangle2(w, h); // �����ڸ� �̿��� ������� �ʱ�ȭ
		double area = tr.findArea();
		
		System.out.println("\n���� : " + area);

	}

}
