package com.day22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesTest2 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		
		InputStream is;
		try{
			is = new FileInputStream("text/input.txt");
			prop.load(is); //���Ͽ� �ִ� �����͸� Properties �÷��ǿ� ����
		}catch(FileNotFoundException e ) {
			e.printStackTrace();
		}catch(IOException e ) {
			e.printStackTrace();
		}
		
		String name=prop.getProperty("name");
		String data=prop.getProperty("data");
		System.out.println("name= "+ name);
		System.out.println("data= "+ data);
		
	}

}
