package com.day10;

import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
		// public static void sort(int[] a) - 배열 요소들을 오름차순으로 정렬해준다
		int[] arr = {10,5,47,53,1000,170,2,61};
		
		System.out.println("정렬 전");
		for(int n : arr) {
			System.out.print(n+" ");
		}
		
		Arrays.sort(arr);
		System.out.println("\n\n=====정렬 후=====");
		for(int n : arr) {
			System.out.print(n+" ");
		}
	}

}
