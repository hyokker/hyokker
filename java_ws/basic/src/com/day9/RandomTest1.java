package com.day9;

import java.util.Scanner;

public class RandomTest1 {

	public static void main(String[] args) {
		//public static double random()
		//0.0 <= x < 1.0 ������ ������ �Ǽ��� �����ϴ� �޼���
		/*
		 1~100 ������ ������ ���� ���ϱ�
		[1] Math.random()*100
		100.0<= x <100.0
		[2] +1 (Math.randon()*100) + 1
		1.0 <= x < 101.0
		[3](int) => (int)(Math.random()*100+1)
		1<= x < 101
		
		��Ģ
		1) �߻���Ű���� ���� ������ �� ���� ���Ѵ�
		2) ���۰��� ���Ѵ�
		3) int�� ����ȯ�Ѵ�.
		 
		 a ~ z ������ ������ ���� ���ϱ� (97 ~ 122)
		 => (char)(Math.random() * 26 + 'a')
		 */
		//1. ���� ���ϱ�  - 1~ 100 ������ ������ ���� ���Ѵ�.
		int answer = getAnswer();
		
		//2. 4�� �ݺ� ó�� for(int i=0,i<4;i++) �̿�
		Scanner sc = new Scanner(System.in);
		System.out.println(answer);
		for(int i=0;i<4;i++) {
		//3. ����ڷκ��� 1~100������ ���ڹޱ�
			System.out.println("1~100������ ���ڸ� �Է��ϼ���");
			int num = sc.nextInt();
		//4. ����� ���ؼ� �������� ū��, ������ �˷��ش� (if ����)
			String result = "";
			if(num==answer) {
				System.out.println("�����Դϴ�.");
				break;
			}
			
			if(i==3) {
				result = "��! ������ȸ��";
			}else {
				if(num>answer) {
				result = "�ʹ� Ů�ϴ�. �������� �Է��ϼ���";
				}else {
				result = "���� �� ū���� �Է��ϼ���";
				}
			}
			System.out.println(result);
			}
		}//main
	
	public static int getAnswer() {
		int answer=(int)(Math.random()*100+1);
		return answer;
	}
}

