package com.day21;

import java.io.IOException;

public class ThrowsTest3 {

	public static void main(String[] args) throws IOException{
		// public abstract int read() throws IOException
		System.out.println("���� �Է�! M/F");
		char ch = (char)System.in.read();
			
		String gender = "";
		switch(Character.toUpperCase(ch)) {
				case 'M' :
					gender="��";
					break;
				
				case 'F' :
					gender="��";
					break;
				default:
					gender="�߸� �Է�!";
					break;
		}
		
		System.out.println(gender);
	}

}
