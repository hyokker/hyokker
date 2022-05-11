package com.jdbc.day3;

import java.sql.SQLException;
import java.util.Scanner;

public class PersonConsole {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PersonManager manager = new PersonManager();
		
		while(true) {
			System.out.println("1. �Է�  2. ��ü��ȸ 3. ��ȣ�� ��ȸ 4. ����");
			int type=sc.nextInt();
			
			switch (type) {
				case 1:
				try {
					manager.register();
				} catch (SQLException e) {
					e.printStackTrace();
				}
					break;
				case 2:
				try {
					manager.showAll();
				} catch (SQLException e) {
					e.printStackTrace();
				}
					break;
				case 3:
				try {
					manager.showByNo();
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					break;
				case 4:
					System.out.println("�ý��� ������!");
					System.exit(0);
			default:
				System.out.println("�߸� ����!\n");
			}
		}
		

	}

}
