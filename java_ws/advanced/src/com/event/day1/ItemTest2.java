package com.event.day1;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 이벤트 소스: choice, list
 리스너: ItemListener
 */

public class ItemTest2 extends Frame{
	Choice ch;
	List list;
	
	public ItemTest2() {
		super("ItemEvent2");
		init();
		addEvent();
	}
	
	private void init() {
		setSize(300, 200);
		setLayout(new FlowLayout());
		
		ch=new Choice();
		ch.add("java");
		ch.add("jsp");
		ch.add("spring");
		
		list = new List(3, false);
		list.add("사과");
		list.add("귤");
		list.add("딸기");
		
		add(ch);
		add(list);		
	}

	private void addEvent() {
		ch.addItemListener(new EventHandler());
		list.addItemListener(new EventHandler());
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}			
		});
	}

	class EventHandler implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getSource()==ch) {
				String str=ch.getSelectedItem();
				int idx=ch.getSelectedIndex();
				System.out.println("콤보에서 선택한 값 : " + str
						+", 선택한 index:"+idx);
			}else if(e.getSource()==list) {
				String str=list.getSelectedItem();
				int idx=list.getSelectedIndex();
				System.out.println("List에서 선택한 값 : " + str
						+", 선택한 index:"+idx);				
			}
		}
	}
	
	public static void main(String[] args) {
		ItemTest2 f = new ItemTest2();
		f.setVisible(true);
	}

}
