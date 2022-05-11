package com.swing.day1;

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

public class Test0408_1 extends Frame {
	Button bt1, bt2;
	Label lb1, lb2, lb3;
	TextField tf1, tf2, tf3;

	public Test0408_1() {
		super("덧셈");

		init();
		addEvent();
	}

	private void init() {
		setLayout(new GridLayout(4, 2, 5, 5));
		setBackground(Color.pink);
		setSize(300, 300);

		bt1 = new Button("더하기");
		bt2 = new Button("화면지우기");

		lb1 = new Label("첫번째 숫자 :");
		lb2 = new Label("두번째 숫자 :");
		lb3 = new Label("결과 :");

		tf1 = new TextField();
		tf2 = new TextField();
		tf3 = new TextField();
		tf3.setEditable(false);

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

	class EventHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == bt2) {
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
			}
			if (e.getSource() == bt1) {
				String result = "";
			try {
					String s1 = tf1.getText();
					String s2 = tf2.getText();
					double d1 = Double.parseDouble(s1);
					double d2 = Double.parseDouble(s2);
					result = Double.toString(d1 + d2);
				} catch (NumberFormatException e1) {
				System.out.println("숫자를 입력하세요");
			}
			tf3.setText(result);
			}
		}
	}
	public static void main(String[] args) {
		Test0408_1 f= new Test0408_1();
		f.setVisible(true);
	}
}