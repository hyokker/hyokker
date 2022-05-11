package com.day24;

/*
 finalize() �޼���
�ν��Ͻ��� �Ҹ�Ǳ� ������ �ڹ� ����ӽſ� ���ؼ� �ڵ����� ȣ��Ǵ� �޼��� 
 */

class MyName{
	private String objName;
	
	MyName(String name){
		this.objName=name;
	}
	
	
	protected void finalize() throws Throwable{
		super.finalize();
		System.out.println(objName+"�� �Ҹ��Ͽ����ϴ�");
	}
}
public class FinalizeTest {

	public static void main(String[] args) {
		MyName obj1 = new MyName("�ν��Ͻ�1");
		MyName obj2 = new MyName("�ν��Ͻ�2");
		
		//obj1=null;
		//obj2=null;
		obj1=obj2; // gb = �ν��Ͻ�1
		obj2=null; // ����.
		obj1=null; //
		System.out.println("\n���α׷��� �����մϴ�.");
		
		//finalize �޼����� �Ϻ��� ȣ���� �ʿ��� ��Ȳ������
		//���� �� �޼����� ������ ȣ���� �ʿ���
		System.gc();
		System.runFinalization();
		System.gc();
		System.runFinalization();
	}

}
