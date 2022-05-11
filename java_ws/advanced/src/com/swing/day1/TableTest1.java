package com.swing.day1;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableTest1 extends JFrame {
	JScrollPane scrollPane;
	JTable table;  //view
	String data[][]= {  //model
		{"1","홍길동","서울"},
		{"2","김길동","경기"},
		{"3","이길동","인천"},
		{"4","박길동","대전"}		
	};
	String[] colNames= {"번호","이름","주소"};
	
	public TableTest1() {
		super("table test");
		
		//JTable(Object[][] rowData, Object[] columnNames)
		table=new JTable(data, colNames);
		scrollPane=new JScrollPane(table);
		add(scrollPane);
		
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		TableTest1 f = new TableTest1();
		f.setVisible(true);
	}

}
