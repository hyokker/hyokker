package com.day19;

interface Attackable{
	/**
	 * 지정된 대상을 공격하는 기능
	 * @param unit
	 */
	public abstract void attack(Unit unit);
}

interface Movable{
	/**
	 * 지정된 위치로 이동하는 기능
	 * @param x
	 * @param y
	 */
	void move(int x , int y);
}

//인터페이스끼리의 상속도 가능 - extends 키워드 이용, 다중상속이 가능함
interface Fightable extends Attackable, Movable{
	
}
abstract class Unit{
	protected int x,y; // 유닛의 위치
	protected int currentHP; //유닛의 체력
	
	Unit(int x, int y, int currentHP){
		this.x=x;
		this.y=y;
		this.currentHP=currentHP;
	}
}

class Fighter extends Unit implements Fightable{
	public Fighter(int x,int y, int currentHP) {
		super(x,y,currentHP);
	}
	
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+", "+y+" 위치로 이동합니다");
	}
	
	public void attack(Unit u) {
		System.out.println( u.x+ ", " + u.y+ "위치에 있고,"
				+u.currentHP  +  "의 체력을 갖는 유닛을 공격합니다.");	
	}
}
public class UnitTest {
	public static void main(String[] args) {
		Fighter f = new Fighter(10, 20, 350);
		f.move(30, 40);
		
		System.out.println();
		//f가 30,40위치에 있고, 체력이 240인 유닛을 공격하고, 70,80 위치로 이동
		f.attack(new Fighter(30,40,240));
		f.move(70, 80);
		
		System.out.println();
		//f가 70,80위치에 있고, 체력이 100인 유닛을 공격한다
		Unit u = new Fighter(70, 80, 100);
		f.attack(u);
		
		//자식은 부모의 인스턴스이기도 하다
		if(f instanceof Unit) {
			System.out.println("f는 Unit의 인스턴스!");
		}
		if(f instanceof Object) {
			System.out.println("f는 Object의 인스턴스!");
		}
		if(f instanceof Fightable) {
			System.out.println("f는 Fightable 인터페이스를 구현했다");
		}
		if(f instanceof Movable) {
			System.out.println("f는 Movable 인터페이스를 구현했다");
		}
		if(f instanceof Attackable) {
			System.out.println("f는 Attackable 인터페이스를 구현했다");
		}
	}

}
