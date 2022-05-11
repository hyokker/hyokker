package com.awt.day2.hw;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class TestLayout2 {
	public static void main(String[] args) {
		Frame f = new Frame("레이아웃 실습");
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		
		Button bt1= new Button("확인");
		Button bt2= new Button("취소");
		
		TextField tf1= new TextField(10);
		TextField tf2= new TextField(10);
		tf2.setEchoChar('*');

	
		Label lb1 = new Label("아이디",Label.RIGHT); 
		Label lb2 = new Label("비밀번호",Label.RIGHT); 
		
		p1.setLayout(new GridLayout(2,1));
			
		p1.add(tf1);
		p1.add(tf2);
		
		p2.setLayout(new GridLayout(2,1));
		
		p2.add(lb1);
		p2.add(lb2);
		
		p3.setLayout(new FlowLayout());
		bt1= new Button("확인");
		bt2= new Button("취소");
		
		p3.add(bt1);
		p3.add(bt2);
		
		f.setSize(265,130);
		f.setLayout(new BorderLayout());
		f.add(p1,"Center");
		f.add(p2,"West");
		f.add(p3,"South");
		f.setVisible(true);
	}

}
