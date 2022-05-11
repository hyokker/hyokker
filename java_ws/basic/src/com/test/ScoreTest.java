package com.test;

import java.util.ArrayList;
import java.util.Scanner;

class Score {
	private String name;// 이름

	private String className;

	private int j;// 점수
	private int o;// 점수
	private int jsp;// 점수

	private int sum=0;// 총점
	private double avg=0;// 평균
	private String grade;// 학점

	Score() {

	}

	Score(String name, String className, int j, int o, int jsp) {
		this.name = name;
		this.className = className;
		this.j = j;
		this.o = o;
		this.jsp = jsp;
	}

	public String getName() {
		return name;
	}

	public String getClassName() {
		return className;
	}

	public int getSum() {
		return sum;
	}

	public int getJava() {
		return j;
	}

	public int getOracle() {
		return o;
	}

	public int getJsp() {
		return jsp;
	}

	public double getAvg() {
		return avg;
	}

	public String getGrade() {
		return grade;
	}

	//점수 변경
	
	public void setJava(int j) {
		this.j=j;
	}
	public void setOracle(int o) {
		this.o=o;
	}
	public void setJsp(int jsp) {
		this.jsp=jsp;
	}
	
	//총점
	public int findSum() {
		 sum = j+o+jsp;
		return sum;
	}
	//평균
	public double findAvg() {
		findSum();
		avg = sum / 3.0;
		return avg;
	}

	public String findGrade() {
		String result = "";
		if (avg >= 90) {
			result = "A";
		} else if (avg >= 80) {
			result = "B";
		} else if (avg >= 70) {
			result = "C";
		} else if (avg >= 60) {
			result = "D";
		} else if (avg < 60) {
			result = "F";
		}
		return result;
	}

	public void showInfo() {
		System.out.println("이름 :" + this.name);
		System.out.println("반 :" + this.className);
		System.out.println("java 점수 :" + this.getJava());
		System.out.println("oracle 점수 :" + this.getOracle());
		System.out.println("jsp 점수 :" + this.getJsp());
		System.out.println("총점 :" + this.findSum());
		System.out.println("평균 :" + this.findAvg());
		System.out.println("학점 :" + this.findGrade());
	}
}

public class ScoreTest {
	public static class Maneger {
		ArrayList<Score> list = new ArrayList<Score>();
		Scanner sc = new Scanner(System.in);
		private String name, className;
		private int j, o, jsp;

		public void showInfo() { // 메뉴 호출하기
			System.out.println("1.성적입력");
			System.out.println("2.전체 학생의 성적 조회");
			System.out.println("3.학생별 성적 조회");
			System.out.println("4.클래스<반>별 성적 조회");
			System.out.println("5.학생 성적 수정");
			System.out.println("6.종료");
	
		}

		public void inputData() {// 성적 입력하기
			System.out.println("이름, 반, java, oracle, jsp 점수 입력!");
			name = sc.next();
			className = sc.next();
			j = sc.nextInt();
			o = sc.nextInt();
			jsp = sc.nextInt();

			list.add(new Score(name, className, j, o, jsp));
		} 

		public void showData() {// 전체 성적조회하기
			System.out.println("전체학생의 성적을 조회합니다");
			System.out.println("이름\t반 이름\t java\toracle\tjsp\t총점\t평균\t학점");
			for (int i = 0; i < list.size(); i++) {
//				System.out.println(list.get(i).getName() + "\t" + list.get(i).getClassName() + "\t"
//						+ list.get(i).getJava() + "\t" + list.get(i).getOracle() + "\t" + list.get(i).getJsp() + "\t"
//						+ list.get(i).findSum() + "\t" + list.get(i).findAvg()+"\t" + list.get(i).findGrade());
				list.get(i).showInfo();
			}
		}

		public void oneData() { // 한명 성적 조회하기

			System.out.println("학생별 성적을 조회합니다");

			System.out.println("검색 이름을 입력:");
			String name1; // 이름
			name1 = sc.nextLine();
			System.out.println("이름\t반 이름\t java\toracle\tjsp\t총점\t평균\t학점");
			for (int i = 0; i < list.size(); i++) {
				if (name1.equalsIgnoreCase(list.get(i).getName())) {
//					System.out.println(list.get(i).getName() + "\t" + list.get(i).getClassName() + "\t"
//							+ list.get(i).getJava() + "\t" + list.get(i).getOracle() + "\t" + list.get(i).getJsp()
//							+ "\t" + list.get(i).findSum() + "\t" + list.get(i).findAvg()+list.get(i).findGrade());
					list.get(i).showInfo();
				}
			
			}
		}
		public void classData() {//클래스<반>별 성적 조회
			System.out.println("클래스별 성적을 조회합니다");
			
			System.out.println("클래스 명 입력");
			
			className= sc.nextLine();
			System.out.println("이름\t반 이름\t java\toracle\tjsp\t총점\t평균\t학점");
			for (int i = 0; i < list.size(); i++) {
				if(className.equalsIgnoreCase(list.get(i).getClassName())) {
//					System.out.println(list.get(i).getName() + "\t" + list.get(i).getClassName() + "\t"
//							+ list.get(i).getJava() + "\t" + list.get(i).getOracle() + "\t" + list.get(i).getJsp()
//							+ "\t" + list.get(i).findSum() + "\t" + list.get(i).findAvg()+list.get(i).findGrade());
					list.get(i).showInfo();
				}
			}
			
		}
		
		public void changeData() {
			System.out.println("수정할학생의 이름과 반을 입력하세요");
			name=sc.next();
			className=sc.next();
			for(int i=0;i<list.size();i++) {
				if(name.equals(list.get(i).getName())	||	className.equals(list.get(i).getClassName())) {
					System.out.println("수정하려는 점수를 java, oracle, jsp 순서로 입력!");
					j=sc.nextInt();
					o=sc.nextInt();
					jsp=sc.nextInt();
					list.get(i).setJava(j);
					list.get(i).setOracle(o);
					list.get(i).setJsp(jsp);
//					System.out.println(list.get(i).getName() + "\t" + list.get(i).getClassName() + "\t"
//							+ list.get(i).getJava() + "\t" + list.get(i).getOracle() + "\t" + list.get(i).getJsp()
//							+ "\t" + list.get(i).findSum() + "\t" + list.get(i).findAvg()+"\t"+list.get(i).findGrade());
					list.get(i).showInfo();
					System.out.println("==========================================================");
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Maneger m = new Maneger();
	

		while (true) {
			m.showInfo(); // 메뉴
			System.out.print("선택하세요 : ");
			int type = sc.nextInt();
			switch (type) {
			case 1:
				m.inputData(); // 성적입력하기
				break;
			case 2:
				m.showData(); // 전체성적 조회하기

				break;
			case 3:
				m.oneData(); // 학생별 성적 조회하기

				break;
			case 4:
				m.classData();// 클래스<반>별 성적 조회하기
				break;
			case 5:
				m.changeData();// 수정하기
				break;
			case 6:
				System.out.println("종료합니다");// 종료하기
				return;
			}

		} // while
	}

}
