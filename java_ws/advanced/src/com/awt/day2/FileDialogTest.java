package com.awt.day2;

import java.awt.FileDialog;
import java.awt.Frame;

public class FileDialogTest {

	public static void main(String[] args) {
		Frame f = new Frame("Parent");
		f.setSize(300, 200);
		
		FileDialog fOpen = new FileDialog(f, "���� ����", FileDialog.SAVE);
		
		f.setVisible(true);
		
		fOpen.setDirectory("C:\\lecture");
		fOpen.setVisible(true);
		
		System.out.println(fOpen.getDirectory()+fOpen.getFile());
		//��� ��ư�� ������ null�� ����
	}

}
