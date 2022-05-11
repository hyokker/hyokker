package com.day13.sub;

public class StaticTest {
	private int num1=10; // �ν��Ͻ� ����
	private static int num2=20; //static ����
	
	public int add() {	//�ν��Ͻ� �޼���
		return num1+num2; //�ν��Ͻ� �޼��忡���� static ������ ���ٰ���
	}
	public static int multiply(int a, int b) { //static �޼��� - static�� ���� ����
		//int c = num1*num2; //error : Cannot make a static reference to the non-static field num1
		//static ������ static�� ���ٰ����ϹǷ� ����
		int c = a*b;
		return c;
	
	}
	public static void main(String[] args) {
		int result = multiply(5, 9);
		//static �޼��� ȣ�� : Ŭ������.�޼���()
		//=> ���� Ŭ���� �̹Ƿ� Ŭ������ �����ϰ� �޼���()������ ȣ�Ⱑ��
		System.out.println("�� ���� �� : "+ result );
		
		//add(); //static �޼��忡�� �ν��Ͻ� �޼��� ȣ�� �Ұ�
		//static�޼���� static �����͸� ���� ����
		//=> �ν��Ͻ� �����ʹ� ��ü ���� �� �����ؾ� ��
		StaticTest obj = new StaticTest();
		result=obj.add();
		System.out.println("�� ���� �� : " + result );
				
		
		
	}

}
