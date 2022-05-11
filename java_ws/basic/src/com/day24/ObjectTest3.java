package com.day24;

class Test{
	private int value;
	
	Test(int value){
		this.value=value;
	}
}
public class ObjectTest3 {

	public static void main(String[] args) {
		/*
		 ������ ==
		 [1] �⺻�������� ���� ������ ��
		 [2] ������������ �ּҰ��� ��
		 
		 String�� equals() �޼���
		 -���ڿ� ���� ������ ��
		 -Object�� equals()�� �������̵� �� ��
		 
		 Object�� equals()
		 -�ּҰ��� ��
		 */
		
		Test t1= new Test(10);
		Test t2= new Test(10);
		
		if(t1==t2) {
			System.out.println("t1,t2�� �ּҰ� ����");
		}else {
			System.out.println("t1,t2�� �ּҰ� �ٸ���");
		}
		if(t1.equals(t2)) {
			System.out.println("t1,t2�� �ּҰ� ����");
		}else {
			System.out.println("t1,t2�� �ּҰ� �ٸ���");
		}
		
		t2=t1;
		if(t1.equals(t2)) {
			System.out.println("t1,t2�� �ּҰ� ����");
		}else {
			System.out.println("t1,t2�� �ּҰ� �ٸ���");
		}
		
	}

}
