package com.day13;

import java.util.Scanner;

class Score2{
	//1.�������
	//�Է°�(���� �Ű�����)
	private int lang; 
	private int eng;
	private int math;
	
	
	//�����(���� ������ ��)
	private int sum;
	private float average;
	
	//������
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
	
	
	//�޼���
	public void findSum() {//���� �޼���
		sum =  lang+eng+math;
		
	}
	public void findAverage() {//��� �޼���
		findSum();
		average =  sum/3f;
	}
	
}
public class ScoreTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����, ����, ���� ������ �Է��ϼ���");
		int lang = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		Score2 s = new Score2(lang, eng, math); //�����ڸ� �̿��� ������� �ʱ�ȭ
		
		s.findSum();
		s.findAverage();
		
		System.out.println("\n���� = " + s.getSum());
		System.out.println("\n��Ŧ = " + s.getAverage());

		
		
	}

}
