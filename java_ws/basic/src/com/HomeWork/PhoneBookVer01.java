package com.HomeWork;
/*
 * ��ȭ��ȣ ���� ���α׷� 
 * Version 0.1
 */

/*
class PhoneInfo{
	private String name;
	private String phoneNumber;
	private String birth;
	
	public PhoneInfo(){	
	}

	public PhoneInfo(String name, String phoneNumber, String birth)	{
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.birth=birth;
	}

	public PhoneInfo(String name, String phoneNumber){
		this.name=name;
		this.phoneNumber=phoneNumber;
	}

	public void showPhoneInfo(){
		System.out.println("name: "+name);
		System.out.println("phone: "+phoneNumber);

		if(birth!=null && !birth.isEmpty())
			System.out.println("birth: "+birth);
		
		System.out.println();	
	}
}
*/

class PhoneBookVer01{
	public static void main(String[] args)	{
		PhoneInfo pInfo1=new PhoneInfo("ȫ�浿", "010-100-2000", "99-01-17");
		PhoneInfo pInfo2=new PhoneInfo("��浿", "010-300-4000");

		pInfo1.showPhoneInfo();
		pInfo2.showPhoneInfo();		
	}
}