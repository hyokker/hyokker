package com.event.day1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 이벤트 소스:버튼, 텍스트필드 2개
 리스너:ActionListener
 */

public class ActionTest extends Frame{
	Button bt;
	TextField tfId, tfPwd;
	Label lb1, lb2;
	
	public ActionTest() {
		super("로그인");
		
		this.setSize(450, 200);
		this.setLayout(new FlowLayout());
		
		bt=new Button("OK");
		tfId=new TextField(10);
		tfPwd=new TextField(10);
		tfPwd.setEchoChar('*');
		
		lb1=new Label("ID : ", Label.RIGHT);
		lb2=new Label("Password : ", Label.RIGHT);
		
		this.add(lb1);
		this.add(tfId);
		this.add(lb2);
		this.add(tfPwd);
		this.add(bt);
		
		//event연결
		this.addWindowListener(new Handler());
		bt.addActionListener(new EventHandler());
		tfId.addActionListener(new EventHandler());
		tfPwd.addActionListener(new EventHandler());
	}
	
	class Handler extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}		
	}
	
	class EventHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String id=tfId.getText();
			String pwd=tfPwd.getText();
			
			if(!id.equals("hong")) {
				System.out.println("id가 유효하지 않다");
				tfId.requestFocus();
				tfId.selectAll();
			}else if(!pwd.equals("1234")) {
				System.out.println("비밀번호 틀렸다");
				tfPwd.requestFocus();
				tfPwd.selectAll();				
			}else {
				System.out.println(id+"님 로그인 됨!");
			}
				
		}		
	}
	
	public static void main(String[] args) {
		ActionTest f = new ActionTest();
		f.setVisible(true);
	}

}
