package com.awt.day2;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;

public class ScrollpaneTest {

	public static void main(String[] args) {
		//ScrollPane - �� �ϳ��� ������Ʈ���� ���Խ�ų �� �ִ� �����̳�
		Frame f = new Frame();
		f.setSize(300,200);
		
		ScrollPane sp = new ScrollPane();
		Panel p = new Panel();
		p.setBackground(Color.green);
		p.add(new Button("ù��°"));
		p.add(new Button("�ι�°"));
		p.add(new Button("����°"));
		p.add(new Button("�׹�°"));
		
		sp.add(p);
		f.add(sp);
		f.setVisible(true);
	}

}
