package com.event.day1;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 이벤트 소스: 첫번째 텍스트 필드
 리스너:KeyListener
 */

public class KeyTest extends Frame {
	Label lb1, lb2;
	TextField tfSsn1, tfSsn2;
	
	public KeyTest() {
		super("KeyEvent");	
		init();
		addEvent();
	}
	
	private void init() {
		setSize(400, 200);
		setLayout(new FlowLayout());
		
		lb1=new Label("주민번호 : ");
		lb2=new Label(" - ");
		tfSsn1=new TextField(10);
		tfSsn2=new TextField(10);
		
		add(lb1);
		add(tfSsn1);
		add(lb2);
		add(tfSsn2);		
	}
	
	private void addEvent() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}			
		});
		
		tfSsn1.addKeyListener(new EventHandler());
	}

	class EventHandler extends KeyAdapter{
		@Override
		public void keyReleased(KeyEvent e) {
			String ssn1=tfSsn1.getText();
			if(ssn1.length()==6) {
				tfSsn2.requestFocus();
			}
		}		
	}	

	public static void main(String[] args) {
		KeyTest f = new KeyTest();
		f.setVisible(true);
	}

}
