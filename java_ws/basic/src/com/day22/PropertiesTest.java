package com.day22;

import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		/*
		 Properties - Hashtable�� ��ӹ޾� ������ ��
		 			- (String, String)�� ���·� ����
		 			- �ַ� ���ø����̼��� ȯ�漳���� ���õ� �Ӽ��� �����ϴ� �� ���
		 			  �����͸� ���Ϸκ��� �а� ���� ��� ����
		 			  
		 */
		Properties prop = new Properties();
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "kr");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "20");
		
		String size= prop.getProperty("size");
		System.out.println("size= " + size);
		System.out.println("capacity= " + prop.getProperty("capacity", "40"));
		System.out.println("loadfactor= " + prop.getProperty("loadfactor", "0.75"));
	}

}
