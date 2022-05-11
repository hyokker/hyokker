package com.day13;

import java.util.Scanner;

class rsp{
	//1.멤버변수 선언
	private String iuser;
	private String icom;
	private String result;
	
//	rsp(String user, String com){
//		this.iuser=user;
//		this.icom=com;
//	}
	
	public String getIuser() {
		return iuser;
	}
	public String getIcom() {
		return icom;
	}
	public String getResult() {
		return result;
	}
	
	private String convertUser(int num) {
		String str = "";
		if(num==0) {
			str = "가위";
		}else if(num==1) {
			str = "바위";
		}else if(num==2) {
			str = "보";
		}
		return str;
	}

	public void win(int user,int com) {
		
		if((user-com+3)%3==1) {
			result = "이겻다";
		}else if((user-com+3)%3==2){
			result = "졌다";			
		}else if((user-com+3)%3==0) {
			result = "비겻다";
		}
		iuser = convertUser(user);
		icom = convertUser(com);
	
		
	
	}
}
public class Page91 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("가위<0>, 바위<1>, 보<2>, Q<quit>를 입력해주세요");
		rsp r = new rsp();
		String user=sc.nextLine();
		if(user.equalsIgnoreCase("q")) {
			System.out.println("종료");
			break;
		}
		//사용자의 입력 값
		int user1 = Integer.parseInt(user);
		if(user1>2) {
			System.out.println("잘못 입력. 다시 입력하세요");
			continue;
		}
		
		//컴퓨터의 랜덤 값
		int com =(int)(Math.random()*3);

		
	
		r.win(user1, com);
		//사용자가 낸 것
//		System.out.println(r.win(user1, com));
		System.out.println("사용자 : "+r.getIuser());
		System.out.println("컴퓨터 : "+r.getIcom());
		System.out.println("결과 "+r.getResult());
		}
		
	}

}

