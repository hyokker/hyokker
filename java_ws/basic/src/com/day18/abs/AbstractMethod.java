package com.day18.abs;
/*
 [1] 추상 메서드(Abstract Method)
 - 몸체 없는 메서드, 미완성 메서드
 - 메서드의 구현부가 없다는 것 - 메서드 {} 블럭을 포함하고 있지 않고,
 선언부만(프로토타입) 존재
 
 	public abstract int 메서드명();
 	
 - 메서드의 내용이 상속받는 클래스에 따라 달라질 수 있기 때문에
 부모 클래스에서는 선언부만 작성하고 실제 내용은 상속받는 자식 클래스에서 구현하도록 하는 것 
 
 
 
 [2]추상 클래스 (Abstract Class)
 - 미완성 클래스, 부분적으로만 완성된 클래스
 - 미완성 메서드를 포함하고 있다는 의미
 - 객체 생성 불가
 - 부모 클래스는 필요한 메서드를 추상적으로 정의할 뿐 구체적으로 어떻게 구현할 것인가는 
 자식 클래스에게 결정권을 줌
 
 abstract class 클래스명{
 
 }
 
 추상 클래스를 상속한 후 모든 추상메서드들을 구현했을 때 객체를 생성할 수 있다
 추상 클래스가 되는 방법
 1) 추상 메서드를 하나라도 포함하고 있는 클래스
 2) 추상메서드를 포함하고 있지 않더라도 클래스 선언할 때 abstract 키워드를 붙인 경우
 
 추상 클래스
 - 상속의 관계를 형성하기 위한 부모 클래스로 인스턴스화시키기 위해서 정의한 클래스가 아닌 경우
   추상 클래스로 만든다
   
 추상 메서드
 - 오버라이딩 관게를 형성하기 위해 정의된 메서드, 비어있는 메서드는 추상 메서드로 만든다.
 */

abstract class Animal{
	public abstract void sound();
}

class Dog extends Animal{
	public void sound() {
		System.out.println("멍멍!");
	}
}
/*
 자식 클래스에서 추상 메서드를 모두 구현해 주지 않으면 자식클래스도 추상메서드를
 포함하게 되므로 추상클래스가 됨 
 */
abstract class Mammal extends Animal{
	public void breed(int n) {
		System.out.println(n+ "마리 새끼를 낳는다");
	}
}
class Cow extends Mammal{
	public void sound() {
		System.out.println("음메!");
	}
}
public class AbstractMethod {

	public static void main(String[] args) {
//		Animal an= new Animal(); // error : 추상 클래스는 객체 생성 불가
		Dog d = new Dog();
		d.sound();
		
		Animal an = new Dog();	 //추상클래스도 다형성은 가능
		an.sound();
		
		//Mammal m = new Mammal(); // error
		Mammal m = new Cow();
		m.sound();
		m.breed(2);
	
	
	}

}
