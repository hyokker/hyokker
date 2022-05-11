//package com.Hw;
////package com.Hw;
////
////public class Test {
////
////	public static void main(String[] args) {
////		int[] arr = new int[3];
////		arr[0] = 1;
////		arr[1] = 4;
////		arr[2] = 6;
////		int[] arr2 = new int[3];
////		arr2[0] = 6;
////		arr2[1] = 4;
////		arr2[2] = 1;
////
////		int strike = 0;
////		int ball = 0;
////		// 0 0
////		for (int i = 0; i < 3; i++) {
////			if (arr[i] == arr2[i]) {
////				System.out.println("스트라이크");
////				strike++;
////			}
////			for (int j = 0; j < 3; j++) {
////				if (i != j) {
////					if (arr[i] == arr2[j]) {
////						System.out.println("볼");
////						ball++;
////					}
////
////				}
////			}
////		}
////		System.out.println(strike);
////		System.out.println(ball);
////	}
////}
//class Emp{
//	private String idNo;
//	private String name;
//	private int pay;
//	
//	Emp(String idNo, String name, int pay){
//	this.idNo=idNo;
//	this.name=name;
//	this.pay=pay;
//	}
//
//	public String getIdNo(){
//	return idNo;
//	}
//	public String getName(){
//	return name;
//	}
//	public int getPay(){
//	return pay;
//	}
//
//	public String toString(){
//	return "이름 : " + name + "사원번호 : " + idNo + " 급여 : " + pay;
//	}
//}
//
//public class Test {
//	public static void main(String[] args){
//	ArrayList<Emp> list = new ArrayList<Emp>();
//	Scanner sc = new Scanner(System.in);
//	System.out.println("이름, 사원번호, 급여 입력!");
//	list.add(sc.nextLine(),sc.nextLine(),sc.nextInt();
//	list.add(sc.nextLine(),sc.nextLine(),sc.nextInt();
//	list.add(sc.nextLine(),sc.nextLine(),sc.nextInt();
//
//	for(int i=0;i<list.size();i++{
//	System.out.println(list);
//	}