package com.day8;

import java.util.Scanner;

public class MethodExample {
	public static float toCm(float inch) {
		float a = inch*2.54f;
		return a;
	
	}
	
	public static float toInch(float cm) {
		float a = cm/2.54f;
		return a;
	}
	
	
	public static double angle(double a, double b) {
		
		double angle = (a*b)/2;
		return angle;
		
	}
	public static void main(String[] args) {
		
		
		System.out.println("��ȯ �Ϸ��� inch�� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		float i = sc.nextFloat();
		float cm=toCm(i);
		
		System.out.println(i + " inch =>" +cm +"cm");
		
		System.out.println("\n ��ȯ�Ϸ��� cm�� �Է��ϼ���");
		float a = sc.nextFloat();
		float inch = toInch(a);
		
		System.out.println(a + " cm =>"+ inch + "inch");
		
		
		System.out.println("�ﰢ���� �غ��� ���̿� ���̸� �Է��ϼ���");
		double d = sc.nextDouble();
		double width = sc.nextDouble();
		
		double dw= angle(d, width);
		System.out.println("�ﰢ���� ����="+ dw);
		
		sc.close();
		
	}

}
