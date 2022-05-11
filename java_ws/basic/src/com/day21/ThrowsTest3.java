package com.day21;

import java.io.IOException;

public class ThrowsTest3 {

	public static void main(String[] args) throws IOException{
		// public abstract int read() throws IOException
		System.out.println("성별 입력! M/F");
		char ch = (char)System.in.read();
			
		String gender = "";
		switch(Character.toUpperCase(ch)) {
				case 'M' :
					gender="남";
					break;
				
				case 'F' :
					gender="여";
					break;
				default:
					gender="잘못 입력!";
					break;
		}
		
		System.out.println(gender);
	}

}
