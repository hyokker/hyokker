package com.day15.sub;

/*
 this.멤버변수 : 자신의 멤버를 참조하는 this
 this() : 생성자를 호출하는 this()
 		  같은 클래스의 다른 생성자를 호출할 때 사용
		  반드시 생성자의 첫줄에서만 호출 가능
 */

class Car{
	private String color;
	private String gearType; //변속기 종류 = auto,manual
	private int door; //문의 개수
	
	Car(String color, String gearType, int door){
		this.color=color;
		this.gearType=gearType;
		this.door=door;
	}
	
	Car(){
		this("white","auto",4); //매개변수가 3개인 생성자 호출
	}
		/*this.color="white"; 
		this.gearType="auto";
		this.door=4;*/
	
	
	Car(String color){
		this(color, "auto", 4);
		
	}
	public void showInfo() {
		System.out.println("색상 : " + color);
		System.out.println("gearType: " + gearType);
		System.out.println("문의 개수 : " + door+"\n");
	}
	
}
public class ThisTest {
	public static void main(String[] args) {
		Car c1= new Car();
		c1.showInfo();

		Car c2= new Car("Black");
		c2.showInfo();
		
		Car c3= new Car("Red","manual",2);
		c3.showInfo();
	}
}




