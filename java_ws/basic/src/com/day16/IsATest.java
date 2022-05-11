package com.day16;

/*
 Ŭ������ ���� �ϴ� ���
 [1] ��� �̿�
 	is a ���谡 �����ϸ� ����� �̿��Ѵ�
 	~is a ~
 	=> ~�� ������ ~�̴� 
 	��)SportsCar is a Car
 	
 [2] ���� ���� �̿�
  	has a ���谡 �����ϸ� ���� ���踦 �̿��Ѵ�.
  	~has a ~
  	=> ~�� ~�� ������ �ִ�
  	��) Circle has a Point
 */

class Points{
	protected int x;
	protected int y;
	
	Points(int x, int y) {
		this.x=x;
		this.y=y;
	}
}

class Circle extends Points{
	private int r;
	
	Circle(int x, int y,int r){
		super(x,y);
		this.r=r;
	}
	
	public void printInfo() {
		System.out.println("x=" +x +", y ="+y);
		System.out.println("r=" +r +"\n");
	}
	
	
}
public class IsATest {

	public static void main(String[] args) {
		Circle c = new Circle(10,20,5);
		c.printInfo();
	}

}
