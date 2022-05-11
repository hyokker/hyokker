package com.day12;

import java.util.Scanner;

class Circle {
	//���� ��Ÿ���� Ŭ����
	//1. ������� - ��������, �Ӽ�, Ư¡
	int radius;  //������	
	
	
	//2. ������ - ������� �ʱ�ȭ
	Circle(int p_radius){
		radius=p_radius;
	}
	
	//3. �޼��� - �ൿ, ���
	//���� ���̸� ���ϴ� �޼���
	public double findArea() {
		double area = radius*radius*3.14;
		return area;
	}
	
	//���� �ѷ��� ���ϴ� �޼���
	public double findGirth() {
		double girth=2*radius*3.14;
		return girth;
	}
}

public class CircleTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է�");
		int r = sc.nextInt();
		
		//�����ڸ� �̿��ؼ� ��������� �� �ʱ�ȭ
		Circle c = new Circle(r);
		double area=c.findArea();
		double girth=c.findArea();
		
		System.out.println("���� ���� : "+ area +", ���ǵѷ� : " + girth);
		
		
		//��������� ���� ������ ���� �ִ�.
		c.radius = 20;
		area=c.findArea();
		System.out.println("\n������ ���� �� ���� ���� :" + area);
	}

}
