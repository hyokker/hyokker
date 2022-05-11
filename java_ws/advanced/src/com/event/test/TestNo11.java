package com.event.test;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestNo11 extends Frame implements ActionListener {
	Label lb1,lb2,lb3;
	TextField tf1,tf2;
	TextArea ta;
	Button bt1,bt2,bt3,bt4,bt5;
	Panel pl1,pl2,pl3;
	
	
	public TestNo11(){
		super("레이아웃 연습");
		init();
		addEvent();
		
	}
	private void init() {
		setSize(500,300);
		setLayout(new GridLayout(1,2,10,10));
		
		lb1= new Label("아이디",Label.RIGHT);
		lb2= new Label("비밀번호",Label.RIGHT);
		tf1= new TextField();
		tf2= new TextField();
		tf2.setEchoChar('*');
		
		bt1= new Button("로그인");
		bt2= new Button("취소");
		
		pl1=new Panel();
		pl2=new Panel();
		
		pl1.setLayout(new FlowLayout());

		pl1.add(lb1);
		pl1.add(tf1);
		pl1.add(lb2);
		pl1.add(tf2);
		pl1.add(bt1);
		pl1.add(bt2);
		
		pl2.setLayout(new BorderLayout());
		lb3 = new Label("글보기");
		ta = new TextArea(10,10);
		ta.setEditable(false);
		pl3 = new Panel();
		pl3.setLayout(new GridLayout(1,3,5,5));;
		bt3 = new Button("수정");
		bt4 = new Button("삭제");
		bt5 = new Button("종료");
		
		pl2.add(lb3,"North");
		pl2.add(ta,"Center");
		
		pl3.add(bt3);
		pl3.add(bt4);
		pl3.add(bt5);
		pl2.add(pl3,"South");
		
		add(pl1,"West");
		add(pl2, "East");
		
		
	}
	
	private void addEvent() {
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		
		});
		bt1.addActionListener(this);
	}



	public static void main(String[] args) {
		TestNo11 f = new TestNo11();
		f.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
