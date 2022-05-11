package com.HomeWork;

public class PhoneInfo {
	protected String name;
	protected String phoneNumber;
	//private String birth;

	public PhoneInfo(){	
	}

	public PhoneInfo(String name, String phoneNumber, String birth)	{
		this.name=name;
		this.phoneNumber=phoneNumber;
		//this.birth=birth;
	}

	public PhoneInfo(String name, String phoneNumber){
		this.name=name;
		this.phoneNumber=phoneNumber;
	}

	//getter/setter
	public String getName()	{
		return name;
	}

	public void showPhoneInfo(){
		System.out.println("name: "+name);
		System.out.println("phone: "+phoneNumber);

//		if(birth!=null && !birth.isEmpty())
//			System.out.println("birth: "+birth);

		System.out.println();	
	}

}

class PhoneUnivInfo extends PhoneInfo{
	private String major;
	private int year;
	
	PhoneUnivInfo(String name, String phoneNumber,String major,int year) {
		super(name,phoneNumber);
		this.major=major;
		this.year=year;
	}
	public void showPhoneInfo(){
		System.out.println("name: "+name);
		System.out.println("phone: "+phoneNumber);
		System.out.println("major: "+major);
		System.out.println("year:"+year);
		System.out.println();
	}
}

class PhoneCompanyInfo extends PhoneInfo{
	private String company;
	
	PhoneCompanyInfo(String name, String phoneNumber, String company){
	super(name,phoneNumber);
	this.company=company;
	}
	
	public void showPhoneInfo(){
		System.out.println("name: "+name);
		System.out.println("phone: "+phoneNumber);
		System.out.println("company: "+company );
		System.out.println();
	}
}