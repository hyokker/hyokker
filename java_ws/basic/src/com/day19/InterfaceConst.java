package com.day19;

import java.util.Scanner;

//인터페이스 기반 상수 표현
interface Week{
	int MON=1, THE=2, WED=3, THU=4, FRI=5,SAT=6,SUN=7;
}
public class InterfaceConst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("요일 선택 : 1.월 2.화 3.수 4.목 5.금 6.토 7.일");
		int type=sc.nextInt();
		
		switch(type) {
			case Week.MON:
				System.out.println("주간회의!");
				break;
			case Week.THE:
				System.out.println("프로젝트 기획 회의!");
				break;
			case Week.WED:
				System.out.println("진생하상 보고하는 날!");
				break;
			case Week.THU:
				System.out.println("사내 축구 시합!");
				break;
			case Week.FRI:
				System.out.println("프로젝트 마감!");
				break;
			case Week.SAT:
				System.out.println("가족과 즐거운 시간!");
				break;
			case Week.SUN:
				System.out.println("오늘은 휴일!");
				break;
			default:
				System.out.println("잘못 입력!");
				break;
		}
	}

}
