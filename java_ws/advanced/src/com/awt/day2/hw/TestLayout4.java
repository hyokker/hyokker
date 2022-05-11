package com.awt.day2.hw;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;

public class TestLayout4 {

	public static void main(String[] args) {
		Frame f = new Frame("게시판");
		f.setSize(500,500);
		f.setLayout(new GridLayout(1,2,20,20));
		
		Panel p1 = new Panel();
		p1.setLayout(new BorderLayout(10,10));
		
		Panel p2 = new Panel();
		p2.setLayout(new BorderLayout(10,10));
		
		Label lb1 = new Label("글목록");
		Label lb2 = new Label("글보기");
		
		p1.add(lb1,"North");
		p2.add(lb2,"North");
		
		List list = new List(20);
		
		p1.add(list,"Center");
		
		TextArea ta = new TextArea();
		ta.setEditable(false);
		p2.add(ta,"Center");
		
		Panel p3 = new Panel();
		p3.setLayout(new GridLayout(1,2,10,10));
		Panel p4 = new Panel();
		p4.setLayout(new GridLayout(1,3,10,10));
		
		//버튼 5개 글쓰기, 새로고침, 수정, 삭제 종료
		//p3,p4에 add
		//p3,p4를 p1,p2에 add
		Button bt1 = new Button("글쓰기");
		Button bt2 = new Button("새로고침");
		Button bt3 = new Button("수정");
		Button bt4 = new Button("삭제");
		Button bt5 = new Button("종료");
		
		p3.add(bt1);
		p3.add(bt2);
		
		p4.add(bt3);
		p4.add(bt4);
		p4.add(bt5);
		
		p1.add(p3,"South");
		p2.add(p4,"South");

		
		f.add(p1);
		f.add(p2);
		f.setVisible(true);
	}

}
