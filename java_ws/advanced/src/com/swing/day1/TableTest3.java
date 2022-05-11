package com.swing.day1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.pd.model.PdDAO;
import com.pd.model.PdDTO;

public class TableTest3 extends JFrame{
	JTable table;
	JScrollPane scrollPane;
	JButton bt;
	DefaultTableModel model = new DefaultTableModel();
	
	public TableTest3() {
		super("table ����3");
		
		bt=new JButton("��ȸ");
		table=new JTable();
		scrollPane=new JScrollPane();
		
		model.addColumn("��ȣ");
		model.addColumn("��ǰ��");
		model.addColumn("����");
		model.addColumn("�����");
		
		table.setModel(model);
		table.getTableHeader().setBackground(Color.black);
		table.getTableHeader().setForeground(Color.yellow);
		table.getTableHeader().setReorderingAllowed(false);
		table.setRowHeight(20);
		
		scrollPane.setViewportView(table);
		this.add(scrollPane,"Center");
		this.add(bt, "North");
		
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		bt.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					showData();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
	}
	
	protected void showData() throws SQLException {
		//1.
		
		//2.
		PdDAO dao = new PdDAO();
		List<PdDTO> list=dao.selectAll();
		
		//3.
		String[] colNames= {"��ȣ","��ǰ��","����","�����"};
		String[][] data=new String[list.size()][4];
		
		for(int i=0;i<data.length;i++) {
			PdDTO dto=list.get(i);
			data[i][0]=dto.getNo()+"";
			data[i][1]=dto.getPdName();
			data[i][2]=dto.getPrice()+"";
			data[i][3]=dto.getRegdate()+"";			
		}
		
		model.setDataVector(data, colNames);
		table.setModel(model);
	}

	public static void main(String[] args) {
		TableTest3 f = new TableTest3();
		f.setVisible(true);
	}

}
