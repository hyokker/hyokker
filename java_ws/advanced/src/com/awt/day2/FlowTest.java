package com.awt.day2;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowTest {

	public static void main(String[] args) {
		Frame f = new Frame("FlowLayout");
		f.setSize(250, 100);
		f.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		f.add(new Button("ù��°"));
		f.add(new Button("�ι�°"));
		f.add(new Button("����°"));
		f.add(new Button("�׹�°"));
		f.add(new Button("�ټ���°"));
		
		f.setVisible(true);
	}

}
