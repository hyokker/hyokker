package com.day19;

import java.util.Scanner;

//�������̽� ��� ��� ǥ��
interface Week{
	int MON=1, THE=2, WED=3, THU=4, FRI=5,SAT=6,SUN=7;
}
public class InterfaceConst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� : 1.�� 2.ȭ 3.�� 4.�� 5.�� 6.�� 7.��");
		int type=sc.nextInt();
		
		switch(type) {
			case Week.MON:
				System.out.println("�ְ�ȸ��!");
				break;
			case Week.THE:
				System.out.println("������Ʈ ��ȹ ȸ��!");
				break;
			case Week.WED:
				System.out.println("�����ϻ� �����ϴ� ��!");
				break;
			case Week.THU:
				System.out.println("�系 �౸ ����!");
				break;
			case Week.FRI:
				System.out.println("������Ʈ ����!");
				break;
			case Week.SAT:
				System.out.println("������ ��ſ� �ð�!");
				break;
			case Week.SUN:
				System.out.println("������ ����!");
				break;
			default:
				System.out.println("�߸� �Է�!");
				break;
		}
	}

}
