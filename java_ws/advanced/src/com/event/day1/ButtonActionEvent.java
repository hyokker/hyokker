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

public class ButtonActionEvent extends Frame{
	private Button bt;
	private TextField tf;
	private Label lbResult;
	
	public ButtonActionEvent() {
		super("��ư Ŭ�� ����");
		this.setLayout(new FlowLayout());
		
		bt=new Button("Ȯ��");
		tf=new TextField(20);
		lbResult=new Label("���⿡ ����� ��µ˴ϴ�.");
		
		this.add(tf);
		this.add(bt);
		this.add(lbResult);
		
		this.setSize(300, 200);
		this.setVisible(true);
		
		//�̺�Ʈ ����
		/*
		 �̺�Ʈ �ҽ� - Button(bt)
		 ������ - ActionListener
		 */
		bt.addActionListener(new EventHandler());
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		}); //�͸� Ŭ����
	}
	
	class EventHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//�̺�Ʈ ó�� �ڵ� �ֱ�
			String cmd=e.getActionCommand(); //�̺�Ʈ�ҽ�[��ư]�� ��(���ڿ�)�� ����
												//�ش�.
			lbResult.setText(tf.getText()+", " + cmd+"��ư Ŭ����!");
		}		
	}//���� Ŭ����
	
	public static void main(String[] args) {
		ButtonActionEvent f = new ButtonActionEvent();
	}

}
