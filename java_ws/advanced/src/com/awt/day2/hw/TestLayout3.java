package com.awt.day2.hw;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class TestLayout3 {

	public static void main(String[] args) {
		Frame f = new Frame("레이아웃 실습");
		
		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(2,1));
		
		Label lb1 = new Label("이름",Label.RIGHT);
		Label lb2 = new Label("주민번호",Label.RIGHT);
		p1.add(lb1);
		p1.add(lb2);
		
		Panel p2 = new Panel();
		p2.setLayout(new GridLayout(2,1));
		
		TextField tf1 = new TextField(10);
		
		Panel p3 = new Panel();
		p3.setLayout(new GridLayout(1,2,5,5));
		
		TextField tf2 = new TextField(6);
		TextField tf3 = new TextField(7);
		
		p2.add(tf1);
		p3.add(tf2);
		p3.add(tf3);
		
		p2.add(p3);
		
		Panel p4 = new Panel();
		p4.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		Button bt1= new Button("확인");
		Button bt2= new Button("취소");
		
		p4.add(bt1);
		p4.add(bt2);
		
		f.add(p1, "West");
		f.add(p2, "Center");
		f.add(p4, "South");
		
		f.setSize(200,120);
		f.setVisible(true);
	
	
	}

}
