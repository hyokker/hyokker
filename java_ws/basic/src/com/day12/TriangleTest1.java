package com.day12;

import java.util.Scanner;

public class TriangleTest1 {

	public static void main(String[] args) {
		//�ﰢ�� ���� ���ϱ�
		//[1]main()���� ���� ���� ���ϱ�
		//1.����ڷκ��� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("�ﰢ���� �غ�, ���� �Է�!");
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		//2.����Ͻ� ���� ó�� - �ﰢ�� ����
		double area = w*h/2.0;
		
		//3.��� ���
		System.out.println("�ﰢ�� ���� :"+ area);
		
	}

}
