package com.day14;

public class ArrayClassExam {

	public static void main(String[] args) {
		//String 배열 만들고, 프로그래밍 언어 3개 넣고, 출력(for,확장 for)
		String[] arr;
		arr = new String[3];
		arr[0]="Java";
		arr[1]="C#";
		arr[2]="Python";
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("=====확장 for=====");
		for(String s : arr) {
			System.out.println(s);
		}
		
		
		//Circle배열 만들고,요소 4개 넣고, 면적 구한 후 출력 (for, 확장 for)
		Circle[] cc = new Circle[4];
		cc[0] = new Circle(10);
		cc[1] = new Circle(20);
		cc[2] = new Circle(30);
		cc[3] = new Circle(70);
		System.out.println("\n");
		for(int i=0;i<cc.length;i++) {
			System.out.println("면적 : " + cc[i].findArea());
		}
		System.out.println("===== 확장 for =====");
		for(Circle ccArr : cc) {
			System.out.println("면적 : " + ccArr.findArea());
			
		}
		
	}

}
