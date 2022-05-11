package com.awt.day2.hw;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Panel;

public class TestLayout1 extends Frame{
	MyPanel p1,p2;
	Button bt1,bt2,bt3,bt4,bt5,bt6;
	
	public TestLayout1() {
		super("���̾ƿ� �ǽ�");
		
		p1=new MyPanel();
		p1.setBackground(Color.pink);
		p1.setLayout(new GridLayout(2,2,10,10));
		
		
		bt1= new Button("��ư1");
		bt2= new Button("��ư2");
		bt3= new Button("��ư3");
		bt4= new Button("��ư4");
		bt5= new Button("��ư5");
		bt6= new Button("��ư6");
		
		p1.add(bt1);
		p1.add(bt2);
		p1.add(bt3);
		p1.add(bt4);
		
		p2=new MyPanel();
		p2.setBackground(Color.cyan);
		p2.setLayout(new GridLayout(1,2,10,10));
		
		p2.add(bt5);
		p2.add(bt6);
		
		this.add(p1,"Center");
		this.add(p2,"East");
		
		this.setSize(300,300);
	}
	
	
	
	@Override
	public Insets getInsets() {
		//Insets(int top, int left, int bottom, int right)
		Insets inset = new Insets(30,30,30,30);
		return inset;
	
	}



	public static void main(String[] args) {
		TestLayout1 f = new TestLayout1();
		f.setVisible(true);
	}

}

class MyPanel extends Panel{

	@Override
	public Insets getInsets() {
		return new Insets(10, 10, 10, 10);
	}
	
}