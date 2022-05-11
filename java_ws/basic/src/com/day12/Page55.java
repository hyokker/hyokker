package com.day12;

import java.util.Scanner;

class Score{
	private int lang;//1.멤버변수 
	private int eng;
	private int math;

	Score(int p_lang,int p_eng, int p_math){
		lang = p_lang;
		eng = p_eng;
		math = p_math;
	}
	
	public int getLang() { 
		return lang;
	}
	public void setLang(int p_lang) {
		lang = p_lang;
	}
	
	public int getEng() {
		return eng;
	}
	public void setEng(int p_eng) {
		eng = p_eng;
	}
	
	public int getMath() {
		return math;
	}
	public void setMath(int p_math) {
		math = p_math;
	}
	public int sum() {//총점 메서드
		return lang + eng + math;
	}
	public double avg() {//평균 메서드
		return (lang+eng+math)/3.0;
	}
	
}
public class Page55 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어, 영어, 수학 점수를 입력하세요");
		int lang = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		Score s = new Score(lang, eng, math); //생성자를 이용한 멤버변수 초기화
		
		System.out.println("총점 : " + s.sum());
		System.out.println("평균 : " + Math.round(s.avg()*100)/100.0);
		
		//setter로 변경한 값
		s.setLang(30);
		s.setEng(30);
		s.setMath(30);
		
		System.out.println("변경한 과목의 값 : 국어 :"+s.getLang()+", 영어 :"+s.getEng()+", 수학 :"+s.getMath());
		System.out.println("변경한 과목의 총점 :" + s.sum());
		System.out.println("변경한 과목의 평균 : " + Math.round(s.avg()*100)/100.0);
		
	}

}
