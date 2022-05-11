package com.day14;


import java.util.Scanner;

class view{
		public void showMenu() {
		System.out.println("선택하세요");
		System.out.println("1.데이터 입력");
		System.out.println("2.전체 데이터 조회");
		System.out.println("3.데이터 검색");
		System.out.println("4.데이터 삭제");
		System.out.println("5.프로그램 종료");
		System.out.print("선택 : ");
	}
	

}
public class Page4647 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		view v = new view();
		PhoneInfo[] pArr= new PhoneInfo[100];
		int index = 0;
		for(;;) {
			//메뉴 메서드 호출
			v.showMenu();
			int select=sc.nextInt();
			sc.nextLine();
			if(select==5){
				System.out.println("프로그램을 종료합니다"); 
				break;
			}else if(select==1) {				
				System.out.println("데이터 입력을 시작합니다..");
				System.out.print("이름 :");
				String name = sc.nextLine();
				System.out.print("전화번호 :");
				String number=sc.nextLine();
				System.out.print("생년월일 :");
				String address=sc.nextLine();
				pArr[index++]= new PhoneInfo(name, number, address);
				System.out.println("데이터 입력이 완료되었습니다.");
			
			}else if(select==2) {
				System.out.println("------전체 데이터 조회------");
				for(int i=0;i<index;i++) {
					pArr[i].showInfo();
				
				}
	
			}else if(select==3) {//공부...
				System.out.println("데이터 검색을 시작합니다..");
				System.out.print("이름 : ");
				String name=sc.nextLine();
				for(int i=0;i<index;i++) {
					if(name.equals(pArr[i].getName())) {
						pArr[i].showInfo();
					}
					System.out.println("데이터 검색을 종료합니다 \n");
				}
				
			}else if(select==4) {//공부....
				System.out.println("데이터 삭제를 시작합니다");
				System.out.print("이름 :");
				String name=sc.nextLine();
				for(int i=0;i<index;i++) {
					if(name.equals(pArr[i].getName())) {
						for(int j=i+1;j<index;j++) {
						pArr[j-1]=pArr[j];  //
					}	
						//삭제하고싶은것 건효(index 2= i)
						// j= 2+1; j<7
						// j= 3+1; j<7
						// j= 4+1; j<7
						// j= 5+1; j<7
						//김효건 효진 건효 진욱 소미 소미엄마 소망 충렬 
						// 0 1 2 3 4 5 6 7 8 9 
						//       3 4 5 6 7 8
						//       
						--index;
				}
			}
				System.out.println("데이터 삭제가 완료되었습니다");
		
			}//if
		}//for
	}
}

		
