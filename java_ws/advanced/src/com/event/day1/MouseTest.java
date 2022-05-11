package com.event.day1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/*
 이벤트 소스: frame
 리스너: MouseMotionListener
 */

public class MouseTest extends Frame{
	Label lb;
	
	public MouseTest() {
		super("MouseEvent");
		
		init();
		addEvent();
	}
	
	private void init() {
		setSize(400, 300);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		lb=new Label("Mouse Pointer Location : ");
		lb.setBackground(Color.yellow);
		
		add(lb);
	}
	
	private void addEvent() {
		this.addMouseMotionListener(new EventHandler());
	}

	class EventHandler implements MouseMotionListener{
		@Override
		public void mouseDragged(MouseEvent e) {			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			lb.setText("Location: x="+e.getX()+", y="+e.getY());
		}		
	}//inner class
	
	public static void main(String[] args) {
		MouseTest f = new MouseTest();
		f.setVisible(true);
	}

}
