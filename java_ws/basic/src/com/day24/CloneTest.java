package com.day24;
/*
		 Cloneable 인터페이스를 구현한 클래스의 인스턴스만
		 clone() 을 통한 복제가 가능함
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
		System.out.println("복제한 p2=" + p2);
		
		System.out.println("p 주소:" + System.identityHashCode(p));
		System.out.println("p2 주소:" + System.identityHashCode(p2));
		
		p.x++;
		p.y++;
		System.out.println("p의 멤버변수 변경 후 p =" + p);
		System.out.println("p의 멤버변수 변경 후 p2 =" + p2);
	}

}
