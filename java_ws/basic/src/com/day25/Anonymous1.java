package com.day25;

/*
 �͸�Ŭ���� - �̸��� ����
 		 - Ŭ������ ����� ��ü�� ������ ���ÿ� �� 
 		   �� �ѹ��� ���� �� �ְ�, ���� �ϳ��� ��ü���� ������ �� �ִ� ��ȸ�� Ŭ����
 		   
 		   new �θ�Ŭ���� ��(){
 		   
 		   }
 		   
 		   new �������̽���(){
 		   }
 */
public class Anonymous1 {
	Object iv = new Object() {
		void method() {}
	};
	
	static Object cv = new Object() {
		void method() {}
	};
	
	void myMethod() {
		Object lv = new Object() {
			void method() {}
		};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
