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
		Frame f = new Frame("���̾ƿ� �ǽ�");
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		
		Button bt1= new Button("Ȯ��");
		Button bt2= new Button("���");
		
		TextField tf1= new TextField(10);
		TextField tf2= new TextField(10);
		tf2.setEchoChar('*');

	
		Label lb1 = new Label("���̵�",Label.RIGHT); 
		Label lb2 = new Label("��й�ȣ",Label.RIGHT); 
		
		p1.setLayout(new GridLayout(2,1));
			
		p1.add(tf1);
		p1.add(tf2);
		
		p2.setLayout(new GridLayout(2,1));
		
		p2.add(lb1);
		p2.add(lb2);
		
		p3.setLayout(new FlowLayout());
		bt1= new Button("Ȯ��");
		bt2= new Button("���");
		
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
