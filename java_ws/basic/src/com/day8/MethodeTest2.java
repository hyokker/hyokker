package com.day8;

public class MethodeTest2 {
	// [1]�Ű�����, ��ȯ���� ��� ���� �޼��� ����
	public static void func1() {
		System.out.println("*********");
	}
	// [2]�Ű������� �ְ�, ��ȯ���� ���� �޼���

	public static void func2(int cnt){
		//�Է¹��� ������ŭ �� ����ϴ� ���
		for(int i=0;i<cnt;i++) {
			System.out.print("8");
		}
		System.out.println();
		
	}
	
	//[3]�Ű������� ����, ��ȯ���� �ִ� �޼��� ����
	public static float func3() {
		//1~10������ ��
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		
		float avg =sum/10f;
		return avg;
	}
	// [4] �Ű�����, ��ȯ���� ��� �ִ� �޼��� ����
	public static int func4(int a, int b) {
		// �μ��� �� ���ϴ� ���
		int c = a+b;
		return c;
	}
	
	
	public static void main(String[] args) {
		// 1) �Ű�����, ��ȯ���� ���� �޼���ȣ��
		func1();
		
		// 2) �Ű������� �ְ�, ��ȯ���� ���� �޼���
		func2(7);
		
		// 3) �Ű������� ����, ��ȯ���� �ִ� �޼��� ȣ��
		float f = func3();
		System.out.println("f ="+f);
		
		// 4) �Ű������� �ְ�, ��ȯ���� �ִ� �޼��� ȣ��
		int res = func4(10, 30);
		System.out.println("res ="+ res);
	}
}
