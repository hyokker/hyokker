package com.awt.day1;

import java.awt.Button;
import java.awt.Frame;

public class FrameTest1 {

	public static void main(String[] args) {
		Frame f = new Frame("Login");
		//Frame�� �⺻ ���̾ƿ� - BorderLayout
		
		Button bt = new Button("Ȯ��");
		
		f.add(bt);  //������ ��ư�� Frame�� ���Խ�Ų��
		f.setSize(300, 200);
		f.setVisible(true);
	}

}
