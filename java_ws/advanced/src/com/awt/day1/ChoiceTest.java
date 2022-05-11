package com.awt.day1;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;

public class ChoiceTest {

	public static void main(String[] args) {
		Frame f = new Frame("Choice Test");
		f.setSize(300, 200);
		f.setLayout(new FlowLayout());
		
		Choice ch = new Choice();
		ch.add("java");
		ch.add("oracle");
		ch.add("spring");
		
		f.add(ch);
		f.setVisible(true);
		
	}

}
