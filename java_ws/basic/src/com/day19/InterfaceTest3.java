package com.day19;
/*
 �������� ������ �� Ŭ����(A-I-B)
 - Ŭ���� A�� Ŭ���� B�� ���� ȣ������ �ʰ� �������̽��� �Ű�ü�� �ϴ� ���
 Ŭ���� A �� �������̽� I�ϰ� �������� ���迡 �ֱ� ������ Ŭ���� B�� ���濡
 ���� ���� �ʴ´�.
 */

interface I{
	void method();
}

class AA {
	public void methodA(I i) {
		i.method();
	}
}

class BB implements I{
	public void method() {
		System.out.println("BBŬ�������� ������ �޼���");
	}
}
class CC implements I{
	public void method() {
		System.out.println("CCŬ�������� ������ �޼���");
	}
}
public class InterfaceTest3 {

	public static void main(String[] args) {
		AA a = new AA();
		//methodA()ȣ��
		//a.methodA(new BB());
		a.methodA(new CC());
	}

}
