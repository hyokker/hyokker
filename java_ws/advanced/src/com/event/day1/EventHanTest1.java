package com.event.day1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHanTest1 extends Frame{
	Button bt1, bt2;
	
	public EventHanTest1() {
		super("Event");
		init();
		addEvent();
	}
	
	private void init() {
		setSize(300, 300);
		setLayout(new FlowLayout());
		bt1=new Button("내부 클래스");
		bt2=new Button("익명 클래스");
		
		add(bt1);
		add(bt2);		
	}

	private void addEvent() {
		bt1.addActionListener(new Handler());
		
		bt2.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("종료함!");
				System.exit(0);
			}
		});
	}

	class Handler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
		
	}
	
	public static void main(String[] args) {
		EventHanTest1 f = new EventHanTest1();
		f.setVisible(true);
	}

}
