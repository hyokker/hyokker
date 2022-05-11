package com.day17;

class Unit{
	protected int x, y; //현재 위치
	
	public void move(int x,int y) {
		System.out.println("이동 메서드");
	}
	
	public void stop() {
		System.out.println("정지 메서드");
	}
}

class Marine extends Unit{
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
		
		System.out.println("보병이 " + x + ", " + y +"위치로 이동한다");
	}
	
	public void stimPack() {
		System.out.println("스팀팩 사용");
	}
}

class Tank extends Unit{
	public void move(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println("탱크가 " + x + ", " + y +"위치로 이동한다");
	}
	
	public void changeMode() {
		System.out.println("공격 모드를 변환한다");
	}
}

class DropShip extends Unit{
	public void move(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println("수송선이 " + x + ", " + y +"위치로 이동한다");
	}
	
	public void load() {
		System.out.println("선택한 대상을 태운다");
	}
	
	public void unload() {
		System.out.println("선택한 대상을 내린다.");
	}
}
public class PolymoArray {

	public static void main(String[] args) {
		//Unit 배열 만들고, 요소 4개 넣고 move()메서드 호출
		Unit[] u = new Unit[4];
		u[0]=new Marine();
		u[1]=new Tank();
		u[2]=new DropShip();
		u[3]=new Marine();
		
		for(int i=0;i<u.length;i++) {
			u[i].move(100, 200);
		}
		
		System.out.println("\n=====확장 for 문 사용 =====");
		for(Unit u2 : u) {
			u2.move(200, 300);
		}
	}

}
