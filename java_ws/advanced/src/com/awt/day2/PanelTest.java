package com.awt.day2;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

public class PanelTest {

	public static void main(String[] args) {
		Frame f = new Frame("panel test");
		f.setSize(300, 200);
		f.setLayout(null);
		
		Panel p = new Panel();
		//Panel�� �⺻������ FlowLayout �� ���̾ƿ� �Ŵ����� ���
		p.setBackground(Color.green);
		p.setSize(100, 100);
		p.setLocation(50, 50);
		Button bt = new Button("OK");
		
		p.add(bt);
		f.add(p);
		f.setVisible(true);
	}

}
