package com.day25;
	/*
	 ���� Ŭ���� - Ŭ���� ���� ����� Ŭ����
	  		  - GUI ���ø����̼��� �̺�Ʈ ó���� ���
	  		  - private, protected ���� �����ڵ� ��� ����
	 ������ ���� ��ġ�� ���� ������ ����
	 [1] �ν��Ͻ� Ŭ����
	 [2] static Ŭ����
	 [3] ���� Ŭ����
	 [4] �͸� Ŭ����
	 */

////error : ���� Ŭ���� �� static Ŭ������ static ����� ������ �ִ�.
public class InnerTest1 {
	class InstanceInner{
		int iv=100;
		//static int cv=1000; 
		//error : ���� Ŭ���� �� static Ŭ������ static ����� ������ �ִ�.
		final static int CONST=100; //static final�� ����̹Ƿ� ���
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 200;//static Ŭ������ ststic��� ������ �� �ִ�
		
		void method() {
			class LocalInner{
				int iv=300;
				//static int cv =300; //error
				final static int CONST=300;
			}
		}
	}
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);

	}

}
