package com.day12;

import com.day11.BBB;

/*
	접근 제한자(접근 제어자)
  -	멤버나 클래스에 사용되어, 외부에서 접근하지 못하도록 제한하는 역할
  -	클래스 내부의 멤버를 노출하거나 숨길 때 사용
  
  private - 같은 클래스 내에서만 접근 가능
  default (생략형) - 같은 패키지 내에서만 접근 가능
  protected - 같은 패키지는 물론, 다른 패키지일지라도 상속관계가 있으면 접근 가능
  public - 어디서나 접근 가능


  private < default < protected < public
  
  클래스 - public, default 만 사용가능
  메서드, 멤버변수 - public , protected, default, private
  지역변수 - 사용불가
 
  멤버변수는 private로 지정
  메서드는 public으로 지정
 */
public class PrivateTest {

	public static void main(String[] args) {
		AAA obj = new AAA();
		obj.showInfo();
		
//		obj.x=20; //error : The field AAA.x is not visible
		obj.y=1;
		obj.z=2;
		obj.n=3;
		
		obj.showInfo();//private 제외 나머지 사용 가능
		
		BBB b = new BBB();
		b.showInfo();
		
//		b.x=11; //The field BBB.x is not visible
//		b.y=12;
//		b.z=13;
		b.n=14;
	
	}

}
