package com.test;

import java.util.ArrayList;
import java.util.Scanner;

class Score {
	private String name;// �̸�

	private String className;

	private int j;// ����
	private int o;// ����
	private int jsp;// ����

	private int sum=0;// ����
	private double avg=0;// ���
	private String grade;// ����

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

	//���� ����
	
	public void setJava(int j) {
		this.j=j;
	}
	public void setOracle(int o) {
		this.o=o;
	}
	public void setJsp(int jsp) {
		this.jsp=jsp;
	}
	
	//����
	public int findSum() {
		 sum = j+o+jsp;
		return sum;
	}
	//���
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
		System.out.println("�̸� :" + this.name);
		System.out.println("�� :" + this.className);
		System.out.println("java ���� :" + this.getJava());
		System.out.println("oracle ���� :" + this.getOracle());
		System.out.println("jsp ���� :" + this.getJsp());
		System.out.println("���� :" + this.findSum());
		System.out.println("��� :" + this.findAvg());
		System.out.println("���� :" + this.findGrade());
	}
}

public class ScoreTest {
	public static class Maneger {
		ArrayList<Score> list = new ArrayList<Score>();
		Scanner sc = new Scanner(System.in);
		private String name, className;
		private int j, o, jsp;

		public void showInfo() { // �޴� ȣ���ϱ�
			System.out.println("1.�����Է�");
			System.out.println("2.��ü �л��� ���� ��ȸ");
			System.out.println("3.�л��� ���� ��ȸ");
			System.out.println("4.Ŭ����<��>�� ���� ��ȸ");
			System.out.println("5.�л� ���� ����");
			System.out.println("6.����");
	
		}

		public void inputData() {// ���� �Է��ϱ�
			System.out.println("�̸�, ��, java, oracle, jsp ���� �Է�!");
			name = sc.next();
			className = sc.next();
			j = sc.nextInt();
			o = sc.nextInt();
			jsp = sc.nextInt();

			list.add(new Score(name, className, j, o, jsp));
		} 

		public void showData() {// ��ü ������ȸ�ϱ�
			System.out.println("��ü�л��� ������ ��ȸ�մϴ�");
			System.out.println("�̸�\t�� �̸�\t java\toracle\tjsp\t����\t���\t����");
			for (int i = 0; i < list.size(); i++) {
//				System.out.println(list.get(i).getName() + "\t" + list.get(i).getClassName() + "\t"
//						+ list.get(i).getJava() + "\t" + list.get(i).getOracle() + "\t" + list.get(i).getJsp() + "\t"
//						+ list.get(i).findSum() + "\t" + list.get(i).findAvg()+"\t" + list.get(i).findGrade());
				list.get(i).showInfo();
			}
		}

		public void oneData() { // �Ѹ� ���� ��ȸ�ϱ�

			System.out.println("�л��� ������ ��ȸ�մϴ�");

			System.out.println("�˻� �̸��� �Է�:");
			String name1; // �̸�
			name1 = sc.nextLine();
			System.out.println("�̸�\t�� �̸�\t java\toracle\tjsp\t����\t���\t����");
			for (int i = 0; i < list.size(); i++) {
				if (name1.equalsIgnoreCase(list.get(i).getName())) {
//					System.out.println(list.get(i).getName() + "\t" + list.get(i).getClassName() + "\t"
//							+ list.get(i).getJava() + "\t" + list.get(i).getOracle() + "\t" + list.get(i).getJsp()
//							+ "\t" + list.get(i).findSum() + "\t" + list.get(i).findAvg()+list.get(i).findGrade());
					list.get(i).showInfo();
				}
			
			}
		}
		public void classData() {//Ŭ����<��>�� ���� ��ȸ
			System.out.println("Ŭ������ ������ ��ȸ�մϴ�");
			
			System.out.println("Ŭ���� �� �Է�");
			
			className= sc.nextLine();
			System.out.println("�̸�\t�� �̸�\t java\toracle\tjsp\t����\t���\t����");
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
			System.out.println("�������л��� �̸��� ���� �Է��ϼ���");
			name=sc.next();
			className=sc.next();
			for(int i=0;i<list.size();i++) {
				if(name.equals(list.get(i).getName())	||	className.equals(list.get(i).getClassName())) {
					System.out.println("�����Ϸ��� ������ java, oracle, jsp ������ �Է�!");
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
			m.showInfo(); // �޴�
			System.out.print("�����ϼ��� : ");
			int type = sc.nextInt();
			switch (type) {
			case 1:
				m.inputData(); // �����Է��ϱ�
				break;
			case 2:
				m.showData(); // ��ü���� ��ȸ�ϱ�

				break;
			case 3:
				m.oneData(); // �л��� ���� ��ȸ�ϱ�

				break;
			case 4:
				m.classData();// Ŭ����<��>�� ���� ��ȸ�ϱ�
				break;
			case 5:
				m.changeData();// �����ϱ�
				break;
			case 6:
				System.out.println("�����մϴ�");// �����ϱ�
				return;
			}

		} // while
	}

}
