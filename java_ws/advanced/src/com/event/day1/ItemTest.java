package com.event.day1;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/*
 이벤트 소스 : checkbox
 리스너 : ItemListener
 */

public class ItemTest extends Frame{
	Checkbox ck1, ck2, ck3;
	TextField tfResult;
	CheckboxGroup group;
	
	public ItemTest() {
		super("ItemEvent");
		
		init();
		addEvent();
	}
	
	private void init() {
		setSize(300, 200);
		setLayout(new FlowLayout());
		
		group=new CheckboxGroup();
		ck1=new Checkbox("java", group, false);
		ck2=new Checkbox("jsp", group, false);
		ck3=new Checkbox("oracle", group, false);
		
		tfResult=new TextField(30);
		
		add(ck1);
		add(ck2);
		add(ck3);
		add(tfResult);		
	}
	
	private void addEvent() {
		ck1.addItemListener(new EventHandler());
		ck2.addItemListener(new EventHandler());
		ck3.addItemListener(new EventHandler());
	}

	class EventHandler implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			Checkbox ch= (Checkbox) e.getSource(); //이벤트가 발생한 소스(컴포넌트)구하기
			String str=ch.getLabel();
			
			tfResult.setText(str);
		}
		
	}

	public static void main(String[] args) {
		ItemTest f = new ItemTest();
		f.setVisible(true);
	}

}
