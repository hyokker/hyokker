package com.awt.day1;

import java.awt.Button;
import java.awt.Frame;

public class FrameTest1 {

	public static void main(String[] args) {
		Frame f = new Frame("Login");
		//Frame의 기본 레이아웃 - BorderLayout
		
		Button bt = new Button("확인");
		
		f.add(bt);  //생성된 버튼을 Frame에 포함시킨다
		f.setSize(300, 200);
		f.setVisible(true);
	}

}
