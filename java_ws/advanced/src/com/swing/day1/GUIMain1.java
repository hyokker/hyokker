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
	String[] colNames= {"번호","상품명","가격","등록일"};

	public GUIMain1() {
		super("상품 관리");
		pdDao=new PdDAO();

		init();
		addEvent();
	}

	private void init() {
		lbNo=new JLabel("번호");
		lbPdName=new JLabel("상품명");
		lbPrice=new JLabel("가격");

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

		btAdd=new JButton("입력");
		btEdit=new JButton("수정");
		btDel=new JButton("삭제");
		btSearch=new JButton("검색");
		btAll=new JButton("전체조회");
		btCancel=new JButton("취소");

		plSouth.add(btAdd);
		plSouth.add(btEdit);
		plSouth.add(btDel);
		plSouth.add(btSearch);
		plSouth.add(btAll);
		plSouth.add(btCancel);

		add(plSouth, "South");

		table=new JTable();
		scrollPane=new JScrollPane();

		model.addColumn("번호");
		model.addColumn("상품명");
		model.addColumn("가격");
		model.addColumn("등록일");

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
			System.out.println("선택된 row=" + row);

			for(int i=0;i<3;i++) {
				//Object getValueAt(int row, int column)
				Object obj=table.getValueAt(row, i);
				String str=obj.toString();

				switch(i) {
				case 0: //0열
					tfNo.setText(str);
					break;
				case 1: //1열
					tfPdName.setText(str);
					break;
				case 2: //2열
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
			JOptionPane.showMessageDialog(this, "데이터가 없습니다.");
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
			JOptionPane.showMessageDialog(this,"검색할 번호를 선택");

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
			JOptionPane.showMessageDialog(this, "삭제할 번호를 선택하세요");
			return;
		}

		int type
		=JOptionPane.showConfirmDialog(this, no+"번 상품을 삭제하시겠습니까?", 
				"삭제",JOptionPane.YES_NO_OPTION);

		//2
		String msg="";
		if(type==JOptionPane.YES_OPTION) {
			int cnt=pdDao.deletePd(Integer.parseInt(no));
			//3
			if(cnt>0) {
				msg="삭제 성공";
				showAll();
				clear_tf();	
			}else {
				msg="삭제 실패";				
			}
			JOptionPane.showMessageDialog(this, msg);
		}

	}

	private void addData() throws SQLException {
		//1.
		String pdName=tfPdName.getText();
		String price=tfPrice.getText();

		//유효성 검사
		if(pdName==null || pdName.isEmpty()) {
			JOptionPane.showMessageDialog(this, "이름 입력하세요");
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
			msg="등록 성공";
		}else {
			msg="등록 실패";			
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
