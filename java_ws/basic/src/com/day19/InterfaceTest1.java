package com.day19;

import java.util.Scanner;

/*
 �������̽� (interface)
 - ������ �߻� Ŭ����
 - �߻�޼���� ������� ����� ���� �� �ִ�
   �޼��� ��ϸ��� ������ Ÿ��
 - �ر׸��� �׷��� �ִ� �⺻ ���赵
 - �̸� ������ ��Ģ�� �°� �����ϵ��� ǥ���� �����ϴµ� ���
 - �������̽��� ���, ������ ������� �ּ����� �������� ����� ���̴�
 
   ��� ����� public static final �̾�� �ϸ�, ���� ����
   ��� �޼���� public abstract �̾�� �ϸ�, �̸� ������ �� �ִ�
   
 - �ڽ� Ŭ������ implements Ű���带 �̿��Ͽ� ����
 - �����ϴ� �������̽��� �޼��� �� �Ϻθ� �����Ѵٸ�, �ڽĵ� �߻� Ŭ������ ����Ǿ�� ��
   
 */

interface IAnimal{
	public abstract void sound();
	void display(); //���� ������ ���� ����
}


//IAnimal �������̽��� �����ϴ� �ڽ� Ŭ����
class Cat implements IAnimal{
	public void sound() {
		System.out.println("�߿�~!");
	}
	
	public void display() {
		System.out.println("Cat �޼���!");
	}
}
//IAnimal �������̽��� display() �� �������� �ʾ����Ƿ� �߻� Ŭ������ ��
abstract class Dog implements IAnimal{
	public void sound() {
		System.out.println("�۸�!!");
	}
	
}

class Cow implements IAnimal{
	public void sound() {
		System.out.println("����~!");
	}
	/*
	void display() { //error : �θ� �޼��带 �������̵��� �� ���� �����ڴ� �θ𺸴� ���ų�
							// �о�� �ϹǷ�
		System.out.println("Cow �޼���!");
	}*/
	public void display() {
		System.out.println("Cow �޼���!");
	}
}

public class InterfaceTest1 {

	public static void main(String[] args) {
		//IAnimal an = new IAnimal(); // error : �������̽��� ��ü���� �Ұ�
		Cat c = new Cat();
		c.sound();
		c.display();
		
		//Dog d = new Dog(); //error : �߻�Ŭ������ ��ü���� �Ұ�
		
		//������ �̿�
		IAnimal an = new Cow();
		an.sound();
		an.display();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n1.����� 2.�� 3.����");
		int type=sc.nextInt();
		
		IAnimal ani = null;
		if(type==1) {
			ani=new Cat();
		}else if(type==2) {
			ani=new Cow();
		}else if(type==3) {
			return;	
		}else {
			System.out.println("�߸��Է�!");
			return;
		}
		System.out.println("\n======������ �̿�=======");
		ani.sound();
		ani.display();
	}

}
