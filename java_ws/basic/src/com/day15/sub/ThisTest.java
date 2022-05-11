package com.day15.sub;

/*
 this.������� : �ڽ��� ����� �����ϴ� this
 this() : �����ڸ� ȣ���ϴ� this()
 		  ���� Ŭ������ �ٸ� �����ڸ� ȣ���� �� ���
		  �ݵ�� �������� ù�ٿ����� ȣ�� ����
 */

class Car{
	private String color;
	private String gearType; //���ӱ� ���� = auto,manual
	private int door; //���� ����
	
	Car(String color, String gearType, int door){
		this.color=color;
		this.gearType=gearType;
		this.door=door;
	}
	
	Car(){
		this("white","auto",4); //�Ű������� 3���� ������ ȣ��
	}
		/*this.color="white"; 
		this.gearType="auto";
		this.door=4;*/
	
	
	Car(String color){
		this(color, "auto", 4);
		
	}
	public void showInfo() {
		System.out.println("���� : " + color);
		System.out.println("gearType: " + gearType);
		System.out.println("���� ���� : " + door+"\n");
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




