package com.event.test;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestNo12 extends Frame {
	Panel pl1,pl2;
	Label lb1,lb2;
	Choice ch;
	List li;
	TextField tf;
		
	public TestNo12 () {
		super("event test");
		init();
		addEvent();
	}
	private void init() {
		setSize(400,300);
		setLayout(new BorderLayout());
		
		pl1=new Panel();
		pl1.setLayout(new FlowLayout());
		
		lb1= new Label("사용가능 언어");
		ch = new Choice();
		ch.add("java");
		ch.add("oracle");
		ch.add("jsp");
		
		lb2= new Label("취미");
		li= new List();
		li.add("축구");
		li.add("야구");
		li.add("여행");
		li.add("영화");
		
		pl1.add(lb1);
		pl1.add(ch);
		pl1.add(lb2);
		pl1.add(li);
		add(pl1,"Center");
		
		tf=new TextField();
		tf.setEditable(false);
		add(tf,"South");
	}
	
	private void addEvent() {
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		
		});
		
		ch.addItemListener(new EventHandler());
		li.addItemListener(new EventHandler());
	}
	
	class EventHandler implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getSource()==ch)tf.setText(ch.getSelectedItem());
			if(e.getSource()==li)tf.setText(li.getSelectedItem());
			
		}
		
	}
	public static void main(String[] args) {
		TestNo12 f = new TestNo12();
		f.setVisible(true);
	}

}
