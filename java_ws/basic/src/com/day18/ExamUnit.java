package com.day18;

abstract class Unit{
	protected int x, y; //현재 위치
	
	public abstract void move(int x,int y);
	
	public void stop() {
		System.out.println("현재위치에서 정지한다");
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
public class ExamUnit {

	public static void main(String[] args) {
		/*
		 Unit배열 만들고, 요소 4개 넣고
		 [1] 오버라이딩 메서드 호출
		 [2] 자식만의 메서드 호출
		 
		 for,확장 for 이용
		 */
		Unit[] arr = new Unit[4];
		
		arr[0]= new Marine();
		arr[1]= new Tank();
		arr[2]= new DropShip();
		arr[3]= new Marine();
		//arr[3]= new Unit(); //error
		System.out.println("=====오버라이딩 메서드=====");
		for(int i=0;i<arr.length;i++) {
			arr[i].move(100, 200);
		}
		
		System.out.println("\n");
		for(Unit u : arr) {
			u.move(10, 20);
		
		}
		
		System.out.println("\n=====자식만의 메서드=====");
		for(Unit u : arr) {
			if(u instanceof Marine) {
				Marine m = (Marine)u; 
				m.stimPack();
			}else if(u instanceof Tank) {
				Tank t = (Tank)u;
				t.changeMode();
			}else if(u instanceof DropShip) {
				DropShip d = (DropShip)u;
				d.load();
				d.unload();
			}
		}
		
		System.out.println("\n");
		for(int i=0;i<arr.length;i++) {
			if(arr[i] instanceof Marine) {
				Marine m = (Marine)arr[i]; 
				m.stimPack();
			}else if(arr[i] instanceof Tank) {
				Tank t = (Tank)arr[i];
				t.changeMode();
			}else if(arr[i] instanceof DropShip) {
				DropShip d = (DropShip)arr[i];
				d.load();
				d.unload();
			}
		}
	}

}
