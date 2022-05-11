package com.day13.sub;

/*
 ��������� �ʱ�ȭ �ñ�� ����
 [1]Ŭ��������(static����)�� �ʱ�ȭ ����
 - �ش� Ŭ������ �޸𸮿� �ε��� �� �� �ѹ� �ʱ�ȭ��
 
 
 [2]�ν��Ͻ� ������ �ʱ�ȭ ����
 - �ν��Ͻ��� ������ ������ �� �ν��Ͻ����� �ʱ�ȭ�� �̷����
 
 Ŭ���� ������ �ʱ�ȭ ����
 -default�� => ����� �ʱ�ȭ => static �ʱ�ȭ ��
 
 �ν��Ͻ� ������ �ʱ�ȭ ����
 -default�� => ����� �ʱ�ȭ => ������
 
 */

//static������ �׻� �ν��Ͻ� �������� ���� �����ǰ� �ʱ�ȭ��!!

class AAA{	
	static int cv=1; // ����� �ʱ�ȭ
	int iv =1; // ����� �ʱ�ȭ
	
	//static �ʱ�ȭ ��
	static {
		cv=2;
		System.out.println("static �ʱ�ȭ �� ȣ�� !" );
	}

	//������
	AAA(){
		iv=3;
		System.out.println("������ ȣ��!!");
	}

}

//cv : 0 => 1 => 2
//iv : 0 => 1 => 3
public class InitTest {

	public static void main(String[] args) {
		System.out.println("AAA.cv=" + AAA.cv);
	
	
	AAA obj = new AAA();
	System.out.println("obj.iv = " + obj.iv);
	
	}

}
