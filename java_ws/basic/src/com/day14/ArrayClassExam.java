package com.day14;

public class ArrayClassExam {

	public static void main(String[] args) {
		//String �迭 �����, ���α׷��� ��� 3�� �ְ�, ���(for,Ȯ�� for)
		String[] arr;
		arr = new String[3];
		arr[0]="Java";
		arr[1]="C#";
		arr[2]="Python";
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("=====Ȯ�� for=====");
		for(String s : arr) {
			System.out.println(s);
		}
		
		
		//Circle�迭 �����,��� 4�� �ְ�, ���� ���� �� ��� (for, Ȯ�� for)
		Circle[] cc = new Circle[4];
		cc[0] = new Circle(10);
		cc[1] = new Circle(20);
		cc[2] = new Circle(30);
		cc[3] = new Circle(70);
		System.out.println("\n");
		for(int i=0;i<cc.length;i++) {
			System.out.println("���� : " + cc[i].findArea());
		}
		System.out.println("===== Ȯ�� for =====");
		for(Circle ccArr : cc) {
			System.out.println("���� : " + ccArr.findArea());
			
		}
		
	}

}
