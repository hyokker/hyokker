package com.day14;

public class Circle {
		//���� ��Ÿ���� Ŭ����
		//1. ������� - ��������, �Ӽ�, Ư¡
		private int radius;  //������	
		
		
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

