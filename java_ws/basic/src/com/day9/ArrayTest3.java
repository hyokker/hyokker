package com.day9;

public class ArrayTest3 {
	//배열의 for문에서 int i=0; i<변수.length 은 무적권임
	public static void main(String[] args) {
		float[] a;
		a = new float[3];
		
		a[0] = 12.5f;
		a[1] = -24.3f;
		a[2] =	0.76f;
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
		for(int i=0;i<a.length;i++) {
			System.out.println("a["+i+"]="+a[i]);
		}
		
		double[] b = {10,20,30,30};
		double sum= 0;
		for(int i=0;i<b.length;i++) {
			sum += b[i];
		}
		double avg= sum/b.length;
		System.out.println("총점 = "+ sum + "평균 =" + avg);

//		
		String [] name = new String[2];
		name[0] = "오충렬";
		name[1] = "이소망";
		for(int i=0;i<name.length;i++)
		System.out.println(name[i]);

		char[] arr = new char[4];
		arr[0] = 'j';
		arr[1] = 'a';
		arr[2] = 'v';
		arr[3] = 'a';
		System.out.println("\n");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
