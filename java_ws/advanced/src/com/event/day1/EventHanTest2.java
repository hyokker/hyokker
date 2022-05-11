package com.event.day1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHanTest2 extends Frame implements ActionListener{
	Button bt;
	
	public EventHanTest2() {
		super("Event2");
		init();
		addEvent();
	}
	
	private void init() {
		setSize(300, 200);
		setLayout(new FlowLayout());
		
		bt=new Button("¹öÆ°");
		add(bt);
	}

	private void addEvent() {
		bt.addActionListener(this);
	}

	public static void main(String[] args) {
		EventHanTest2 f = new EventHanTest2();
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

}
