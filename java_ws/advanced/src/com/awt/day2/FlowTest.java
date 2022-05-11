package com.awt.day2;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowTest {

	public static void main(String[] args) {
		Frame f = new Frame("FlowLayout");
		f.setSize(250, 100);
		f.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		f.add(new Button("첫번째"));
		f.add(new Button("두번째"));
		f.add(new Button("세번째"));
		f.add(new Button("네번째"));
		f.add(new Button("다섯번째"));
		
		f.setVisible(true);
	}

}
