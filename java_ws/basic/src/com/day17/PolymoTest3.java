package com.day17;

public class PolymoTest3 {

	public static void main(String[] args) {
		//Triangle 배열 만들고, 요소 3개 넣고, draw()메서드 호출
		Triangle[] t = new Triangle[3];
		
		t[0]=new Triangle();
		t[1]=new Triangle();
		t[2]=new Triangle();
		
		for(int i=0;i<t.length;i++) {
			t[i].draw();
		}
		
		
		System.out.println("\n=====확장 for 사용=====");
		for(Triangle t2 : t) {
			t2.draw();
		}
		
		System.out.println("\n=====다형성 이용=====");
		//
		Shape[] arr = new Shape[3];
		arr[0] = new Circle();
		arr[1] = new Triangle();
		arr[2] = new Circle();
		
		for(int i=0;i<arr.length;i++) {
			arr[i].draw();
			arr[i].delete();
		}
		System.out.println("\n=====확장 for문 이용=====");
		for(Shape sArr : arr) {
			sArr.draw();
			sArr.delete();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
