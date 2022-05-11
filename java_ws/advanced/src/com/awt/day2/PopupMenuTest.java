package com.awt.day2;

import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopupMenuTest {

	public static void main(String[] args) {
		Frame f = new Frame("Popup menu");
		f.setSize(300, 300);
		
		PopupMenu pMenu = new PopupMenu("Edit");
		MenuItem miCut=new PopupMenu("Cut");
		MenuItem miCopy=new PopupMenu("Copy");
		MenuItem miPaste=new PopupMenu("Paste");
		pMenu.add(miCut);
		pMenu.add(miCopy);
		pMenu.add(miPaste);
		
		f.add(pMenu);
		f.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				//������ ���콺��ư�� ������ ��쿡�� PopupMenu�� ȭ�鿡 �����ش�
				if(e.getModifiers()==e.BUTTON3_MASK) {
					pMenu.show(f, e.getX(), e.getY());
					//show(Component origin, int x, int y)
				}
			}
			
		});
		
		f.setVisible(true);
	}

}
