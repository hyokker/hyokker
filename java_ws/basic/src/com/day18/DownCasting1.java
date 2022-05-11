package com.day18;

/*
  참조형 변수도 형변환이 가능
  단, 서로 상속관계에 있는 클래스 사이에서만 가능
  
  부모 타입 <- 자식 타입 (up-casting, 다형성, 자동형변환)
  자식타입의 참조변수를 부모 타입으로 형변환 하는 경우에는 형변환 생략가능
  
  자식 타입 <- 부모 타입 (Down-casting, 명시적 형변환, 형변환 생략 불가)
  
  Parent p = new Child(); // 자동형변환
  Child ch = (Child)p; // 명시적 형변환
  
  Child c = (Child)new Parent(); // 실행에러 ( 컴파일은 됨)
 */


class Car{
	protected String color;
	protected int door;
	
	public void drive() {
		System.out.println("drive~");
	}
	public void stop() {
		System.out.println("stop");
	}
	
}

class FireEngine extends Car{ //소방자
	public void water() {
		System.out.println("water!!");
	}
	public void drive() {
		System.out.println("소방차를 운전합니다");
	}
}

class Ambulance extends Car{
	public void siren() {
		System.out.println("siren~~");
	}
	public void drive() {
		System.out.println("구급차를 운전합니다");
	}
}
public class DownCasting1 {

	public static void main(String[] args) {
		Car c = new FireEngine(); //업캐스팅, 다형성, 자동형변환
		c.drive();
		//c.water(); // error: 자식만의 메서드 호출불가!
		
		FireEngine f = (FireEngine)c; // 다운 캐스팅, 명시적 형변환
		f.water(); // 자식만의 메서드 호출 가능해짐
		
		//FireEngine fe = (FireEngine)new Car(); // 컴파일은 되나 실행 에러 발생
		//ClassCastException : Car cannot be cast to class FireEngine 
	
	
		c = new Ambulance();
		Ambulance am = (Ambulance)c;
		am.siren();
		
		/*
		  instanceof 연산자 - 참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해 사용
		  
		  참조변수 instanceof 타입(클래스명)
		  => 참조변수가 해당 클래스의 인스턴스인지 확인, 맞으면 true, 아니면 false리턴
		  		  
		  true이면 참조변수가 검사한 타입으로 형변환이 가능하다는 의미
		 */
		System.out.println("\n========");
		if(c instanceof FireEngine) {
			FireEngine f2 = (FireEngine)c;
			f2.water();
		}else if(c instanceof Ambulance) {
			Ambulance am2 = (Ambulance)c;
			am2.siren();
		}else {
			System.out.println("형변환 불가!");
		}
		
		Car c2 = new Car();
		if(c2 instanceof FireEngine) {
			FireEngine f2 = (FireEngine)c;
			f2.water();
		}else {
			System.out.println("형변환 불가!");
		}
		
		/*
		 자식 instanceof 부모 : true
		 => 자식은 부모의 인스턴스이기도하므로 
		 */
		
		FireEngine f3 = new FireEngine();
		if(f3 instanceof FireEngine) {
			System.out.println("\nf3는 FireEngine의 인스턴스!");
		}
		if(f3 instanceof Car) {
			System.out.println("f3는 Car의 인스턴스이기도하다!");
		}
		if(f3 instanceof Object) {
			System.out.println("f3는 Object의 인스턴스이기도 하다!");
		}
		
	}

}
