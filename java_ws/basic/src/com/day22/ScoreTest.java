package com.day22;

import java.util.ArrayList;
import java.util.Scanner;

class Score{
	private int sum;
	private double avg;
	
	public int getSum() {
		return sum;
	}
	
	
	public double getAvg() {
		return avg;
	}
	

	public void findSum(ArrayList<Integer> subject) {
		sum=0;
		for(int i=0;i<subject.size();i++) {
			int n = subject.get(i);
			sum+=n;
		}
	}
	
	public void findAvg(ArrayList<Integer> subject) {
		findSum(subject);
		avg = (double)sum/subject.size();
	}
}
public class ScoreTest {

	public static void main(String[] args) {
		Score s = new Score();
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		System.out.println("국어, 영어, 수학 점수를 입력");
		for(int i=0;i<3;i++) {
			list.add(sc.nextInt());
		}
		
		//총점 구하는 메서드 호출
		s.findSum(list);
		
		int sum = s.getSum();
		System.out.println("총점 = " + sum);
		
		//평균 구하는 메서드 호출
		s.findAvg(list);
		
		double avg = s.getAvg();
		System.out.println("평균 = " + avg);
	}

}
