package com.jdbc.day3;

import java.sql.SQLException;
import java.util.Scanner;

public class PersonConsole {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PersonManager manager = new PersonManager();
		
		while(true) {
			System.out.println("1. 입력  2. 전체조회 3. 번호로 조회 4. 종료");
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
					System.out.println("시스템 종료함!");
					System.exit(0);
			default:
				System.out.println("잘못 선택!\n");
			}
		}
		

	}

}
