package com.swing.day1;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableTest1 extends JFrame {
	JScrollPane scrollPane;
	JTable table;  //view
	String data[][]= {  //model
		{"1","ȫ�浿","����"},
		{"2","��浿","���"},
		{"3","�̱浿","��õ"},
		{"4","�ڱ浿","����"}		
	};
	String[] colNames= {"��ȣ","�̸�","�ּ�"};
	
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
