package com.awt.day1;

import java.awt.Button;
import java.awt.Frame;

public class ButtonTest2 {

	public static void main(String[] args) {
		Frame f = new Frame("Test");
		f.setLayout(null);  //���̾ƿ� �Ŵ����� ������ ����
		f.setSize(300, 200);
	
		Button bt = new Button("Ȯ��");
		bt.setSize(100, 50);
		bt.setLocation(100, 75);
		
		f.add(bt);
		f.setVisible(true);		
	}

}
