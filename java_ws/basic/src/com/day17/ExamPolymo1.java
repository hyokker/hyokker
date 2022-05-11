package com.day17;

import java.util.Scanner;

class Animal {
	public void bark() {
		System.out.println("울다");
	}

	public void parent() {
		System.out.println("난 부모-동물");
	}
}

class Cat extends Animal {
	public void bark() {
		System.out.println("야옹야옹");
	}

	public void child() {
		System.out.println("난 자식-고양이");
	}
}

class Cow extends Animal {
	public void bark() {
		System.out.println("음메음메");
	}
}

class Dog extends Animal {
	public void bark() {
		System.out.println("멍멍");
	}
}

public class ExamPolymo1 {

	public static void main(String[] args) {
		//1. 기본 사용법
		//Dog 객체생성 , 메서드 호출
		Dog d = new Dog();
		d.bark();
		//2. 다형성 이용
		//Cat, Cow
		Animal a = new Cat();
		a.bark();
		
		Animal a2 = new Cow();
		a2.bark();
		//3. 사용자 입력 받아서 차리
		//==>1.Cat 2.Cow 3.Dog 선택
		Scanner sc = new Scanner(System.in);
		System.out.println("동물 입력(1.Cat, 2.Cow, 3.Dog)");
		int type=sc.nextInt();
		
		Animal a3 =null;
		if(type==1) {
		a3=new Cat();	
		}else if(type==2){
		a3=new Cow();	
		}else if(type==3){
		a3=new Dog();	
		}else {
			System.out.println("잘못입력");
			return;
		}
		a3.bark();
		//메서드 호출
		//bark 메서드 호출
		Animal an = createAnimal(type);
		if(an!=null) {
		an.bark();
		}
		//Animal 배열 만들고, 요소 3개 넣고,bark() 메서드 호출 - for, 확장 for
		Animal[] arr = new Animal[3];
		arr[0]=new Cat();
		arr[1]=new Cow();
		arr[2]=new Dog();
		System.out.println("\n======다형성 이용======");
		for(int i=0;i<arr.length;i++) {
			arr[i].bark();
		}
		System.out.println("\n=====확장 for문 이용=====");
		for(Animal ani : arr) {
			ani.bark();
		}
		
	}
	
	//메서드 만들기
	
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
