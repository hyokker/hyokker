package com.event.day1;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChattingTest extends Frame implements ActionListener{
	String nickName;
	TextArea ta;
	TextField tf;
	
	public ChattingTest() {
		this("guest");
	}
	
	public ChattingTest(String nickName) {
		super("Chatting - " + nickName);
		this.nickName=nickName;
		
		init();
		addEvent();		
	}
	
	private void init() {
		setSize(300, 300);
		
		ta=new TextArea();
		tf=new TextField();
		ta.setText("#"+ nickName+"´Ô Áñ°Å¿î Ã¤ÆÃµÇ¼¼¿ä");
		ta.setEditable(false);
		
		add(ta,"Center");
		add(tf,"South");
		
		setVisible(true);
		tf.requestFocus();
	}

	private void addEvent() {
		tf.addActionListener(this);
	}

	public static void main(String[] args) {
		ChattingTest f = new ChattingTest("hong");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String msg=tf.getText();
		if(msg.equals("")) return;
		
		ta.append("\r\n" + nickName+">" + msg);
		tf.setText("");
	}

}
