package com.awt.day2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderTest {

	public static void main(String[] args) {
		Frame f = new Frame("BorderLayout");
		f.setSize(200, 200);
		
		f.setLayout(new BorderLayout(5,5));
		//=>  Frame�� �⺻������ BorderLayout�� �����Ǿ������Ƿ� ���� �������� �ʾƵ� ��
		
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
	 	- Center�� ������Ʈ�� ������ �� �ڸ��� ����ְ� ��
		- �ٸ� �ڸ��� ä���� ���� ������ Center�� ������Ʈ�� �� �ڸ��� �޿�� ��
		 */
	}

}
