package com.awt.day2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderTest {

	public static void main(String[] args) {
		Frame f = new Frame("BorderLayout");
		f.setSize(200, 200);
		
		f.setLayout(new BorderLayout(5,5));
		//=>  Frame은 기본적으로 BorderLayout로 설정되어있으므로 따로 설정하지 않아도 됨
		
		Button btN = new Button("North");
		Button btS = new Button("South");
		Button btE = new Button("East");
		Button btW = new Button("West");
		Button btC = new Button("Center");
		
		f.add(btC, "Center");
		f.add("North", btN);
		f.add(btS, "South");
		f.add(btE, BorderLayout.EAST);
		f.add(btW, "West");
		
		f.setVisible(true);
		
		/*
	 	- Center의 컴포넌트가 없으면 그 자리는 비어있게 됨
		- 다른 자리가 채워져 있지 않으면 Center의 컴포넌트가 그 자리를 메우게 됨
		 */
	}

}
