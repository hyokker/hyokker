package com.day17;

  /*
 	������(Polymorphism)
 	-�������� ���¸� ���� �� �ִ� �ɷ�
 	-�θ� Ÿ���� ���������� �ڽ��� �ν��Ͻ��� ������ �� �ֵ��� �����ν� �������� ����
 	-���� ���� �������� Ŭ������ �ϳ��� �θ� Ŭ���� ��ü�� ���� �����Ͽ� �� ȿ������ ���� ��
 	
  
  */

class Parent{
	public void parentFunc() {
		System.out.println("�θ��� �޼���!");
	}
	
	public void showInfo() {
		System.out.println("Parent - showInfo()");
	}
}

class Child extends Parent{
	public void showInfo() {
		System.out.println("Child - showInfo() �������̵� �޼���");
	} 
	public void childFunc() {
		System.out.println("�ڽĸ��� �޼���!!");
	}
}
public class PolymoTest {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.showInfo();
		ch.parentFunc();
		ch.childFunc();
		
		//������
		Parent p = new Child();//�θ��� ���������� �ڽ��� �ν��Ͻ� ����
		//�θ� �ڽ� ����(�θ� �ڽ��� �ִ´�)
		p.showInfo(); //�θ��� ���������� �ڽ��� �������̵� �޼��� ȣ��
		p.parentFunc(); // �θ��� ���������δ� �θ��� �޼��常 ȣ�Ⱑ��
		//p.childFunc(); //error : �θ��� ���������� �ڽĸ��� �޼���� ȣ�� �Ұ�!
	}
		/*
		 ������
		 -[1] �θ� �ڽ��� ������
		 -[2] �θ��� ���������δ� �θ��� ����鸸 ��� ����
		  ��, �������̵� �޼����� ���� �ڽ��� �������̵� �޼��尡 ȣ���!
		  (�ڽĸ��� �޼���� ȣ�� �Ұ�)
		 */
		//=> �θ��� ���������� �ڽ��� �ν��Ͻ��� ���� �� �� �ִ�. �̶��� �ڽ��� �������̵� �޼��尡
	 	//=> ȣ���
		//�θ� Ÿ���� �Ļ��� ��� �ڽ� Ÿ���� ����ų �� �����Ƿ�
		//�θ� Ÿ���� ������ ��� �ڽ� Ÿ���� �ϰ��ǰ� ������ �� �ִ�.
}
