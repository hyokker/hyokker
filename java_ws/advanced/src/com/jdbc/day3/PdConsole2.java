package com.jdbc.day3;

import java.sql.SQLException;
import java.util.Scanner;

public class PdConsole2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PdManager manager = new PdManager();
		while(true) {
			System.out.println("1.등록 2.수정 3.삭제 4.전체조회 5.번호로조회 "
					+ "6.이름으로 조회 7.종료");
			int type=sc.nextInt();
			
			switch(type) {
				case 1:
					try {
						manager.register();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					break;
				case 2:
					try {
						manager.edit();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					break;
				case 3:
					try {
						manager.delete2();
					} catch (NumberFormatException e1) {
						e1.printStackTrace();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					break;
				case 4:
					try {
						manager.showAll();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					break;
				case 5:
					try {
						manager.showByNo();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					break;	
				case 6:
					try {
						manager.showByName();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					break;
				case 7:
					System.out.println("시스템 종료함!");
					System.exit(0);
				default:
					System.out.println("잘못 선택!\n");
			}
		}//while
	}

}
