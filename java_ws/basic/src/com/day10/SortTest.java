package com.day10;

import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
		// public static void sort(int[] a) - �迭 ��ҵ��� ������������ �������ش�
		int[] arr = {10,5,47,53,1000,170,2,61};
		
		System.out.println("���� ��");
		for(int n : arr) {
			System.out.print(n+" ");
		}
		
		Arrays.sort(arr);
		System.out.println("\n\n=====���� ��=====");
		for(int n : arr) {
			System.out.print(n+" ");
		}
	}

}
