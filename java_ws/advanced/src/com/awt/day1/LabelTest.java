package com.awt.day1;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class LabelTest {

	public static void main(String[] args) {
		Frame f = new Frame("Label test");
		f.setSize(400, 200);
		f.setLayout(new FlowLayout());
		
		Label lb1 = new Label("ID : ");
		Label lb2 = new Label("Password", Label.RIGHT);
		
		TextField tfId = new TextField(10);
		TextField tfPwd = new TextField(10);
		tfPwd.setEchoChar('*');  //입력값 대신 * 이 보이도록 함
		
		f.add(lb1);
		f.add(tfId);		
		f.add(lb2);
		f.add(tfPwd);
		f.setVisible(true);		
	}

}
