package com.day7;

import java.util.Scanner;

public class WhileTest1 {
	public static void main(String[]args) {
		/*
		  while ��	- �ݺ�Ƚ���� �������� ó���� ����
		  			- Ư�� ������ �ְ� �� ������ ���� �� ������ ����ؼ� �ݺ���Ű�°�
		  
		  while(�ݺ� ����){
		  		�ݺ����;
		  }
		  
		  => ������ ���ε��� �ݺ�ó��
		 */
		//public boolean hasNext()
		Scanner sc = new Scanner("\n\n������ �ϳ� �� \n\n��\n\n");
		String str="";
		while(sc.hasNext()) {
			str=sc.nextLine();
			System.out.println("��� : " + str);
		}//while
		
		str=sc.nextLine();
		System.out.println("while�� Ż�� �� 1 :" + str);
		
//		str=sc.nextLine();
//		System.out.println("while�� Ż�� �� 1 :" + str);
		
		
		System.out.println("\n\n======next()======");
		Scanner sc2 = new Scanner("\n\n������ �ϳ� �� \n\n��\n\n");
		str = "";
		while(sc2.hasNext()) {
			str=sc2.next(); //������ ����Ѵٸ�nextLine
			System.out.println("��� : " + str);
		}
		str=sc2.nextLine(); // nextLine�� enter �������� �о��.
		System.out.println("while Ż�� �� : 1"+ str);
		str=sc2.nextLine();
		System.out.println("while Ż�� �� : 2"+ str);
//		str=sc2.nextLine();
//		System.out.println("while Ż�� �� : 3"+ str);
		
		System.out.println("\n\n======nextInt()======");
		sc2 = new Scanner("\n\n123 45 6\n\n78\n\n");
		str = "";
		while(sc2.hasNext()) {
			str=sc2.next(); //������ ����Ѵٸ�nextLine
			System.out.println("��� : " + str);
		}
		str=sc2.nextLine(); // nextLine�� enter �������� �о��.
		System.out.println("while Ż�� �� : 1"+ str);
		str=sc2.nextLine();
		System.out.println("while Ż�� �� : 2"+ str);
		str=sc2.nextLine();
		System.out.println("while Ż�� �� : 3"+ str);
		}
}
