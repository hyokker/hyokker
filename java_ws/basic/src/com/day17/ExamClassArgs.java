package com.day17;

class AAA{
	public void method1(Cat c) {
		c.bark();
	}
	public void method2(Animal an) {
		an.bark();
	}
	
	public Cat method3() { //=>Cat �� ���ϵȴ�
		return  new Cat();
	}
	public Animal method4() { //=>�θ� �ڽ��� �ִ´�> Cow �� ���ϵȴ�
		return  new Cow();
		
	}
}

public class ExamClassArgs {

	public static void main(String[] args) {
		//�� �޼��� ȣ��
		AAA a = new AAA();
		a.method1(new Cat());
		
		a.method2(new Cow());
		
		Cat c =a.method3();
		
		
		Animal an=a.method4();
		
		
	}

}
