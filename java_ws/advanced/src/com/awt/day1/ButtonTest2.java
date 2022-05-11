package com.awt.day1;

import java.awt.Button;
import java.awt.Frame;

public class ButtonTest2 {

	public static void main(String[] args) {
		Frame f = new Frame("Test");
		f.setLayout(null);  //레이아웃 매니저의 설정을 해제
		f.setSize(300, 200);
	
		Button bt = new Button("확인");
		bt.setSize(100, 50);
		bt.setLocation(100, 75);
		
		f.add(bt);
		f.setVisible(true);		
	}

}
