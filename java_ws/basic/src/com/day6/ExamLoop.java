package com.day6;

import java.util.Scanner;

public class ExamLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ����ڷκ��� ���ڸ� �Է¹޾Ƽ�, ¦������ Ȧ������ ���
		// �� ���ѷ��� �ȿ��� ó��, �׸����� ���θ� �Է¹޾� �׸��ϰڴٰ� �ϸ� Ż��
		
		for(;;) {
			System.out.println("���ڸ� �Է��ϼ���");
			int num = sc.nextInt();
			
			String result = "";
			if(num%2==1) {
				result = "Ȧ���Դϴ�";
			}else if(num%2==0){
				result = "¦�� �Դϴ�.";
			}else {
				result = "�߸� �Է�!";
			}
			System.out.println(result);
			
			System.out.println("�׸��Ϸ��� q/Q");
			sc.nextLine();
			String quit = sc.nextLine(); // enter ������ ���ؼ� nextLine
			
			if(quit.equalsIgnoreCase("Q"))break;
		}
	}
}
