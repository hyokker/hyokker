package com.awt.day2;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class CalculatorTest {

	public static void main(String[] args) {
		Frame f = new Frame("°è»ê±â");
		TextField tf = new TextField("0");
		tf.setEditable(false);
		
		f.setSize(190, 160);
		f.add(tf,"North");
		
		Panel plNum = new Panel();
		String[] numArr = {
			"7","8","9","/","CE",
			"4","5","6","*","BS",
			"1","2","3","-","1/x",
			"0","+/-",".","+","="
		};
		Button[] btNums = new Button[numArr.length];
		
		plNum.setLayout(new GridLayout(4,5,4,4));
		plNum.setBackground(Color.lightGray);
		f.add(plNum,"Center");
		
		for(int i=0;i<numArr.length;i++) {
			btNums[i] = new Button(numArr[i]);
			btNums[i].setForeground(Color.blue);
			plNum.add(btNums[i]);
		}
		
		f.setResizable(false);
		f.setVisible(true);
	}

}
