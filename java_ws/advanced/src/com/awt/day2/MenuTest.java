package com.awt.day2;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MenuTest {

	public static void main(String[] args) {
		Frame f = new Frame("Menu");
		f.setSize(300, 200);
		
		MenuBar mb = new MenuBar();
		Menu mFile = new Menu("File");
		
		MenuItem miNew = new MenuItem("New");
		MenuItem miOpen = new MenuItem("Open");
		Menu mOthers = new Menu("Others");
		MenuItem miExit=new MenuItem("Exit");
		
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(mOthers);
		mFile.addSeparator(); //메뉴 분리선
		mFile.add(miExit);
		
		MenuItem miPrint = new MenuItem("Print...");
		MenuItem miPreview = new MenuItem("Print Preview");
		MenuItem miSetup = new MenuItem("Print setup...");
		mOthers.add(miPrint);
		mOthers.add(miPreview);
		mOthers.add(miSetup);
		
		Menu mEdit=new Menu("Edit");
		Menu mView=new Menu("View");
		Menu mHelp=new Menu("Help");
		CheckboxMenuItem miStatus = new CheckboxMenuItem("Statusbar");
		mView.add(miStatus);
		
		mb.add(mFile);
		mb.add(mEdit);
		mb.add(mView);
		mb.setHelpMenu(mHelp);
		
		f.setMenuBar(mb);
		f.setVisible(true);
	}

}
