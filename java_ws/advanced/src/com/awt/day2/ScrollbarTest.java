package com.awt.day2;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Scrollbar;

public class ScrollbarTest {

	public static void main(String[] args) {
		Frame f = new Frame("Scrollbar");
		f.setSize(300, 500);
		f.setLayout(null);
		
		//Scrollbar(int orientation, int value, int visible, 
		//				int minimum, int maximum)
		Scrollbar hor = new Scrollbar(Scrollbar.HORIZONTAL,0,50,0,100);
		hor.setSize(100, 15);
		hor.setLocation(60, 30);
		
		Scrollbar ver = new Scrollbar(Scrollbar.VERTICAL, 50, 20, 0, 100);
		ver.setSize(15, 100);
		ver.setLocation(30, 30);
		
		Canvas c = new Canvas();
		c.setBackground(Color.pink);
		c.setBounds(50, 200, 150, 100);
		//setBounds(int x, int y, int width, int height)
		
		f.add(hor);
		f.add(ver);
		f.add(c);
		
		f.setVisible(true);
	}

}
