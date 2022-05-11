package com.day15;

/*
	Object Ŭ���� - ��� Ŭ������ ����
				- ��� Ŭ������ ��� �������� ���� ���� ��ġ�ϴ� ���� Ŭ����
 */

/*
 �⺻�� �Ű�����(call by value)
 - ������ ���� �б⸸ �� �� �ִ�
 - �Ű������� �⺻�ڷ���, ���� ���޵�
 => �޼��忡�� �Ű������� ���� �����ص� ȣ���� ��(main)������ ������ ������ ���� �ʴ´�
 ������ �Ű�����(call by reference)
 - ������ ���� �а� ������ �� �ִ�.
 - �Ű������� ������, �ּҰ� ���޵�
 => �޼��忡�� �Ű������� ���� �����ϸ� ȣ���� ��(main)������ ������ ������ ����
 */

class Data{
	int x;
}
public class ValueTest {
	public static void main(String[] args) {
		Data d = new Data();
		d.x=10;
		System.out.println("main() : x=" + d.x); //10
	
		change(d.x);
		System.out.println("�޼��� ȣ�� �� main() x=" + d.x);
		//
		d.x=20;
		System.out.println("\n----main() : x="+d.x);
		
		change2(d);
		System.out.println("change2() ȣ�� �� main():x="+d.x);
		//
		int[] arr = new int[2];
		arr[0]=30;
		arr[1]=40;
		
		System.out.println("\n========main(): arr[0]="+arr[0]);
		
		change3(arr);
		System.out.println("change3() ȣ�� �� main() : arr[0]="+arr[0]);
	}

	
	public static void change(int x) { //call by value
		x=1000;
		System.out.println("change() : x="+x);
	}
	
	public static void change2(Data d) { //call by reference
		d.x=2000;
		System.out.println("change2() : x="+ d.x);
	}
	
	public static void change3(int[] arr) { //call by reference
		arr[0]=3000;
		System.out.println("change3() : arr=[0]"+ arr[0]); //3000
	}
}
