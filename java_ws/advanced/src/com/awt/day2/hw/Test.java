package com.awt.day2.hw;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

public class Test {

	public static void main(String[] args) {
		Frame f = new Frame("�ϱ⿹��");
		f.setSize(270,250);
		f.setLayout(new FlowLayout());
		
		Label lb1 = new Label("�̸�");
		TextField tf = new TextField(5);
	
		Label lb2 = new Label("��й�ȣ");
		TextField tf2 = new TextField(5);
		tf2.setEchoChar('*');
		
		Label lb3 = new Label("����");
		CheckboxGroup group = new CheckboxGroup();
		Checkbox ck1 = new Checkbox("����", group, true);
		Checkbox ck2 = new Checkbox("��", group,	false);
		Checkbox ck3 = new Checkbox("��", group, false);
		Checkbox ck4 = new Checkbox("����", group, false);
		
		Label lb4 = new Label("��������");
		Checkbox ck5 = new Checkbox("����,���");
		Checkbox ck6 = new Checkbox("��û");
		Checkbox ck7 = new Checkbox("����");
		
		Label lb5 = new Label("���");
		Choice ch = new Choice();
		ch.add("�౸");
		ch.add("�߱�");
		ch.add("����");
		ch.add("��ȭ����");
		
		Label lb6 = new Label("�ڱ�Ұ�");
		TextArea ta = new TextArea(10, 30);
		
		f.add(lb1);
		f.add(tf);
		f.add(lb2);
		f.add(tf2);
		
		f.add(lb3);
		f.add(ck1);
		f.add(ck2);
		f.add(ck3);
		f.add(ck4);
		
		f.add(lb4);
		f.add(ck5);
		f.add(ck6);
		f.add(ck7);
		
		f.add(lb5);
		f.add(ch);
		
		f.add(lb6);
		f.add(ta);
		f.setVisible(true);
	
	
	}

}
