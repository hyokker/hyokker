package com.day18.abs;
/*
 [1] �߻� �޼���(Abstract Method)
 - ��ü ���� �޼���, �̿ϼ� �޼���
 - �޼����� �����ΰ� ���ٴ� �� - �޼��� {} ���� �����ϰ� ���� �ʰ�,
 ����θ�(������Ÿ��) ����
 
 	public abstract int �޼����();
 	
 - �޼����� ������ ��ӹ޴� Ŭ������ ���� �޶��� �� �ֱ� ������
 �θ� Ŭ���������� ����θ� �ۼ��ϰ� ���� ������ ��ӹ޴� �ڽ� Ŭ�������� �����ϵ��� �ϴ� �� 
 
 
 
 [2]�߻� Ŭ���� (Abstract Class)
 - �̿ϼ� Ŭ����, �κ������θ� �ϼ��� Ŭ����
 - �̿ϼ� �޼��带 �����ϰ� �ִٴ� �ǹ�
 - ��ü ���� �Ұ�
 - �θ� Ŭ������ �ʿ��� �޼��带 �߻������� ������ �� ��ü������ ��� ������ ���ΰ��� 
 �ڽ� Ŭ�������� �������� ��
 
 abstract class Ŭ������{
 
 }
 
 �߻� Ŭ������ ����� �� ��� �߻�޼������ �������� �� ��ü�� ������ �� �ִ�
 �߻� Ŭ������ �Ǵ� ���
 1) �߻� �޼��带 �ϳ��� �����ϰ� �ִ� Ŭ����
 2) �߻�޼��带 �����ϰ� ���� �ʴ��� Ŭ���� ������ �� abstract Ű���带 ���� ���
 
 �߻� Ŭ����
 - ����� ���踦 �����ϱ� ���� �θ� Ŭ������ �ν��Ͻ�ȭ��Ű�� ���ؼ� ������ Ŭ������ �ƴ� ���
   �߻� Ŭ������ �����
   
 �߻� �޼���
 - �������̵� ���Ը� �����ϱ� ���� ���ǵ� �޼���, ����ִ� �޼���� �߻� �޼���� �����.
 */

abstract class Animal{
	public abstract void sound();
}

class Dog extends Animal{
	public void sound() {
		System.out.println("�۸�!");
	}
}
/*
 �ڽ� Ŭ�������� �߻� �޼��带 ��� ������ ���� ������ �ڽ�Ŭ������ �߻�޼��带
 �����ϰ� �ǹǷ� �߻�Ŭ������ �� 
 */
abstract class Mammal extends Animal{
	public void breed(int n) {
		System.out.println(n+ "���� ������ ���´�");
	}
}
class Cow extends Mammal{
	public void sound() {
		System.out.println("����!");
	}
}
public class AbstractMethod {

	public static void main(String[] args) {
//		Animal an= new Animal(); // error : �߻� Ŭ������ ��ü ���� �Ұ�
		Dog d = new Dog();
		d.sound();
		
		Animal an = new Dog();	 //�߻�Ŭ������ �������� ����
		an.sound();
		
		//Mammal m = new Mammal(); // error
		Mammal m = new Cow();
		m.sound();
		m.breed(2);
	
	
	}

}
