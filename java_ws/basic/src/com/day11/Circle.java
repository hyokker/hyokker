package com.day11;

public class Circle {
	//���� ��Ÿ���� Ŭ����
	//1.�������	-	��������, �Ӽ�, Ư¡
	int radius; //������
	
	//2.�޼���	-	�ൿ, ���
	//���� ���̸� ���ϴ� �޼���
	public double findArea() {
		double area = radius*radius*3.14;
		return area;
	}
	
	//���� �ѷ��� ���ϴ� �޼���
	public double findGirth() {
		double girth = 2*radius*3.14;
		return girth;
	}
}
