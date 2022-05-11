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
			{"1","ȫ�浿","����"},
			{"2","��浿","���"},
			{"3","�̱浿","��õ"},
			{"4","�ڱ浿","����"}		
	};
	String[] colNames= {"��ȣ","�̸�","�ּ�"};
		
	public TableTest2() {
		super("table ����2");
		
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
