package com.day17;

public class PolymoTest3 {

	public static void main(String[] args) {
		//Triangle �迭 �����, ��� 3�� �ְ�, draw()�޼��� ȣ��
		Triangle[] t = new Triangle[3];
		
		t[0]=new Triangle();
		t[1]=new Triangle();
		t[2]=new Triangle();
		
		for(int i=0;i<t.length;i++) {
			t[i].draw();
		}
		
		
		System.out.println("\n=====Ȯ�� for ���=====");
		for(Triangle t2 : t) {
			t2.draw();
		}
		
		System.out.println("\n=====������ �̿�=====");
		//
		Shape[] arr = new Shape[3];
		arr[0] = new Circle();
		arr[1] = new Triangle();
		arr[2] = new Circle();
		
		for(int i=0;i<arr.length;i++) {
			arr[i].draw();
			arr[i].delete();
		}
		System.out.println("\n=====Ȯ�� for�� �̿�=====");
		for(Shape sArr : arr) {
			sArr.draw();
			sArr.delete();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
