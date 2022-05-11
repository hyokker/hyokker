package com.day24;
/*
		 Cloneable �������̽��� ������ Ŭ������ �ν��Ͻ���
		 clone() �� ���� ������ ������
 */

class Point implements Cloneable{
	int x;
	int y;
	
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public String toString() {
		return "Point[x="+x+", y="+y+"]";
	}
	
	public Point copy() {
		Object obj = null;
		
		try {
			//Objext clone() throws CloneNotSupportedException)
			obj=clone();
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return (Point)obj;
		
	}
}
public class CloneTest {

	public static void main(String[] args) {
		Point p = new Point(10, 35);
		Point p2 = p.copy();
		System.out.println("p="+ p);
		System.out.println("������ p2=" + p2);
		
		System.out.println("p �ּ�:" + System.identityHashCode(p));
		System.out.println("p2 �ּ�:" + System.identityHashCode(p2));
		
		p.x++;
		p.y++;
		System.out.println("p�� ������� ���� �� p =" + p);
		System.out.println("p�� ������� ���� �� p2 =" + p2);
	}

}
