package com.awt.day2.hw;

import java.awt.CheckboxMenuItem;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Test2 {

	public static void main(String[] args) {
		Frame f = new Frame("Menu 실습");
		f.setSize(300,200);
		
		MenuBar mb = new MenuBar();
		
		Menu mSearch = new Menu("검색");
		MenuItem mi찾기 = new MenuItem("찾기");
		MenuItem mi바꾸기 = new MenuItem("바꾸기");
		
		Menu 표식 = new Menu("표식");
		//MenuItem 표식설정 = new MenuItem("표식/설정해제");
		CheckboxMenuItem 표식설정 = new CheckboxMenuItem("표식설정/해제");
		MenuItem 다음표식 = new MenuItem("다음표식으로");
		
		mSearch.add(mi찾기);
		mSearch.add(mi바꾸기);
		mSearch.addSeparator();
		mSearch.add(표식);
		
		표식.add(표식설정);
		표식.add(다음표식);
		
		Menu 도구 = new Menu("도구");
		Menu 창 = new Menu("창");
		Menu 도움말 = new Menu("도움말");
		
		mb.add(mSearch);
		mb.add(도구);
		mb.add(창);
		mb.add(도움말);
		

		f.setMenuBar(mb);
		
		f.setVisible(true);

	}

}
