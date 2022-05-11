package com.swing.day1;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TableTest2 extends JFrame{
	JScrollPane scrollPane;
	JTable table;
	DefaultTableModel model = new DefaultTableModel();
	
	String data[][]= {  
			{"1","홍길동","서울"},
			{"2","김길동","경기"},
			{"3","이길동","인천"},
			{"4","박길동","대전"}		
	};
	String[] colNames= {"번호","이름","주소"};
		
	public TableTest2() {
		super("table 예제2");
		
		table=new JTable();
		scrollPane=new JScrollPane(table);
		
		//setDataVector(Object[][] dataVector, Object[] columnIdentifiers)
		model.setDataVector(data, colNames);
		table.setModel(model);
		
		add(scrollPane);
		
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		TableTest2 f = new TableTest2();
		f.setVisible(true);
	}

}
