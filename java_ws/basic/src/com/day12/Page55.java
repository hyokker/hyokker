package com.day12;

import java.util.Scanner;

class Score{
	private int lang;//1.������� 
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
	public int sum() {//���� �޼���
		return lang + eng + math;
	}
	public double avg() {//��� �޼���
		return (lang+eng+math)/3.0;
	}
	
}
public class Page55 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����, ����, ���� ������ �Է��ϼ���");
		int lang = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		Score s = new Score(lang, eng, math); //�����ڸ� �̿��� ������� �ʱ�ȭ
		
		System.out.println("���� : " + s.sum());
		System.out.println("��� : " + Math.round(s.avg()*100)/100.0);
		
		//setter�� ������ ��
		s.setLang(30);
		s.setEng(30);
		s.setMath(30);
		
		System.out.println("������ ������ �� : ���� :"+s.getLang()+", ���� :"+s.getEng()+", ���� :"+s.getMath());
		System.out.println("������ ������ ���� :" + s.sum());
		System.out.println("������ ������ ��� : " + Math.round(s.avg()*100)/100.0);
		
	}

}
