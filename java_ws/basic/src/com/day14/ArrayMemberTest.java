package com.day14;

import java.util.Scanner;

class Score{
	private int[] subject; // 과목 배열
	
	Score(int[] subject){
		this.subject=subject;
	}
	
	public int[] getSubject() {
		return subject;
	}
	
	public void setSubject(int[] subject) {
		this.subject=subject;
	}
	
	public int findSum() {
		int sum=0;
		for(int i=0;i<subject.length;i++) {
			sum+=subject[i];
		}
		
		return sum;
	}
	
	public double findAverage() {
		return (double)findSum()/subject.length;
	}
}
public class ArrayMemberTest {

	public static void main(String[] args) {
		int[] arr = new int[3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국,영,수 점수 입력!");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();	
		}
		
		Score s = new Score(arr);
		int sum = s.findSum();
		double avg=s.findAverage();
		
		System.out.println("총점 : " +sum+", 평균 : " + avg);
		
	}

}
