package com.swing.day1;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class Test0408 extends JFrame {
	JTable table;
	JScrollPane scrollpane;
	JButton bt;
	DefaultTableModel model = new DefaultTableModel();
	String data[][]={{"1","ȫ�浿","010-100-2000"},
					{"2","�迬��","010-200-5000"},
					{"3","����","010-300-7000"}};
	
	String colNames[]= {"��ȣ","�̸�","�ּ�"};
	
	public Test0408() {
		super("table ����");
		
		table = new JTable();
		scrollpane = new JScrollPane();
		bt = new JButton("��ȸ");
		
		model.setDataVector(data, colNames);
		table.setModel(model);
		
		setSize(300,300);
		setLayout(new BorderLayout());
		add(scrollpane,"Center");
		
		add(bt,"South");
		
		addEvent();
	}
	private void addEvent() {
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==bt) {
					scrollpane.setViewportView(table);
				}
			}
		});
	}
	public static void main(String[] args) {
		Test0408 f=  new Test0408();
		f.setVisible(true);
	}

}
