package com.day21;

public class ThrowsTest {

	public static void main(String[] args) {
		/*
		 RuntimeException�� �� �ڽ� Ŭ������
		 - �������� �Ǽ��� ���ؼ� �߻��� �� �ִ� ���ܵ�
		 - ����ó�� ���ص� ��
		 
		 ExceptionŬ������ �� �ڽ� Ŭ������
		 - �ݵ�� ����ó���� ���־�� ��
		 �׷��� ������ ������ ���� �߻�
		 
		 ���ܸ� ó���ϴ� ���
		 [1] try~catch���� ���
		 [2] throws�� �̿��Ͽ� ���� ���ѱ��(��������, ���ܸ� �޼��忡 ����) 
		 
		 void method() throws Exception1, Exception2{
		 }
		 
		 => �޼��� ������ �߻��� ���ɼ��� �ִ� ���ܸ� �޼����� ����ο� ����Ͽ�
		 �� �޼��带 ����ϴ� �ʿ����� �̿� ���� ó���� �ϵ��� ������
		 */
		try {
			method1();
		}catch(Exception e) {
			System.out.println("���� :" + e.getMessage() );
		}
		
		System.out.println("\n=========next!==========");
	}
	
	public static void method1() throws Exception{
		method2();
	}
	
	public static void method2() throws Exception {
		throw new Exception("���� �߻� �ߴ�!!");
	}
}
