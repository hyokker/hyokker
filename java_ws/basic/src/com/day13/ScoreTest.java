package com.day13;

import java.util.Scanner;

class Score2{
	//1.멤버변수
	//입력값(기존 매개변수)
	private int lang; 
	private int eng;
	private int math;
	
	
	//결과값(기존 리턴한 값)
	private int sum;
	private float average;
	
	//생성자
	Score2(int lang,int eng, int math){
		this.lang = lang;
		this.eng = eng;
		this.eng = math;
	}
	
	public int getLang() { 
		return lang;
	}
	public void setLang(int lang) {
		this.lang = lang;
	}
	
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public float getAverage() {
		return average;
	}
	
	
	//메서드
	public void findSum() {//총점 메서드
		sum =  lang+eng+math;
		
	}
	public void findAverage() {//평균 메서드
		findSum();
		average =  sum/3f;
	}
	
}
public class ScoreTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어, 영어, 수학 점수를 입력하세요");
		int lang = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		Score2 s = new Score2(lang, eng, math); //생성자를 이용한 멤버변수 초기화
		
		s.findSum();
		s.findAverage();
		
		System.out.println("\n총점 = " + s.getSum());
		System.out.println("\n평큔 = " + s.getAverage());

		
		
	}

}
