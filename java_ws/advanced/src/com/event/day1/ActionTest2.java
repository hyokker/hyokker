package com.event.day1;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionTest2 extends Frame implements ActionListener{
	Checkbox ck1, ck2, ck3, ckM, ckF;
	Button bt;
	CheckboxGroup group;
	
	public ActionTest2() {
		super("��ư Ŭ��");
		
		init();
		addEvent();		
	}
	
	private void init() {
		setSize(300, 200);
		setLayout(new FlowLayout());
		
		ck1=new Checkbox("���");
		ck2=new Checkbox("��");
		ck3=new Checkbox("����");
		
		group=new CheckboxGroup();
		ckM=new Checkbox("��", group, false);
		ckF=new Checkbox("��", group, false);
		
		bt=new Button("Ȯ��");
		
		add(ck1);
		add(ck2);
		add(ck3);
		add(ckM);
		add(ckF);
		add(bt);		
	}

	private void addEvent() {
		bt.addActionListener(this);
	}

	public static void main(String[] args) {
		ActionTest2 f=new ActionTest2();
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String result="", gender="";
		if(ckM.getState()) {
			gender="����";
		}else if(ckF.getState()) {
			gender="����";			
		}
		
		if(ck1.getState()) {
			result+=ck1.getLabel()+" ";
		}
		if(ck2.getState()) {
			result+=ck2.getLabel()+" ";
		}
		if(ck3.getState()) {
			result+=ck3.getLabel()+" ";
		}
		
		System.out.println("����:"+gender+", ������ ����:"+ result);
	}

}
