package com.awt.day2.hw;

import java.awt.CheckboxMenuItem;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Test2 {

	public static void main(String[] args) {
		Frame f = new Frame("Menu �ǽ�");
		f.setSize(300,200);
		
		MenuBar mb = new MenuBar();
		
		Menu mSearch = new Menu("�˻�");
		MenuItem miã�� = new MenuItem("ã��");
		MenuItem mi�ٲٱ� = new MenuItem("�ٲٱ�");
		
		Menu ǥ�� = new Menu("ǥ��");
		//MenuItem ǥ�ļ��� = new MenuItem("ǥ��/��������");
		CheckboxMenuItem ǥ�ļ��� = new CheckboxMenuItem("ǥ�ļ���/����");
		MenuItem ����ǥ�� = new MenuItem("����ǥ������");
		
		mSearch.add(miã��);
		mSearch.add(mi�ٲٱ�);
		mSearch.addSeparator();
		mSearch.add(ǥ��);
		
		ǥ��.add(ǥ�ļ���);
		ǥ��.add(����ǥ��);
		
		Menu ���� = new Menu("����");
		Menu â = new Menu("â");
		Menu ���� = new Menu("����");
		
		mb.add(mSearch);
		mb.add(����);
		mb.add(â);
		mb.add(����);
		

		f.setMenuBar(mb);
		
		f.setVisible(true);

	}

}
