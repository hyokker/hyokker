package com.day22;

import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		/*
		 Properties - Hashtable을 상속받아 구현한 것
		 			- (String, String)의 형태로 저장
		 			- 주로 어플리케이션의 환경설정과 관련된 속성을 저장하는 데 사용
		 			  데이터를 파일로부터 읽고 쓰는 기능 제공
		 			  
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
