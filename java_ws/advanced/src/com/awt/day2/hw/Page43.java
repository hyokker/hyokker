package com.awt.day2.hw;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Page43 extends Frame implements ActionListener{
	Panel p1,p2;
	
	Checkbox ck1, ck2, ck3, ck4, ck5, ck6, ck7, ck8;
	CheckboxGroup group;
	Label lb1,lb2,lb3;
	double score=0;
	Button bt;
	
	
	
	public Page43() {
		super("CheckboxEventTest");
		
		init();
		addEvent();
		
	}
	private void init() {
		setSize(500,400);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		lb1= new Label("1.������ ActionEvent�� "
				+ "actionPerformed�޼��尡 ȣ��Ǵ� ����? (��ΰ��ÿ�)",Label.LEFT);
		
		ck1= new Checkbox("Button�� ��������" + Checkbox.LEFT_ALIGNMENT);
		ck2= new Checkbox("TextField���� EnterŰ�� ��������");
		ck3= new Checkbox("MenuItem�� Ŭ��������");
		ck4= new Checkbox("List���� ����Ŭ������ item�� ����������");
		
		lb2= new Label("Frame�� �⺻ LayoutManager��?(�ϳ���������)",Label.LEFT);
		group = new CheckboxGroup();
		
		ck5= new Checkbox("FlowLayout", false, group);
		ck6= new Checkbox("GridLayout", false, group);
		ck7= new Checkbox("BorderLayout", false, group);
		ck8= new Checkbox("CardLayout", false, group);
		
		bt= new Button("�� ��ư�� �����ø� ����� �˼� �ֽ��ϴ�");
		
		lb3=new Label("");
		
		p1 = new Panel();
		p1.setLayout(new GridLayout(11,1));
		p1.add(lb1);
		p1.add(ck1);
		p1.add(ck2);
		p1.add(ck3);
		p1.add(ck4);
		
		p1.add(lb2);
		p1.add(ck5);
		p1.add(ck6);
		p1.add(ck7);
		p1.add(ck8);
		add(p1);
		
		p2= new Panel();
		p2.setLayout(new GridLayout(2,1));
		p2.add(bt);
		p2.add(lb3);
		add(p2,"South");
	}
		
private void addEvent() {
		bt.addActionListener(this);
		
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		
		});
}



	
	
	
	public static void main(String[] args) {
		Page43 f = new Page43();
		f.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(ck1.getState())score+=12.5;
		if(ck2.getState())score+=12.5;
		if(ck3.getState())score+=12.5;
		if(ck4.getState())score+=12.5;
		if(ck7.getState())score+=50;
		lb3.setText("");
		lb3.setText("��� : ����� ������ " + score+"�� �Դϴ�.");
		}
	}


