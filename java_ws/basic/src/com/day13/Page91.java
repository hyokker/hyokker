package com.day13;

import java.util.Scanner;

class rsp{
	//1.������� ����
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
			str = "����";
		}else if(num==1) {
			str = "����";
		}else if(num==2) {
			str = "��";
		}
		return str;
	}

	public void win(int user,int com) {
		
		if((user-com+3)%3==1) {
			result = "�̰��";
		}else if((user-com+3)%3==2){
			result = "����";			
		}else if((user-com+3)%3==0) {
			result = "����";
		}
		iuser = convertUser(user);
		icom = convertUser(com);
	
		
	
	}
}
public class Page91 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("����<0>, ����<1>, ��<2>, Q<quit>�� �Է����ּ���");
		rsp r = new rsp();
		String user=sc.nextLine();
		if(user.equalsIgnoreCase("q")) {
			System.out.println("����");
			break;
		}
		//������� �Է� ��
		int user1 = Integer.parseInt(user);
		if(user1>2) {
			System.out.println("�߸� �Է�. �ٽ� �Է��ϼ���");
			continue;
		}
		
		//��ǻ���� ���� ��
		int com =(int)(Math.random()*3);

		
	
		r.win(user1, com);
		//����ڰ� �� ��
//		System.out.println(r.win(user1, com));
		System.out.println("����� : "+r.getIuser());
		System.out.println("��ǻ�� : "+r.getIcom());
		System.out.println("��� "+r.getResult());
		}
		
	}

}

