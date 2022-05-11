package com.awt.day2.hw;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Page46 extends Frame {
	Label lb1,lb2,lb3;
	TextField tf1,tf2,tf3;
	Button bt1,bt2;
	
	
	public Page46() {
		super("덧셈");
		
		init();
		addEvent();
	}
	private void init() {
		setSize(300, 300);
		setLayout(new GridLayout(4,2,10,10));
		setBackground(Color.pink);
		lb1 = new Label("첫번째 숫자 : ");
		lb2 = new Label("두번째 숫자 : ");
		lb3 = new Label("결과 : ");
		bt1 = new Button("더하기");
		
		tf1=new TextField();
		tf2=new TextField();
		tf3=new TextField();
		tf3.setEditable(false);
		bt2 = new Button("화면 지우기");
		
		add(lb1);
		add(tf1);
		add(lb2);
		add(tf2);
		
		add(lb3);
		add(tf3);
		add(bt1);
		add(bt2);
	}
	
	private void addEvent() {
		bt1.addActionListener(new EventHandler());
		bt2.addActionListener(new EventHandler());
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		
		});
	}

	class EventHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==bt2) {
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
			}
			
			if(e.getSource()==bt1) {
				String result="";
				
				try {
					String s1= tf1.getText();
					String s2= tf2.getText();
					double d1= Double.parseDouble(s1);
					double d2= Double.parseDouble(s2);
					result=Double.toString(d1+d2);
					
					
				}catch(NumberFormatException E) {
					result = "숫자를 입력하세요";
				}
				tf3.setText(result);
				}
			
		}
		
	}
	
	public static void main(String[] args) {
		Page46 f = new Page46();
		f.setVisible(true);
	}

}
