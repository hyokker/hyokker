package com.day6;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//���ѷ��� : �ݺ����ȿ��� break�� �Ἥ �ݺ����� Ż��
		/*for(;;) {
			�ݺ��� ����
			
			if(���ǽ�)
				break;
		}
		*/
		
		for(;;) {
			System.out.println("���� ��~~~");
			
			System.out.println("����Ͻðڽ��ϱ�?(Y/N)");
			String quit = sc.nextLine();
			
			if(quit.equalsIgnoreCase("N")){
				break;
			}//if
		}//for
		System.out.println("N�� �����ϼ̽��ϴ�");
	}
}