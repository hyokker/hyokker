package com.day24;

public class ConcatTest {

	public static void main(String[] args) {
		//concat() - �� ���ڿ� ����
		//String concat(String str)
		String str1 = "Happy";
		String str2 = " and ";
		String str3 = "Smile";
		String str4 = str1.concat(str2).concat(str3);
		//str4=str1+str2+str3
		//�߰��� ������ �ν��Ͻ��� ���� 2��
		System.out.println(str4);
		
		if(str1.compareTo(str3)<0) {
			System.out.println("str1�� �ռ���(�� �۴�)");
		}else {
			System.out.println("str3�� �ռ���");	
		}
		
	}

}
