package com.day17;

class Unit{
	protected int x, y; //���� ��ġ
	
	public void move(int x,int y) {
		System.out.println("�̵� �޼���");
	}
	
	public void stop() {
		System.out.println("���� �޼���");
	}
}

class Marine extends Unit{
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
		
		System.out.println("������ " + x + ", " + y +"��ġ�� �̵��Ѵ�");
	}
	
	public void stimPack() {
		System.out.println("������ ���");
	}
}

class Tank extends Unit{
	public void move(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println("��ũ�� " + x + ", " + y +"��ġ�� �̵��Ѵ�");
	}
	
	public void changeMode() {
		System.out.println("���� ��带 ��ȯ�Ѵ�");
	}
}

class DropShip extends Unit{
	public void move(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println("���ۼ��� " + x + ", " + y +"��ġ�� �̵��Ѵ�");
	}
	
	public void load() {
		System.out.println("������ ����� �¿��");
	}
	
	public void unload() {
		System.out.println("������ ����� ������.");
	}
}
public class PolymoArray {

	public static void main(String[] args) {
		//Unit �迭 �����, ��� 4�� �ְ� move()�޼��� ȣ��
		Unit[] u = new Unit[4];
		u[0]=new Marine();
		u[1]=new Tank();
		u[2]=new DropShip();
		u[3]=new Marine();
		
		for(int i=0;i<u.length;i++) {
			u[i].move(100, 200);
		}
		
		System.out.println("\n=====Ȯ�� for �� ��� =====");
		for(Unit u2 : u) {
			u2.move(200, 300);
		}
	}

}
