package com.awt.day2;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;

public class ScrollpaneTest {

	public static void main(String[] args) {
		//ScrollPane - 단 하나의 컴포넌트만을 포함시킬 수 있는 컨테이너
		Frame f = new Frame();
		f.setSize(300,200);
		
		ScrollPane sp = new ScrollPane();
		Panel p = new Panel();
		p.setBackground(Color.green);
		p.add(new Button("첫번째"));
		p.add(new Button("두번째"));
		p.add(new Button("세번째"));
		p.add(new Button("네번째"));
		
		sp.add(p);
		f.add(sp);
		f.setVisible(true);
	}

}
