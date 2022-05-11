package com.day17;

import java.util.Scanner;



 class Manager {
	private final int MAX_COUNT=100; //final (상수)
	private Scanner sc = new Scanner(System.in);
	
	private Shape2[] shArr = new Shape2[MAX_COUNT];// 저장할 배열
	private int idx = 0; // 배열의 인덱스

	
	public  void menu() { //사용자에게 입력받을 문구
		System.out.println("1.원 2.사각형 3.저장된 데이터 조회 4.종료");
	}
	
	public  void findRadiusArea() { // 원의 면적
		if(idx==MAX_COUNT) {
			System.out.println("데이터를 저장할 수 없습니다");
			return;
		}
		
		System.out.println("반지름입력");
		int r=sc.nextInt();
		
		shArr[idx++] = new Circle2(r);
	}
	
	public  void findRectArea() { // 사각형의 면적
		if(idx==MAX_COUNT) {
			System.out.println("데이터를 저장할 수 없습니다"); return;
		}
		System.out.println("가로,세로 입력");
		int w=sc.nextInt();
		int h=sc.nextInt();
		
		shArr[idx++] = new Rect(w,h);
	}
	public  void showTotal() { // 누적된 데이터 조회
		if(idx==0) {
			System.out.println("조회할 데이터가 없습니다"); 
			return;
		} 
		System.out.println("----보기----");
		
		for(int i=0;i<idx;i++) {
			double area=shArr[i].findArea();
			System.out.println(shArr[i].kind()+"면적 : " + area);
		}
		System.out.println();
		
	}
}

public class ManagerTest {
	public static void main(String[] args) {
		Manager m = new Manager();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			m.menu();
			int type=sc.nextInt();
			
			switch(type) {
				case 1:
					m.findRadiusArea();
					break;
				case 2:
					m.findRectArea();
					
					break;
				case 3:
					m.showTotal();
					break;
				case 4:
					System.out.println("종료함!");
					return;
				default:
						System.out.println("잘못입력\n");
						continue;
			}
		
		}//while
		
	}

}


