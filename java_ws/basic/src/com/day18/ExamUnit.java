package com.day18;

abstract class Unit{
	protected int x, y; //���� ��ġ
	
	public abstract void move(int x,int y);
	
	public void stop() {
		System.out.println("������ġ���� �����Ѵ�");
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
public class ExamUnit {

	public static void main(String[] args) {
		/*
		 Unit�迭 �����, ��� 4�� �ְ�
		 [1] �������̵� �޼��� ȣ��
		 [2] �ڽĸ��� �޼��� ȣ��
		 
		 for,Ȯ�� for �̿�
		 */
		Unit[] arr = new Unit[4];
		
		arr[0]= new Marine();
		arr[1]= new Tank();
		arr[2]= new DropShip();
		arr[3]= new Marine();
		//arr[3]= new Unit(); //error
		System.out.println("=====�������̵� �޼���=====");
		for(int i=0;i<arr.length;i++) {
			arr[i].move(100, 200);
		}
		
		System.out.println("\n");
		for(Unit u : arr) {
			u.move(10, 20);
		
		}
		
		System.out.println("\n=====�ڽĸ��� �޼���=====");
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
