package com.day17;

import java.util.Scanner;

class Shape{
	public void draw() {
		System.out.println("������ �׸��� �޼���");
	}
	public void delete() {
		System.out.println("������ ����� �޼���");
	}
	public void display() {
		System.out.println("�θ� �޼���!");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("���� �׸���");
	}
	public void delete() {
		System.out.println("���� �����");
	}
	public void sayCircle() {
		System.out.println("������ �޼���");
	}
}

class Triangle extends Shape{
	public void draw() {
		System.out.println("�ﰢ���� �׸���");
	}
	public void delete() {
		System.out.println("�ﰢ����  �����");
	}
	public void sayTriangle() {
		System.out.println("�ﰢ������ �޼���");
	}
	
}
public class PolymoTest2 {

	public static void main(String[] args) {
		//�⺻ ����
		Circle c = new Circle();
		c.draw();
		c.delete();
		c.sayCircle();
		c.display();
		System.out.println();
		
		//������ �̿�
		Shape sh = new Circle();
		sh.draw();
		sh.delete();
		sh.display();
		//sh.sayCircle(); // error
		
		sh = new Triangle();
		sh.draw();
		sh.delete();
		
		//����ڷκ��� �Է� �޾Ƽ� ó��
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ����(1.�� 2.�ﰢ��)");
		int type=sc.nextInt();
		
		//�⺻����
		if(type==1) {
			Circle c2= new Circle();
			c2.draw();
			c2.delete();
			
		}else if(type==2) {
			Triangle tr = new Triangle();
			tr.draw();
			tr.delete();
		}else {
			System.out.println("�߸� ����!");
		}
		
		//������ �̿�
		Shape sh2=null;
		if(type==1) {
			sh2 = new Circle();
		}else if(type==2) {
			sh2 = new Triangle();
		}else {
			System.out.println("�߸��Է�!");
			return;
		}
		
		sh2.draw();
		sh2.delete();
		//
		System.out.println("\n======�޼��� �̿�=====");
		Shape sh3 =createShape(type);
		if(sh3!=null) {
			sh3.draw();
			sh3.delete();			
		}else {
			System.out.println("�߸��Է�!");
			return;
		}
	}//main
	
	//��ȯŸ���� �θ� Ŭ����(Shape)�̸� �ڽ� ��ü�� ���ϵȴ�.
	public static Shape createShape(int type) {
		//������ �̿�
		Shape sh2=null;
		if(type==1) {
			sh2 = new Circle();
		}else if(type==2) {
			sh2 = new Triangle();
		}
		
		return sh2;
	}
}
