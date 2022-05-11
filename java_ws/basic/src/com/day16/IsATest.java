package com.day16;

/*
 클래스를 재사용 하는 방법
 [1] 상속 이용
 	is a 관계가 성립하면 상속을 이용한다
 	~is a ~
 	=> ~는 일종의 ~이다 
 	예)SportsCar is a Car
 	
 [2] 포함 관계 이용
  	has a 관계가 성립하면 포함 관계를 이용한다.
  	~has a ~
  	=> ~는 ~를 가지고 있다
  	예) Circle has a Point
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
