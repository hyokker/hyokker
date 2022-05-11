package com.day17;

import java.util.Scanner;

class Animal {
	public void bark() {
		System.out.println("���");
	}

	public void parent() {
		System.out.println("�� �θ�-����");
	}
}

class Cat extends Animal {
	public void bark() {
		System.out.println("�߿˾߿�");
	}

	public void child() {
		System.out.println("�� �ڽ�-�����");
	}
}

class Cow extends Animal {
	public void bark() {
		System.out.println("��������");
	}
}

class Dog extends Animal {
	public void bark() {
		System.out.println("�۸�");
	}
}

public class ExamPolymo1 {

	public static void main(String[] args) {
		//1. �⺻ ����
		//Dog ��ü���� , �޼��� ȣ��
		Dog d = new Dog();
		d.bark();
		//2. ������ �̿�
		//Cat, Cow
		Animal a = new Cat();
		a.bark();
		
		Animal a2 = new Cow();
		a2.bark();
		//3. ����� �Է� �޾Ƽ� ����
		//==>1.Cat 2.Cow 3.Dog ����
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�(1.Cat, 2.Cow, 3.Dog)");
		int type=sc.nextInt();
		
		Animal a3 =null;
		if(type==1) {
		a3=new Cat();	
		}else if(type==2){
		a3=new Cow();	
		}else if(type==3){
		a3=new Dog();	
		}else {
			System.out.println("�߸��Է�");
			return;
		}
		a3.bark();
		//�޼��� ȣ��
		//bark �޼��� ȣ��
		Animal an = createAnimal(type);
		if(an!=null) {
		an.bark();
		}
		//Animal �迭 �����, ��� 3�� �ְ�,bark() �޼��� ȣ�� - for, Ȯ�� for
		Animal[] arr = new Animal[3];
		arr[0]=new Cat();
		arr[1]=new Cow();
		arr[2]=new Dog();
		System.out.println("\n======������ �̿�======");
		for(int i=0;i<arr.length;i++) {
			arr[i].bark();
		}
		System.out.println("\n=====Ȯ�� for�� �̿�=====");
		for(Animal ani : arr) {
			ani.bark();
		}
		
	}
	
	//�޼��� �����
	
	public static Animal createAnimal(int type) {
		Animal an = null;
		if(type==1) {
			an= new Cat();
		}else if(type==2){
			an= new Cow();
		}else if(type==3) {
			an= new Dog();
		}
		return an;
	}

}
