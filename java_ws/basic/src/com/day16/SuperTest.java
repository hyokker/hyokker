package com.day16;

class Point{
	protected int x;
	protected int y;
	
	Point(int x, int y){
		//super();
		this.x=x;
		this.y=y;
	}
	
	public String findLocation() {
		return "x="+x+", y="+y;
	}
}
class Point3D extends Point{
	private int z;
	
	 Point3D(int x, int y, int z) {
		 //부모생성자의 매개변수가 있다면, 자식생성자를 만들때 부모생성자의 매개변수를 super() 안에 넣는다
		 super(x,y);
//		 super(); //부모생성자의 기본생성자를 호출함. 없어서 error
		 /*
		 super() - 부모 생성자 호출

		 @부모 생성자가 매개변수를 가지고 있다면 자식은 부모의 생성자에게 매개변수를 넣어줘야 함

		 @모든 클래스의 생성자 첫줄에는 생성자를 호출해야 한다.
		 @그렇지 않으면 컴파일러가 자동적으로 super()를 생성자의 첫줄에 넣어준다
		 */
		 this.z=z;
	}
	 
	 public String findLocation() {
		 return super.findLocation()+", z =" + z;
	 }
}

public class SuperTest {

	public static void main(String[] args) {
		Point3D p = new Point3D(10, 20, 30);
		String res = p.findLocation();
		System.out.println("3차원 점의 좌표 : " +res);

	}

}
