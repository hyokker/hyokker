package com.awt.day2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridTest {

	public static void main(String[] args) {
		Frame f = new Frame("GridLayout");
		f.setSize(150, 150);
		f.setLayout(new GridLayout(3, 2,5,5)); //3행 2열의 테이블
		
		f.add(new Button("1"));
		f.add(new Button("2"));
		f.add(new Button("3"));
		f.add(new Button("4"));
		f.add(new Button("5"));
		f.add(new Button("6"));
		
		f.setVisible(true);
	}

}
