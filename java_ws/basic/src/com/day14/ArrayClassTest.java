package com.day14;

public class ArrayClassTest {

	public static void main(String[] args) {
		/*
		 1. int �迭�� ���� 3�� �ְ� ���(for, Ȯ�� for) - �� ����  
		 
		 2.String �迭�� ���ɸ޴� 4�� �ְ�, ��� 
		 */
		int[] arr;
		arr = new int [3];
		arr[0]=1;
		arr[1]=10;
		arr[2]=100;
		
		System.out.println("�⺻ for�� ���");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("\nȮ�� for �� ���");
		
		for(int n : arr) {
			System.out.println(n);
		}
		
		
		System.out.println("\n�⺻ for�� ���");
		String[] str;
		str = new String[4];
		str[0]="��ġ�";
		str[1]="�����";
		str[2]="���κ��";
		str[3]="�δ��";
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		System.out.println("\nȮ�� for �� ���");
		for(String n : str) {
			System.out.println(n);
		}
		
		//
		
		//���� - ������ �� ���� �����ϱ� ���� �����(�޸� ����)
		//�迭 - ������ ���� ���� �����ϱ� ���� �����
		int a = 10;
		String s = "java";
		Account acc = new Account("001-100-1000",10000); //��ü ����
		Account acc2;
		acc2 = new Account("003-200-5000", 20000);
		
		acc.display(); //��������.�޼���()ȣ��
		//�迭�� �� �ֱ�
		Account[] accArr = new Account[3];
		accArr[0]= new Account("001-100-2001", 100000);
		accArr[1]= new Account("001-100-3001", 200000);
		Account acc3 = new Account("001-100-4001", 300000);
		accArr[2]= acc3; //acc3 : ��������, accArr[2]��� �迭��ҵ� ��������(�ּҰ� ��)
	
		/*	int �迭���� int �� �ִ´�
	  		String �迭���� String�� �ִ´�
	  		
	  		[1]Account �迭���� Account�� �ִ´�
			=> ? new �� ��ü�����ؼ� �ִ´�
		 	[2] for���ȿ��� ��������.�޼���() ȣ��
		 */ 

		/*
		accArr[0].display();
		accArr[1].display();
		accArr[2].display();
		*/
		System.out.println("===================");
		for(int i=0;i<accArr.length;i++) {
			accArr[i].display();//��������.�޼���() ȣ��
		}
		
		System.out.println("===================");
		System.out.println("\nȮ�� for�� ���");
		for(Account acc4 : accArr) {
			acc4.display();;
		}
	}	

}
