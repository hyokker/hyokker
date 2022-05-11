package com.awt.day2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.TextArea;

public class InsetTest extends Frame{
	Button bt1, bt2;
	TextArea ta;
	MyPanel p1;
	
	public InsetTest() {
		super("바깥 여백 주기");
		//this.setLayout(new BorderLayout());
		
		p1=new MyPanel();
		p1.setBackground(Color.cyan);
		p1.setLayout(new GridLayout(1,2,10,10));
		
		bt1=new Button("버튼1");
		bt2=new Button("버튼2");
		
		p1.add(bt1);
		p1.add(bt2);
		
		ta=new TextArea(5, 30);
		this.add(ta, "Center");
		this.add(p1, "South");
		
		this.setSize(300, 300);
		
	}
	
	@Override
	public Insets getInsets() {
		//Insets(int top, int left, int bottom, int right)
		Insets inset = new Insets(70, 20, 30, 40);
		return inset;
	}

	public static void main(String[] args) {
		InsetTest f = new InsetTest();
		f.setVisible(true);

	}

}

class MyPanel extends Panel {

	@Override
	public Insets getInsets() {
		return new Insets(10, 10, 10, 10);
	}
	
}
