package com.awt.day2;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class DialogTest {

	public static void main(String[] args) {
		Frame f = new Frame("Parent");
		f.setSize(300, 200);
		
		Dialog info = new Dialog(f,"Information", true);  //modal
		info.setSize(140, 90);
		info.setLocation(50, 50);
		info.setLayout(new FlowLayout());
		
		Label lb = new Label("This is modal Dialog", Label.CENTER);
		Button bt = new Button("OK");
		info.add(lb);
		info.add(bt);
		
		f.setVisible(true);
		info.setVisible(true);
	}

}
