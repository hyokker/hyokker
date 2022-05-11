package com.awt.day1;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;

public class ListTest {

	public static void main(String[] args) {
		Frame f = new Frame("List test");
		f.setSize(400, 200);
		f.setLayout(new FlowLayout());
		
		List list = new List(4);
		list.add("java");
		list.add("jsp");
		list.add("oracle");
		list.add("html");
		list.add("spring");
		
		List list2 = new List(5, true); //���� ����
		list2.add("���");
		list2.add("��");
		list2.add("����");
		list2.add("����");
		list2.add("�丶��");
		
		f.add(list);
		f.add(list2);		
		f.setVisible(true);
	}

}
