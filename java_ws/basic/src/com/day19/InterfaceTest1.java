package com.day19;

import java.util.Scanner;

/*
 인터페이스 (interface)
 - 일종의 추상 클래스
 - 추상메서드와 상수만을 멤버로 가질 수 있다
   메서드 목록만을 가지는 타입
 - 밑그림만 그려져 있는 기본 설계도
 - 미리 정해진 규칙에 맞게 구현하도록 표준을 제시하는데 사용
 - 인터페이스는 계약, 일종의 약속으로 최소한의 계약사항을 명시할 뿐이다
 
   모든 상수는 public static final 이어야 하며, 생략 가능
   모든 메서드는 public abstract 이어야 하며, 이를 생략할 수 있다
   
 - 자식 클래스는 implements 키워드를 이용하여 구현
 - 구현하는 인터페이스의 메서드 중 일부만 구현한다면, 자식도 추상 클래스로 선언되어야 함
   
 */

interface IAnimal{
	public abstract void sound();
	void display(); //접근 제한자 생략 가능
}


//IAnimal 인터페이스를 구현하는 자식 클래스
class Cat implements IAnimal{
	public void sound() {
		System.out.println("야옹~!");
	}
	
	public void display() {
		System.out.println("Cat 메서드!");
	}
}
//IAnimal 인터페이스의 display() 는 구현하지 않았으므로 추상 클래스가 됨
abstract class Dog implements IAnimal{
	public void sound() {
		System.out.println("멍멍!!");
	}
	
}

class Cow implements IAnimal{
	public void sound() {
		System.out.println("음메~!");
	}
	/*
	void display() { //error : 부모 메서드를 오버라이딩할 때 접근 제한자는 부모보다 같거나
							// 넓어야 하므로
		System.out.println("Cow 메서드!");
	}*/
	public void display() {
		System.out.println("Cow 메서드!");
	}
}

public class InterfaceTest1 {

	public static void main(String[] args) {
		//IAnimal an = new IAnimal(); // error : 인터페이스는 객체생성 불가
		Cat c = new Cat();
		c.sound();
		c.display();
		
		//Dog d = new Dog(); //error : 추상클래스는 객체생성 불가
		
		//다형성 이용
		IAnimal an = new Cow();
		an.sound();
		an.display();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n1.고양이 2.소 3.종료");
		int type=sc.nextInt();
		
		IAnimal ani = null;
		if(type==1) {
			ani=new Cat();
		}else if(type==2) {
			ani=new Cow();
		}else if(type==3) {
			return;	
		}else {
			System.out.println("잘못입력!");
			return;
		}
		System.out.println("\n======다형성 이용=======");
		ani.sound();
		ani.display();
	}

}
