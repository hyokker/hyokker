package com.day8;

import java.util.Scanner;

public class MethodExample4 {

	public static String personNum(int a) {
		String result = "";
		if( a==1 || a==3) {
			result ="�����Դϴ�";
		}else {
			result ="�����Դϴ�";
		}
		return result;
	}
	
	public static boolean isOdd(int a) {
		boolean check = true;
		if(a%2==0) {
			check = true;
		}else {
			check = false;
		}
		return check;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹι�ȣ�� ���� �ڸ��� �Է��ϼ���. (1~4)");
		int str = sc.nextInt();
		String num = personNum(str);
		System.out.println("����� ������"+ num);
		
		System.out.println("\n���ڸ� �Է��ϼ���.");
		int a = sc.nextInt();
		
		boolean b = isOdd(a);
		String result ="";
		if(b==true) {
				result = "¦���Դϴ�.";
			}else {
				result = "Ȧ���Դϴ�.";
			}
		
		System.out.println(result);
	}

}
