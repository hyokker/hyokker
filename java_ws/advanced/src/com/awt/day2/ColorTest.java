package com.awt.day2;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class ColorTest {

	public static void main(String[] args) {
		Frame f = new Frame("Color");
		f.setLayout(new GridLayout(14,1)); //14За 1ї­
		
		Panel p1=new Panel();
		p1.setBackground(Color.black);
		Panel p2=new Panel();
		p2.setBackground(Color.blue);
		Panel p3=new Panel();
		p3.setBackground(Color.cyan);
		Panel p4=new Panel();
		p4.setBackground(Color.DARK_GRAY);
		Panel p5=new Panel();
		p5.setBackground(Color.gray);
		Panel p6=new Panel();
		p6.setBackground(Color.GREEN);
		Panel p7=new Panel();
		p7.setBackground(Color.lightGray);
		Panel p8=new Panel();
		p8.setBackground(Color.magenta);
		Panel p9=new Panel();
		p9.setBackground(Color.ORANGE);
		Panel p10=new Panel();
		p10.setBackground(Color.pink);
		Panel p11=new Panel();
		p11.setBackground(Color.red);
		Panel p12=new Panel();
		p12.setBackground(Color.WHITE);
		Panel p13=new Panel();
		p13.setBackground(Color.yellow);
		Panel p14=new Panel();
		p14.setBackground(new Color(50,100,100));
		
		f.add(p1);
		f.add(p2);
		f.add(p3);
		f.add(p4);
		f.add(p5);
		f.add(p6);
		f.add(p7);
		f.add(p8);
		f.add(p9);
		f.add(p10);
		f.add(p11);
		f.add(p12);
		f.add(p13);
		f.add(p14);
		f.setSize(250, 400);
		f.setVisible(true);
	}

}
