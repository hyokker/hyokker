package com.swing.day1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.pd.model.PdDAO;
import com.pd.model.PdDTO;

public class GUIMain1 extends JFrame implements ActionListener{
	JLabel lbNo, lbPdName, lbPrice;
	JTextField tfNo, tfPdName, tfPrice;
	JTable table;
	JScrollPane scrollPane;
	JPanel plNorth, plSouth;
	JButton btAdd, btEdit, btDel, btSearch, btAll, btCancel;
	DefaultTableModel model=new DefaultTableModel();
	PdDAO pdDao;
	String[] colNames= {"��ȣ","��ǰ��","����","�����"};

	public GUIMain1() {
		super("��ǰ ����");
		pdDao=new PdDAO();

		init();
		addEvent();
	}

	private void init() {
		lbNo=new JLabel("��ȣ");
		lbPdName=new JLabel("��ǰ��");
		lbPrice=new JLabel("����");

		tfNo=new JTextField(10);
		tfPdName=new JTextField(10);
		tfPrice=new JTextField(10);
		tfNo.setEditable(false);

		plNorth=new JPanel();
		plSouth=new JPanel();

		plNorth.add(lbNo);
		plNorth.add(tfNo);
		plNorth.add(lbPdName);
		plNorth.add(tfPdName);
		plNorth.add(lbPrice);
		plNorth.add(tfPrice);

		add(plNorth, "North");

		btAdd=new JButton("�Է�");
		btEdit=new JButton("����");
		btDel=new JButton("����");
		btSearch=new JButton("�˻�");
		btAll=new JButton("��ü��ȸ");
		btCancel=new JButton("���");

		plSouth.add(btAdd);
		plSouth.add(btEdit);
		plSouth.add(btDel);
		plSouth.add(btSearch);
		plSouth.add(btAll);
		plSouth.add(btCancel);

		add(plSouth, "South");

		table=new JTable();
		scrollPane=new JScrollPane();

		model.addColumn("��ȣ");
		model.addColumn("��ǰ��");
		model.addColumn("����");
		model.addColumn("�����");

		table.setModel(model);
		table.getTableHeader().setReorderingAllowed(false);
		table.setRowHeight(20);

		scrollPane.setViewportView(table);
		add(scrollPane);

		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			showAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void addEvent() {
		btAdd.addActionListener(this);
		btEdit.addActionListener(this);
		btDel.addActionListener(this);
		btSearch.addActionListener(this);
		btAll.addActionListener(this);
		btCancel.addActionListener(this);

		table.addMouseListener(new EventHandler());
	}

	class EventHandler extends MouseAdapter{

		@Override
		public void mousePressed(MouseEvent e) {
			int row=table.getSelectedRow();
			System.out.println("���õ� row=" + row);

			for(int i=0;i<3;i++) {
				//Object getValueAt(int row, int column)
				Object obj=table.getValueAt(row, i);
				String str=obj.toString();

				switch(i) {
				case 0: //0��
					tfNo.setText(str);
					break;
				case 1: //1��
					tfPdName.setText(str);
					break;
				case 2: //2��
					tfPrice.setText(str);
					break;						
				}
			}//for
		}

	}

	private void showAll() throws SQLException {
		//1.
		//2
		List<PdDTO> list=pdDao.selectAll();
		if(list==null || list.isEmpty()) {
			JOptionPane.showMessageDialog(this, "�����Ͱ� �����ϴ�.");
			return;
		}

		//3.		
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
		GUIMain1 f = new GUIMain1();
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if(e.getSource()==btAll) {
				showAll();
			}else if(e.getSource()==btAdd) {
				addData();
				clear_tf();
			}else if(e.getSource()==btDel) {
				deleteData();							
			}else if(e.getSource()==btSearch) {
				searchData();							
			}//if
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

	private void searchData() throws NumberFormatException, SQLException {
		//1
		String no=tfNo.getText();

		if(no==null || no.isEmpty()){
			JOptionPane.showMessageDialog(this,"�˻��� ��ȣ�� ����");

			return;
		}

		//2
		PdDTO dto=pdDao.selectByNo(Integer.parseInt(no));

		//3
		String[][] data=new String[1][4];
		data[0][0]=dto.getNo()+"";
		data[0][1]=dto.getPdName();
		data[0][2]=dto.getPrice()+"";
		data[0][3]=dto.getRegdate()+"";

		model.setDataVector(data, colNames);
		table.setModel(model);
	}


	private void deleteData() throws NumberFormatException, SQLException {
		//1
		String no=tfNo.getText();
		if(no==null || no.isEmpty()) {
			JOptionPane.showMessageDialog(this, "������ ��ȣ�� �����ϼ���");
			return;
		}

		int type
		=JOptionPane.showConfirmDialog(this, no+"�� ��ǰ�� �����Ͻðڽ��ϱ�?", 
				"����",JOptionPane.YES_NO_OPTION);

		//2
		String msg="";
		if(type==JOptionPane.YES_OPTION) {
			int cnt=pdDao.deletePd(Integer.parseInt(no));
			//3
			if(cnt>0) {
				msg="���� ����";
				showAll();
				clear_tf();	
			}else {
				msg="���� ����";				
			}
			JOptionPane.showMessageDialog(this, msg);
		}

	}

	private void addData() throws SQLException {
		//1.
		String pdName=tfPdName.getText();
		String price=tfPrice.getText();

		//��ȿ�� �˻�
		if(pdName==null || pdName.isEmpty()) {
			JOptionPane.showMessageDialog(this, "�̸� �Է��ϼ���");
			return;
		}

		//2.
		PdDTO dto = new PdDTO();
		dto.setPdName(pdName);
		dto.setPrice(Integer.parseInt(price));
		int cnt=pdDao.insertPd(dto);

		//3
		String msg="";
		if(cnt>0) {
			msg="��� ����";
		}else {
			msg="��� ����";			
		}

		JOptionPane.showMessageDialog(this, msg);
		showAll();
	}

	private void clear_tf() {
		tfNo.setText("");
		tfPdName.setText("");
		tfPrice.setText("");

	}

}
